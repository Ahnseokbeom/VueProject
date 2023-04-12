package game.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import game.backend.entity.Game;
import game.backend.repository.GameRepository;
@RestController
public class GameController {
	@Autowired
	GameRepository gameRepository;
	
	@GetMapping("/api/game")
	public List<Game> getGame(){
		List<Game> items = gameRepository.findAll();
		return items;
	}
	
	@GetMapping("api/rank")
	public List<Game> getRank(){
		List<Game> rank = gameRepository.findTop10ByOrderByRanking();
		return rank;
	}

}
