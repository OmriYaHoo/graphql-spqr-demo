package com.omriyahoo.graphqlspqr.services;

import com.omriyahoo.graphqlspqr.entities.Talk;
import com.omriyahoo.graphqlspqr.repos.TalkRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TalkService {

    private final TalkRepository talkRepository;

    public TalkService(TalkRepository talkRepository) {
        this.talkRepository = talkRepository;
    }

    public List<Talk> getTalks() {
        return talkRepository.findAll();
    }

    public Optional<Talk> getTalkById(Long id) {
        return talkRepository.findById(id);
    }

    public Talk saveTalk(Talk talk) {
        return talkRepository.save(talk);
    }

    public void deleteTalks(Long id) {
        talkRepository.deleteById(id);
    }
}
