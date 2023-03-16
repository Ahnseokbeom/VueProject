package com.shoping.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoping.backend.entity.CartEntity;

public interface CartRepository extends JpaRepository<CartEntity, Integer>{
	List<CartEntity> findByMemberId(int memberId);
	
	CartEntity findByMemberIdAndItemId(int memberId, int itemId);
}
