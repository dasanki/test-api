package com.test.services.Interfaces;

import com.test.testapi.entities.MovieProducer;

public interface BaseMovieProducerServices {
    Iterable<MovieProducer> getAll();

    MovieProducer get(int id);

    int add(MovieProducer movieproducer) throws Exception;

    void update(int id, MovieProducer movieproducer) throws Exception;

    void delete(int id);
}
