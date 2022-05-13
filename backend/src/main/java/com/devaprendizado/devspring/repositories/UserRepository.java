package com.devaprendizado.devspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devaprendizado.devspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
	
}
