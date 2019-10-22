package com.jpa.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.demo.model.College;

public interface CollegeRepo extends JpaRepository<College,Integer> {

}
