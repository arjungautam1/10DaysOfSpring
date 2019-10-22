package com.jpa.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jpa.demo.model.College;

public interface CollegeRepo extends CrudRepository<College,Integer> {

}
