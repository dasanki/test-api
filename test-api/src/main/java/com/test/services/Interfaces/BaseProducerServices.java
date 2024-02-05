package com.test.services.Interfaces;

import com.test.testapi.entities.Producer;

public interface BaseProducerServices {
    Iterable<Producer> getAll();

    Producer get(int id);

    int add(Producer producer) throws Exception;

    void update(int id, Producer producer) throws Exception;

    void delete(int id);
}
