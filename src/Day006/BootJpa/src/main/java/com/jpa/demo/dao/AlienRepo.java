package com.jpa.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien,Integer>{

}
