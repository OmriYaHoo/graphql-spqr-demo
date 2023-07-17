package com.omriyahoo.graphqlspqr.controllers;

import com.omriyahoo.graphqlspqr.entities.Speaker;
import com.omriyahoo.graphqlspqr.repos.SpeakerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/speakers")
@RequiredArgsConstructor
public class SpeakersController {

    private final SpeakerRepository speakerRepository;

    @GetMapping
    public List<Speaker> getSpeakers() {
        return speakerRepository.findAll();
    }

}
