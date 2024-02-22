package com.testapi.services.interfaces;

import com.testapi.entities.GenreMovie;

public interface BaseGenreMovieService {
    Iterable<GenreMovie> getAll();

    GenreMovie get(int id);

    int add(GenreMovie genremovie) throws Exception;

    void update(int id, GenreMovie genremovie) throws Exception;

    void delete(int id);
}
