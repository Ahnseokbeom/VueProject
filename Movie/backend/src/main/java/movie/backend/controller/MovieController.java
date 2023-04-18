package movie.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import movie.backend.entity.Movie;
import movie.backend.repository.MovieRepository;

@RestController
public class MovieController {
	@Autowired
	MovieRepository movieRepository;
	
	@GetMapping("api/movie")
	public List<Movie> getMovie(){
		List<Movie> movie = movieRepository.findAll();
		return movie;
	}
	
}
