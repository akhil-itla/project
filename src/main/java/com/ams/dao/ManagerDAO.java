package com.ams.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.ams.entity.Manager;
@Repository
public interface ManagerDAO extends CrudRepository<Manager, Integer>{
	
	public List<Manager> findAll();
	public Manager findByManagerId(int managerId);
	@Query( "FROM Manager where emailId =:username")
	public Manager checkManagerLogin(@Param("username")String emailId);
	@Query( "select managerId FROM Manager where emailId =:username")
	public int getManagerId(@Param("username")String username);
	
}
