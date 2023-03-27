package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.entity.MovieEntity;
import com.example.backend.repository.MovieRepository;

@RestController
public class MovieController {
	@Autowired
	MovieRepository movieRepository;
	
	@GetMapping("/api/movie")
	public List<MovieEntity> getMovies(){
		List<MovieEntity> movie = movieRepository.findAll();
		return movie;
	}
}
