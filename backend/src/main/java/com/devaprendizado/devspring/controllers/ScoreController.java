package com.devaprendizado.devspring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devaprendizado.devspring.dto.MovieDTO;
import com.devaprendizado.devspring.dto.ScoreDTO;
import com.devaprendizado.devspring.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){
		
		MovieDTO movieDTO = service.saveScore(dto);
		return movieDTO;
		
	}
}
