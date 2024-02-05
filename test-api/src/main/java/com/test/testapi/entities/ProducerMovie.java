package com.test.testapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Producers_Movies")
public class ProducerMovie extends BaseEntity {
    @Column(nullable = false)
    public int ProducerId;

    @Column(nullable = false)
    public int MovieId;
}
