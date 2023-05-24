package com.marketingappDemo1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingappDemo1.entities.LeadDemo;
import com.marketingappDemo1.repositories.LeadDemoRepository;


@Service
public class LeadDemoServiceImpl implements LeadDemoService {
	@Override
	public LeadDemo updateByid(long id) {
		Optional<LeadDemo> f = leadRepo.findById(id) ;
		return f.get();
	}


	@Autowired
    LeadDemoRepository leadRepo;
	
	
	@Override
	public void saveLead(LeadDemo leadDemo) {
		leadRepo.save(leadDemo);
		

	}


	@Override
	public List<LeadDemo> getAllLeadDemo() {
		List<LeadDemo> demo = leadRepo.findAll();
		return demo;
	}


	@Override
	public void deleteByid(long id) {
		leadRepo.deleteById(id);
		
	}


	

}
