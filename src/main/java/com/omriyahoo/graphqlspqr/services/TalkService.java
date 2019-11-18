package com.omriyahoo.graphqlspqr.services;

import com.omriyahoo.graphqlspqr.entities.Talk;
import com.omriyahoo.graphqlspqr.repos.TalkRepository;
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
public class TalkService {

    private final TalkRepository talkRepository;

    public TalkService(TalkRepository talkRepository) {
        this.talkRepository = talkRepository;
    }

    @GraphQLQuery(description = "Get all Talks")
    public List<Talk> getTalks() {
        return talkRepository.findAll();
    }

    @GraphQLQuery(description = "Get a Talk by ID")
    public Optional<Talk> getTalkById(@GraphQLArgument(name = "TalkId", description = "Talk ID to find") @GraphQLNonNull Long id) {
        return talkRepository.findById(id);
    }

    @GraphQLMutation(description = "Create new Talk")
    public Talk saveTalk(@GraphQLArgument(name = "Talk", description = "Talk Entity to save\\update") @GraphQLNonNull Talk talk) {
        return talkRepository.save(talk);
    }

    @GraphQLMutation(description = "Delete talk by ID")
    public void deleteTalkById(@GraphQLArgument(name = "TalkId", description = "Talk to remove by ID") @GraphQLNonNull Long id) {
        talkRepository.deleteById(id);
    }
}
