package com.test.services;

import org.springframework.stereotype.Service;

import com.test.services.Interfaces.BaseProducerService;
import com.test.testapi.entities.Producer;
import com.test.testapi.repository.interfaces.BaseProducerRepository;

@Service
public class ProducerService implements BaseProducerService {
    private BaseProducerRepository repository;

    @Override
    public Iterable<Producer> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    @Override
    public Producer get(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public int add(Producer producer) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public void update(int id, Producer producer) throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
