package com.marketingappDemo1.service;

import java.util.List;

import com.marketingappDemo1.entities.LeadDemo;

public interface LeadDemoService {
	
public void  saveLead(LeadDemo leadDemo);
	
public List<LeadDemo> getAllLeadDemo();

public void deleteByid(long id);

public LeadDemo updateByid(long id);
}
