package com.shoping.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoping.backend.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Integer>{
	MemberEntity findByEmailAndPassword(String email, String password);
}
