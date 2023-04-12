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
	@GetMapping("api/aos")
	public List<Game> getAos(){
		List<Game> aos = gameRepository.findTop10ByType("AOS");
		return aos;
	}
	@GetMapping("api/rpg")
	public List<Game> getRpg(){
		List<Game> rpg = gameRepository.findTop10ByType("RPG");
		return rpg;
	}
	@GetMapping("api/fps")
	public List<Game> getFps(){
		List<Game> fps = gameRepository.findTop10ByType("FPS");
		return fps;
	}
	@GetMapping("api/as")
	public List<Game> getActSpt(){
		List<Game> as = gameRepository.findTop10ByTypeOrType("스포츠","액션");
		return as;
	}
	@GetMapping("api/detailAos")
	public List<Game> getDetailAos(){
		List<Game> detail = gameRepository.findByType("AOS");
		return detail;
	}
	@GetMapping("api/detailRpg")
	public List<Game> getDetailRpg(){
		List<Game> detail = gameRepository.findByType("RPG");
		return detail;
	}
	@GetMapping("api/detailfps")
	public List<Game> getDetailFps(){
		List<Game> detail = gameRepository.findByType("FPS");
		return detail;
	}
	@GetMapping("api/detailAs")
	public List<Game> getDetailActSpt(){
		List<Game> detail = gameRepository.findByTypeOrType("스포츠","액션");
		return detail;
	}
	

}
