package game.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import game.backend.entity.Game;

public interface GameRepository extends JpaRepository<Game, Integer>{
	List<Game> findTop10ByOrderByRanking();
}
