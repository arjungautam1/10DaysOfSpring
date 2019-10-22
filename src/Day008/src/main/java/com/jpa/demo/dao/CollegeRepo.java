package com.jpa.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.jpa.demo.model.College;

public interface CollegeRepo extends CrudRepository<College,Integer> {
	//List<College> findByCAddress(String address);
	List<College>findByCname(String cname);
	List<College>findByCidGreaterThan(int cid);
//	@Query("from college where cname=?1 order by caddress")
//	List<College>findByCnameSorted(String cname);

}
