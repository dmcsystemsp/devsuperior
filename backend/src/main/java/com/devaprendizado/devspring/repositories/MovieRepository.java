package com.devaprendizado.devspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devaprendizado.devspring.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

	
}
