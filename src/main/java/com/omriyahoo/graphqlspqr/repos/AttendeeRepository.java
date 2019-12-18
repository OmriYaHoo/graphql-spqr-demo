package com.omriyahoo.graphqlspqr.repos;

import com.omriyahoo.graphqlspqr.entities.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendeeRepository extends JpaRepository<Attendee, Long> {
}
