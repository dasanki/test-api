package com.test.services.Interfaces;

import com.test.testapi.entities.GenreMovie;

public interface BaseGenreMovieServices {
    Iterable<GenreMovie> getAll();

    GenreMovie get(int id);

    int add(GenreMovie genremovie) throws Exception;

    void update(int id, GenreMovie genremovie) throws Exception;

    void delete(int id);
}
