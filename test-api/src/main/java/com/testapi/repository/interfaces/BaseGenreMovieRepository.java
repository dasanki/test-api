package com.testapi.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testapi.entities.GenreMovie;

@Repository
public interface BaseGenreMovieRepository extends JpaRepository<GenreMovie, Integer> {

}
