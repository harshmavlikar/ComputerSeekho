package com.vidyanidhi.computerseekho.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vidyanidhi.computerseekho.entities.Enquiry;
import com.vidyanidhi.computerseekho.entities.Followup;
import com.vidyanidhi.computerseekho.services.FollowupManagerImpl;
@RestController
@RequestMapping
public class FollowupController 
{
	@Autowired
	FollowupManagerImpl folloup;
	@GetMapping("api/followup")
	public List<Enquiry> GetAllEnquiry()
	{
		return folloup.GetAllFollowUp();
	}
	
	@GetMapping(value="api/followup/{id}")
	public List<Enquiry>GetByStaff(@PathVariable int id)
	{
		return folloup.GetFollowUpByStaffId(id);
	}
	
	@PostMapping(value = "api/followup/")
	public void add(@RequestBody Followup follow)
	{
		folloup.Add(follow);
	}

}

