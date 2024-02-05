package com.test.testapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Actors_Movies")
public class ActorMovie extends BaseEntity {
    @Column(nullable = false)
    public int ActorId;

    @Column(nullable = false)
    public int MovieId;
}
