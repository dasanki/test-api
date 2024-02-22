package com.testapi.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testapi.entities.Actor;

@Repository
public interface BaseActorReposoitory extends JpaRepository<Actor, Integer> {

}
