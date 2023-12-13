package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Load;
import com.example.demo.repository.LoadRepository;
import com.example.demo.service.LoadService;

@Service
public class LoadServiceImpl implements LoadService {

	private LoadRepository loadRepository;
	
	public LoadServiceImpl(LoadRepository loadRepository) {
		super();
		this.loadRepository = loadRepository;
	}

	@Override
	public void saveLoad(Load load) {
		loadRepository.save(load);
		
	}

	@Override
	public List<Load> getAllLoad(String shipperId) {
		return loadRepository.findByShipperId(shipperId);
	}

	@Override
	public void updateLoad(Long id,Load load) {
		Load ol=loadRepository.findById(id).get();
		if(load.getDate()!=null)
		ol.setDate(load.getDate());
		if(load.getLoadingPoint()!=null)
		ol.setLoadingPoint(load.getLoadingPoint());
		if(load.getNoOfTrucks()!=null)
		ol.setNoOfTrucks(load.getNoOfTrucks());
		if(load.getComment()!=null)
		ol.setComment(load.getComment());
		if(load.getProductType()!=null)
		ol.setProductType(load.getProductType());
		if(load.getShipperId()!=null)
		ol.setShipperId(load.getShipperId());
		if(load.getTruckType()!=null)
		ol.setTruckType(load.getTruckType());
		if(load.getUnloadingPoint()!=null)
		ol.setUnloadingPoint(load.getUnloadingPoint());
		if(load.getWeight()!=null)
		ol.setWeight(load.getWeight());
		loadRepository.save(ol);
		
	}

	@Override
	public void deleteLoad(Long Id) {
		loadRepository.deleteById(Id);
		
	}

	@Override
	public Load getById(Long Id) {
		return loadRepository.findById(Id).get();
	}

}
