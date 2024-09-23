package com.vidyanidhi.computerseekho.services;

import java.util.*;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import com.vidyanidhi.computerseekho.entities.Enquiry;


public interface EnquiryManager {
	public void Formsubmit(@RequestBody Enquiry enquiry);
//	public void DeleteById(@PathVariable int id);
	public List<Enquiry> GetAll();
	public Optional<Enquiry> FindById(@PathVariable int id);
	public Optional<Enquiry> GetByName(String name);
//	public void update(Enquiry e,int id);
	public List<Enquiry> getEnquiriesByStaffId(int staff_id);
	public void updateEnquiry(int enquiryId, Enquiry enquiry);
	public void updateprocessflag(int id);


}
