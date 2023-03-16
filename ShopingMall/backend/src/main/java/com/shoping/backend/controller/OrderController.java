package com.shoping.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.shoping.backend.dto.OrderDto;
import com.shoping.backend.entity.OrderEntity;
import com.shoping.backend.repository.OrderRepository;
import com.shoping.backend.service.JwtService;

@RestController
public class OrderController {
	
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	JwtService jwtService;
	
	@GetMapping("/api/orders")
	public ResponseEntity getOrder(
			@CookieValue(value = "token",required = false)String token) {
		if(!jwtService.isValid(token)) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);
		}
		List<OrderEntity> orders = orderRepository.findAll();
		
		return new ResponseEntity<>(orders,HttpStatus.OK);
	}
	
	@PostMapping("/api/orders")
	public ResponseEntity pushOrder(
			@RequestBody OrderDto dto,
			@CookieValue(value = "token",required = false)String token) {
		if(!jwtService.isValid(token)) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);
		}
		OrderEntity newOrder = new OrderEntity();
		newOrder.setMemberId(jwtService.getId(token));
		newOrder.setName(dto.getName());
		newOrder.setAddress(dto.getAddress());
		newOrder.setPayment(dto.getPayment());
		newOrder.setCardNumber(dto.getCardNumber());
		newOrder.setItems(dto.getItems());
		
		orderRepository.save(newOrder);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
