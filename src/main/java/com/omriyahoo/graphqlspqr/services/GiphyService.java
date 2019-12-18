package com.omriyahoo.graphqlspqr.services;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
@Slf4j
public class GiphyService {

    private RestTemplate rest = new RestTemplate();
    private final String GIPHY_BASE_URL = "http://api.giphy.com/v1/gifs/search?q=";
    private final String api_key = "&api_key=v2L2xKrotNXxkn4wSeK5PVRrD8XSiQui";
    private final String errorGif = "https://media.giphy.com/media/1RkDDoIVs3ntm/giphy.gif";

    public String getGiphyUrl(String subject) {
        Gson gson = new Gson();
        String giphyUrl = GIPHY_BASE_URL + subject + api_key;
        try {
            URI uri = UriComponentsBuilder.fromUriString(giphyUrl).build().encode().toUri();
            MultiValueMap<String, String> mvm = new LinkedMultiValueMap<>();
            ResponseEntity<String> res = rest.exchange(uri, HttpMethod.GET, new HttpEntity<>(mvm, null), String.class);
            JsonObject json = gson.fromJson(String.valueOf(res.getBody()), JsonObject.class);
            JsonArray data = json.getAsJsonArray("data");
            if (data == null || data.size() == 0) {
                return errorGif;
            }
            JsonObject images = ((JsonObject) data.get(0)).getAsJsonObject("images");
            JsonObject original = images.getAsJsonObject("original");
            return String.valueOf(original.getAsJsonPrimitive("url"));
        } catch (Throwable e) {
            log.error("error getting giphy url", e);
            return errorGif;
        }
    }
}
