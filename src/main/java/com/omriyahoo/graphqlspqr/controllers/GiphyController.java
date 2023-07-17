package com.omriyahoo.graphqlspqr.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.omriyahoo.graphqlspqr.services.GiphyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/giphy")
@RequiredArgsConstructor
public class GiphyController {

    private final GiphyService giphyService;

    @GetMapping(produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public Mono<byte[]> getGiphy() throws JsonProcessingException {
        return giphyService.downloadRandomGiphy();
    }

}
