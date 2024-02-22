package com.testapi.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "Genres_Movies")
public class GenreMovie extends BaseEntity {
    @Column(nullable = false)
    public int GenreId;

    @Column(nullable = false)
    public int MovieId;
}
