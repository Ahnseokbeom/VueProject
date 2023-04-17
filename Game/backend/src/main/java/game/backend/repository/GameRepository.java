package game.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import game.backend.entity.Game;

public interface GameRepository extends JpaRepository<Game, Integer>{
	List<Game> findTop10ByOrderByRanking();
	List<Game> findTop10ByType(String type);
	List<Game> findByType(String type);
	List<Game> findTop10ByTypeOrType(String type1, String type2);
	List<Game> findByTypeOrType(String type1, String type2);
}
