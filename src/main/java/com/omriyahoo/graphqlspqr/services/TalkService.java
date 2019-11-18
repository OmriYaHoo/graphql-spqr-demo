package com.omriyahoo.graphqlspqr.services;

import com.omriyahoo.graphqlspqr.entities.Speaker;
import com.omriyahoo.graphqlspqr.repos.SpeakerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SpeakerService {

    private final SpeakerRepository speakerRepository;

    public SpeakerService(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    public List<Speaker> getSpeakers() {
        return speakerRepository.findAll();
    }

    public Optional<Speaker> getSpeakerById(Long id) {
        return speakerRepository.findById(id);
    }

    public Speaker saveSpeaker(Speaker speaker) {
        return speakerRepository.save(speaker);
    }

    public void deleteSpeakers(Long id) {
        speakerRepository.deleteById(id);
    }
}
