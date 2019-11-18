package com.omriyahoo.graphqlspqr.repos;

import com.omriyahoo.graphqlspqr.entities.Talk;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TalkRepository extends JpaRepository<Talk, Long> {
}
