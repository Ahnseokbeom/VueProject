package com.shoping.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoping.backend.entity.ItemEntity;
import com.shoping.backend.repository.ItemRepository;

@RestController
public class ItemController {
	
	@Autowired
	ItemRepository itemRepository;
	
	@GetMapping("/api/items")
	public List<ItemEntity> getItems(){
		List<ItemEntity> items = itemRepository.findAll();
		return items;
	}
}
