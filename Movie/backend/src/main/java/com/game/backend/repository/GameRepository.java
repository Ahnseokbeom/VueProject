package com.game.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.game.backend.entity.GameEntity;

public interface GameRepository extends JpaRepository<GameEntity, Integer>{
	
}
