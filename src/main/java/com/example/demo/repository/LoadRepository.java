package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Load;

public interface LoadRepository extends JpaRepository<Load,Long>{
	List<Load> findByShipperId(String shipperId);
}
