package com.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name="movies")
public class Movie extends BaseEntity{
    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String plot;

    @Column(nullable = false)
    public Date Release;

    @Column(nullable = false)
    public float rating;
}
