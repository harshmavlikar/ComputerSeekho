package com.vidyanidhi.computerseekho.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vidyanidhi.computerseekho.entities.ClosureReasonMaster;
import com.vidyanidhi.computerseekho.entities.Video;
import com.vidyanidhi.computerseekho.services.ClosureReasonManager;

@RestController
public class ClosureReasonController {
	@Autowired
	ClosureReasonManager manager;
	
	@GetMapping("api/ClosureReasons")
	public List<ClosureReasonMaster> getAllClosureReason(){
	  return	manager.getAllClosureResons();
	}
	
	@GetMapping("api/getClosureReasonbyID/{ID}")
	public Optional<ClosureReasonMaster> getClosureReasonByID(@PathVariable int ID){
		return manager.getClosureReason(ID);
	}
	
	@PostMapping("api/addClosureReason")
	public void addClosureReason(@RequestBody ClosureReasonMaster crm) {
		manager.addClosureReason(crm);
	}
	
	@DeleteMapping("api/deleteClosureReasonbyID/{ID}")
	public void deleteVideobyID(@PathVariable int ID) {
		manager.deleteClosureReason(ID);
	}
}
