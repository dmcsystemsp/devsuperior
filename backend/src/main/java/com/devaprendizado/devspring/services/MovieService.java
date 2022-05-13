package com.devaprendizado.devspring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devaprendizado.devspring.dto.MovieDTO;
import com.devaprendizado.devspring.entities.Movie;
import com.devaprendizado.devspring.repositories.MovieRepository;

@Service
public class MovieService {
	
	@Autowired 
	private MovieRepository repository;
	
	@Transactional(readOnly = true)
	public Page<MovieDTO> findAll(Pageable pageable) {
		
		Page<Movie> result = repository.findAll(pageable);
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public MovieDTO findById(Long Id) {
		
		Movie result = repository.findById(Id).get();
		MovieDTO dto = new MovieDTO(result);
		return dto;
	}
	
}
