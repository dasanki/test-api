package com.test.testapi.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.testapi.entities.ActorMovie;

@Repository
public interface BaseActorMovieRepository extends JpaRepository<ActorMovie, Integer> {

}
