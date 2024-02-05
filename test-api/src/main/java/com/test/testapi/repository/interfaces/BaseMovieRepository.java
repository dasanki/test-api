package com.test.testapi.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.testapi.entities.Movie;

@Repository
public interface BaseMovieRepository extends JpaRepository<Movie, Integer> {

}
