package com.shoping.backend.controller;

import java.util.Map;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.shoping.backend.entity.MemberEntity;
import com.shoping.backend.repository.MemberRepository;
import com.shoping.backend.service.JwtService;
import com.shoping.backend.service.JwtServiceImpl;

import io.jsonwebtoken.Claims;

@RestController
public class AccountController {
	
	@Autowired
	MemberRepository memberRepository;
	
	@Autowired
	JwtService jwtService;
	
	@PostMapping("/api/account/login")
	public ResponseEntity login(@RequestBody Map<String, String> params,
			HttpServletResponse res) {
		MemberEntity member =  memberRepository.findByEmailAndPassword(params.get("email"),params.get("password"));
		if(member != null) {
			int id = member.getId();
			String token = jwtService.getToken("id", id);
			Cookie cookie = new Cookie("token", token);
			cookie.setHttpOnly(true);
			cookie.setPath("/");
			res.addCookie(cookie);
			return new ResponseEntity<>(id,HttpStatus.OK);
			
		}
		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	}
	@GetMapping("/api/account/check")
	public ResponseEntity check(@CookieValue(value="token",required = false) String token) {
	 Claims claims	= jwtService.getClaims(token);
	 
	 if(claims != null) {
		 int id = Integer.parseInt(claims.get("id").toString());
		 return new ResponseEntity<>(id,HttpStatus.OK);
	 }
	 return new ResponseEntity<>(null,HttpStatus.OK);
		 
	}
	@PostMapping("/api/account/logout")
	public ResponseEntity logout(HttpServletResponse res) {
		Cookie cookie = new Cookie("token", null);
		cookie.setPath("/");
		cookie.setMaxAge(0);
		
		res.addCookie(cookie);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
