package movie.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import movie.backend.entity.Detail;
import movie.backend.entity.Movie;
import movie.backend.repository.DetailRepository;
import movie.backend.repository.MovieRepository;

@RestController
public class Controller {
	@Autowired
	MovieRepository movieRepository;
	
	@Autowired
	DetailRepository detailRepository;
	
	@GetMapping("api/movie")
	public List<Movie> getMovie(){
		List<Movie> movie = movieRepository.findAll();
		return movie;
	}	
	
	@GetMapping("api/detail")
	public List<Detail> getDetail(){
		List<Detail> detail = detailRepository.findAll();
		return detail;
	}
	
}
