package com.routesms.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.routesms.jpa.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
	
	
	
	//user define method queries write here

}
