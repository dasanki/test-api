package com.testapi.services.interfaces;

import com.testapi.entities.MovieProducer;

public interface BaseMovieProducerService {
    Iterable<MovieProducer> getAll();

    MovieProducer get(int id);

    int add(MovieProducer movieproducer) throws Exception;

    void update(int id, MovieProducer movieproducer) throws Exception;

    void delete(int id);
}
