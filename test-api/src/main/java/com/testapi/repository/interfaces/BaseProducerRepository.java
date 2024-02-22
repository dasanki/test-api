package com.testapi.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testapi.entities.Producer;

@Repository
public interface BaseProducerRepository extends JpaRepository<Producer, Integer> {

}
