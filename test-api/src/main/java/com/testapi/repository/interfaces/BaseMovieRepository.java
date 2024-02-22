package com.testapi.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testapi.entities.Movie;

@Repository
public interface BaseMovieRepository extends JpaRepository<Movie, Integer> {

}
