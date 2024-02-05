package com.test.testapi.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.testapi.entities.Producer;

@Repository
public interface BaseProducerRepository extends JpaRepository<Producer, Integer> {

}
