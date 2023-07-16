package com.omriyahoo.graphqlspqr.services;

import com.omriyahoo.graphqlspqr.entities.Speaker;
import com.omriyahoo.graphqlspqr.entities.Talk;
import com.omriyahoo.graphqlspqr.repos.SpeakerRepository;
import com.omriyahoo.graphqlspqr.repos.TalkRepository;
import io.leangen.graphql.annotations.*;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@GraphQLApi
@Transactional
public class TalkService {

    private final TalkRepository talkRepository;
    private final SpeakerRepository speakerRepository;
    private final GiphyService giphyService;

    public TalkService(TalkRepository talkRepository, SpeakerRepository speakerRepository, GiphyService giphyService) {
        this.talkRepository = talkRepository;
        this.speakerRepository = speakerRepository;
        this.giphyService = giphyService;
    }

    @GraphQLQuery(name = "getAllTalks", description = "Get all Talks")
    public List<Talk> getTalks() {
        return talkRepository.findAll();
    }

    @GraphQLQuery(name = "countTalks", description = "Get all Talks")
    public Long sizeTalks() {
        return talkRepository.count();
    }

    @GraphQLQuery(description = "Get a Talk by ID")
    public Optional<Talk> getTalkById(@GraphQLArgument(name = "TalkId", description = "Talk ID to find") @GraphQLNonNull Long id) {
        return talkRepository.findById(id);
    }

    @GraphQLMutation(description = "Create new Talk")
    public Talk saveTalk(@GraphQLArgument(name = "Talk", description = "Talk Entity to save\\update") @GraphQLNonNull Talk talk) {
        Optional<Speaker> optionalSpeaker = speakerRepository.findById(talk.getSpeaker().getId());
        talk.setSpeaker(optionalSpeaker.orElseThrow(() -> new RuntimeException("Error getting speaker by ID")));
        return talkRepository.save(talk);
    }

    @GraphQLMutation(description = "Delete talk by ID")
    public void deleteTalkById(@GraphQLArgument(name = "TalkId", description = "Talk to remove by ID") @GraphQLNonNull Long id) {
        talkRepository.deleteById(id);
    }

    @GraphQLQuery
    public String getGiphyUrl(@GraphQLContext Talk talk) {
        return giphyService.getGiphyUrl(talk.getSubject());
    }

}
