package com.springcrudexample.springcrud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//If we use this lombok annotation we don't need to manually put setters and getters
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="studenttable")

public class Student {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private int registrationNumber;

}
