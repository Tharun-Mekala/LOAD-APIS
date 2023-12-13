package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Load;

public interface LoadService {
	public void saveLoad(Load load);
	public List<Load> getAllLoad(String shipperId);
	public void updateLoad(Long id,Load load);
	public void deleteLoad(Long Id);
	public Load getById(Long Id);
	
	
	
}
