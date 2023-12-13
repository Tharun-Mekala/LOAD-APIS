package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Load;
import com.example.demo.service.LoadService;

@RestController
public class LoadController {
	private LoadService loadService;
	
	public LoadController(LoadService loadService) {
		super();
		this.loadService = loadService;
	}
	
	@PostMapping("/load")
	public String saveload(@RequestBody Load load)
	{
		loadService.saveLoad(load);
		return "loads details added successfully ";
	}
	@GetMapping("/load")
	public List<Load> getAllLoad(@RequestParam String shipperId)
	{
		
		return loadService.getAllLoad(shipperId);
	}
	@GetMapping("/load/{loadId}")
	public Load getLoadById(@PathVariable Long loadId)
	{
		return loadService.getById(loadId);
	}
	
	@PutMapping("/load/{loadId}")
	public String updateLoad(@PathVariable Long loadId, @RequestBody Load updatedLoad)
	{
		try
		{
			loadService.updateLoad(loadId, updatedLoad);
			return "Loads details updated Sucessfully";
		}
		catch(Exception e)
		{
			return "Loads details with given ID is not founded";
		}
	}
	@DeleteMapping("load/{loadId}")
	public String deleteLoad(@PathVariable Long loadId)
	{
		try
		{
			loadService.deleteLoad(loadId);
			return "Loads details deleted Sucessfully";
		}
		catch(Exception e)
		{
			return "Loads details with given ID is not founded";
		}
	}
}
