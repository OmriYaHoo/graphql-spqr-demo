package com.omriyahoo.graphqlspqr.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
@Slf4j
@RequiredArgsConstructor
public class GiphyService {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final RestTemplate rest = new RestTemplate();

    private final String apiKey = "v2L2xKrotNXxkn4wSeK5PVRrD8XSiQui";

    public Mono<byte[]> downloadRandomGiphy() throws JsonProcessingException {
        final int size = 16 * 1024 * 1024;
        final ExchangeStrategies strategies = ExchangeStrategies.builder()
                .codecs(codecs -> codecs.defaultCodecs().maxInMemorySize(size))
                .build();
        WebClient client = WebClient.builder()
                .baseUrl("https://api.giphy.com/v1/gifs/")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .exchangeStrategies(strategies)
                .build();

        String endpoint = "random";
        String tag = "";
        String rating = "g";

        String htmlResponse = client.get()
                .uri(uriBuilder -> uriBuilder
                        .path(endpoint)
                        .queryParam("api_key", apiKey)
                        .queryParam("tag", tag)
                        .queryParam("rating", rating)
                        .build())
                .retrieve()
                .bodyToMono(String.class)
                .block();
        log.debug("Giphy API response: {}", htmlResponse);

        JsonNode jsonNode = objectMapper.readTree(htmlResponse);
        String gifWrapUrl = jsonNode.get("data").get("url").asText();

        String gifUrlResponse = client.get()
                .uri(gifWrapUrl)
                .retrieve()
                .bodyToMono(String.class)
                .block();
        log.debug("gifUrl response: {}", gifUrlResponse);


        String patternString = "https:\\/\\/media\\d+\\.giphy\\.com.*?\\.gif";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(Objects.requireNonNull(gifUrlResponse));

        String result = "";
        while (matcher.find()) {
            String randomGifUrl = matcher.group(0);
            log.debug("random gif url: {}", randomGifUrl);
            if (StringUtils.hasText(randomGifUrl)) {
                result = randomGifUrl;
                break;
            }

        }


        return client.get()
                .uri(result)
                .accept(MediaType.APPLICATION_OCTET_STREAM)
                .retrieve()
                .bodyToMono(byte[].class);
    }

    public String getGiphyUrlBySubject(String subject) {
        Gson gson = new Gson();
        String giphyBaseUrl = "http://api.giphy.com/v1/gifs/search?q=";
        String giphyUrl = giphyBaseUrl + subject + apiKey;
        String errorGif = "https://media.giphy.com/media/1RkDDoIVs3ntm/giphy.gif";
        try {
            URI uri = UriComponentsBuilder.fromUriString(giphyUrl).build().encode().toUri();
            MultiValueMap<String, String> mvm = new LinkedMultiValueMap<>();
            ResponseEntity<String> res = rest.exchange(
                    uri,
                    HttpMethod.GET,
                    new HttpEntity<>(mvm, null),
                    String.class);
            JsonObject json = gson.fromJson(String.valueOf(res.getBody()), JsonObject.class);
            JsonArray data = json.getAsJsonArray("data");
            if (data == null || data.size() == 0) {
                return errorGif;
            }
            JsonObject images = ((JsonObject) data.get(0)).getAsJsonObject("images");
            JsonObject original = images.getAsJsonObject("original");
            return String.valueOf(original.getAsJsonPrimitive("url"));
        } catch (Exception e) {
            log.error("error getting giphy url", e);
            return errorGif;
        }
    }
}
