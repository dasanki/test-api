package com.testapi.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testapi.entities.ActorMovie;

@Repository
public interface BaseActorMovieRepository extends JpaRepository<ActorMovie, Integer> {

}
