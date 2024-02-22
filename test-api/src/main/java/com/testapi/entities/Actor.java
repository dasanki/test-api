package com.testapi.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "actors")
public class Actor extends BaseEntity {
   @Column(nullable = false)
   public String name;

   @Column(name = "Dob", nullable = false)
   public Date dateOfBirth;

   @Column(nullable = false)
   public String Bio;
}
