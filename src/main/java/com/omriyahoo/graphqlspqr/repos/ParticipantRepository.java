package com.omriyahoo.graphqlspqr.repos;

import com.omriyahoo.graphqlspqr.entities.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
