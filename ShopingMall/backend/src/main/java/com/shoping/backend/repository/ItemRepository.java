package com.shoping.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoping.backend.entity.ItemEntity;

public interface ItemRepository extends JpaRepository<ItemEntity, Integer>{
	List<ItemEntity> findByIdIn(List<Integer> ids);
}
