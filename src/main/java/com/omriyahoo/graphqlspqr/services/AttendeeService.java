package com.omriyahoo.graphqlspqr.services;

import com.omriyahoo.graphqlspqr.entities.Attendee;
import com.omriyahoo.graphqlspqr.repos.AttendeeRepository;
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
public class AttendeeService {

    private final AttendeeRepository attendeeRepository;

    public AttendeeService(AttendeeRepository attendeeRepository) {
        this.attendeeRepository = attendeeRepository;
    }

    @GraphQLQuery(description = "Get all attendees")
    public List<Attendee> getAttendees() {
        return attendeeRepository.findAll();
    }

    @GraphQLQuery(description = "Get attendee by ID")
    public Optional<Attendee> getAttendeeById(@GraphQLArgument(name = "AttendeeId", description = "Attendee ID to find") @GraphQLNonNull Long id) {
        return attendeeRepository.findById(id);
    }

    @GraphQLMutation(description = "Create new attendee")
    public Attendee saveAttendee(@GraphQLArgument(name = "Attendee", description = "Attendee Entity to save\\update") @GraphQLNonNull Attendee attendee) {
        return attendeeRepository.save(attendee);
    }

    @GraphQLMutation(description = "Delete an attendee by ID")
    public void deleteAttendeeById(@GraphQLArgument(name = "AttendeeId", description = "Attendee to remove by ID") @GraphQLNonNull Long id) {
        attendeeRepository.deleteById(id);
    }
}
