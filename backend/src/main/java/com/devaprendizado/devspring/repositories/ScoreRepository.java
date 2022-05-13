package com.devaprendizado.devspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devaprendizado.devspring.entities.Score;
import com.devaprendizado.devspring.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

	
}
