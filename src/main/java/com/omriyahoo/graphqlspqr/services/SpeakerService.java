package com.omriyahoo.graphqlspqr.services;

import com.omriyahoo.graphqlspqr.entities.Speaker;
import com.omriyahoo.graphqlspqr.repos.SpeakerRepository;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLNonNull;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@GraphQLApi
@Transactional
public class SpeakerService {

    private final SpeakerRepository speakerRepository;

    public SpeakerService(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @GraphQLQuery(description = "Get all speakers")
    public List<Speaker> getSpeakers() {
        return speakerRepository.findAll();
    }

    @GraphQLQuery(description = "Get a speaker by ID")
    public Optional<Speaker> getSpeakerById(@GraphQLArgument(name = "SpeakerId", description = "Speaker ID to find") @GraphQLNonNull Long id) {
        return speakerRepository.findById(id);
    }

    @GraphQLMutation(description = "Create new speaker")
    public Speaker saveSpeaker(@GraphQLArgument(name = "Speaker", description = "Speaker Entity to save\\update") @GraphQLNonNull Speaker speaker) {
        return speakerRepository.save(speaker);
    }

    @GraphQLMutation(description = "Delete a speaker by ID")
    public void deleteSpeakerById(@GraphQLArgument(name = "SpeakerId", description = "Speaker to remove by ID") @GraphQLNonNull Long id) {
        speakerRepository.deleteById(id);
    }
}
