package com.testapi.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testapi.entities.MovieProducer;

@Repository
public interface BaseMovieProducerRepository extends JpaRepository<MovieProducer, Integer> {

}
