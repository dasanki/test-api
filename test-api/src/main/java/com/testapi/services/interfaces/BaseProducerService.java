package com.testapi.services.interfaces;

import com.testapi.entities.Producer;

public interface BaseProducerService {
    Iterable<Producer> getAll();

    Producer get(int id);

    int add(Producer producer) throws Exception;

    void update(int id, Producer producer) throws Exception;

    void delete(int id);
}
