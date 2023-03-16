package com.shoping.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoping.backend.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer>{

}
