package com.marketingappDemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingappDemo1.dto.LeadDemoDto;
import com.marketingappDemo1.entities.LeadDemo;
import com.marketingappDemo1.service.LeadDemoService;
import com.marketingappDemo1.utilities.EmailSender;

@Controller
public class LeadDemoController {
	
	
	@Autowired
	private EmailSender sender;
	
	@Autowired
	LeadDemoService leadService;
	
	//http://localhost:8080/create
	@RequestMapping("/create")
	
	public String viewCreateLeadDemo() {
		return "Create_jspDemo";
		
	}
	
	@RequestMapping("/saveLeadDemo")
	public String saveLead(@ModelAttribute LeadDemo leadDemo ,Model model) {
		leadService.saveLead(leadDemo);
		sender.sendEmail(leadDemo.getEmail(), "Trial Message", "welcome");
		model.addAttribute("msg", "Record saved");
		return "Create_jspDemo";
	}
	
	
	//http://localhost:8080/ListAll
	@RequestMapping("/ListAll")
	public String getAllLeadDemo(Model model) {
		List<LeadDemo> demo = leadService.getAllLeadDemo();
		model.addAttribute("leaddemo", demo);
		return  "SearchDemo" ;
		
		
	}
	
	@RequestMapping("/delete")
	public String deleteByid(@RequestParam("id") long id , Model model) {
		leadService.deleteByid(id);
		List<LeadDemo> demo = leadService.getAllLeadDemo();
		model.addAttribute("leaddemo", demo);
		return  "SearchDemo" ;
		
		
	}
	
	
	@RequestMapping("/update")
	public String updateByid(@RequestParam("id") long id , Model model) {
		LeadDemo update = leadService.updateByid(id);
		model.addAttribute("update", update);
		return "UpdateDemo";
	}
	
	@RequestMapping("/UpdateDemo")
	public String UpdateLeadDemo(LeadDemoDto demoDto , Model model ) {
		LeadDemo d=new LeadDemo();
		d.setId(demoDto.getId());
		d.setFirstName(demoDto.getFirstName());
		d.setLastName(demoDto.getLastName());
		d.setEmail(demoDto.getEmail());
		d.setMobile(demoDto.getMobile());
		
		leadService.saveLead(d);
		
		List<LeadDemo> demo = leadService.getAllLeadDemo();
		model.addAttribute("leaddemo", demo);
		return  "SearchDemo" ;
		
	}
	
	
	
	

}
