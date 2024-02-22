package com.testapi.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testapi.entities.Genre;

@Repository
public interface BaseGenreRepository extends JpaRepository<Genre, Integer> {

}
