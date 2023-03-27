package com.example.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.entity.MovieEntity;
@Repository
public interface MovieRepository extends JpaRepository<MovieEntity, Integer>{
}
