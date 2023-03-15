package com.shoping.backend.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.shoping.backend.entity.MemberEntity;
import com.shoping.backend.repository.MemberRepository;

@RestController
public class AccountController {
	
	@Autowired
	MemberRepository memberRepository;
	
	@PostMapping("/api/account/login")
	public int login(@RequestBody Map<String, String> params) {
		MemberEntity member =  memberRepository.findByEmailAndPassword(params.get("email"),params.get("password"));
		if(member != null) return member.getId();
		throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	}

}
