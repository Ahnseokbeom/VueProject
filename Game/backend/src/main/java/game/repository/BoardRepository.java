package game.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import game.entity.Board;
@Repository
public interface BoardRepository extends JpaRepository<Board, Integer>{

}
