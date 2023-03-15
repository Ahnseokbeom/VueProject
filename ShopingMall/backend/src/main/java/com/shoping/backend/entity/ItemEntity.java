package com.shoping.backend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Table(name="items")
@Entity
@Getter
public class ItemEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length=50, nullable=false)
	private String name;
	
	@Column(length=100)
	private String imgPath;
	
	@Column
	private int price;
	
	@Column
	private int discount;
}
