package com.testapi.services.interfaces;

import com.testapi.entities.Genre;

public interface BaseGenreService {
    Iterable<Genre> getAll();

    Genre get(int id);

    int add(Genre Genre) throws Exception;

    void update(int id, Genre Genre) throws Exception;

    void delete(int id);
}
