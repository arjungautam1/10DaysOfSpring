package com.jpa.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpa.demo.model.College;

public interface CollegeRepo extends CrudRepository<College,Integer> {

}
