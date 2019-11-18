package com.omriyahoo.graphqlspqr.services;

import com.omriyahoo.graphqlspqr.entities.Participant;
import com.omriyahoo.graphqlspqr.repos.ParticipantRepository;
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
public class ParticipantService {

    private final ParticipantRepository participantRepository;

    public ParticipantService(ParticipantRepository participantRepository) {
        this.participantRepository = participantRepository;
    }

    @GraphQLQuery(description = "Get all Participants")
    public List<Participant> getParticipants() {
        return participantRepository.findAll();
    }

    @GraphQLQuery(description = "Get a Participant by ID")
    public Optional<Participant> getParticipantById(@GraphQLArgument(name = "ParticipantId", description = "Participant ID to find") @GraphQLNonNull Long id) {
        return participantRepository.findById(id);
    }

    @GraphQLMutation(description = "Create new Participant")
    public Participant saveParticipant(@GraphQLArgument(name = "Participant", description = "Participant Entity to save\\update") @GraphQLNonNull Participant participant) {
        return participantRepository.save(participant);
    }

    @GraphQLMutation(description = "Delete a participant by ID")
    public void deleteParticipantById(@GraphQLArgument(name = "ParticipantId", description = "Participant to remove by ID") @GraphQLNonNull Long id) {
        participantRepository.deleteById(id);
    }
}
