package com.game.backend.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.backend.entity.GameEntity;
import com.game.backend.repository.GameRepository;

@RestController
public class GameController {
	@Autowired
	GameRepository gameRepository;
	
	@GetMapping("/api/game")
	public List<GameEntity> getGame(){
		List<GameEntity> items = gameRepository.findAll();
		return items;
	}
}
