package com.shoping.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoping.backend.entity.ItemEntity;

public interface ItemRepository extends JpaRepository<ItemEntity, Integer>{

}
