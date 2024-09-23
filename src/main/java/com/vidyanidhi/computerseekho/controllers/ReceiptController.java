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

import com.vidyanidhi.computerseekho.entities.Receipt;
import com.vidyanidhi.computerseekho.entities.Video;
import com.vidyanidhi.computerseekho.services.ReceiptManager;

@RestController
public class ReceiptController {
	@Autowired
	ReceiptManager manager;
	@GetMapping("api/getReceiptbyId/{id}")
	public Optional<Receipt> getReceiptbyId(@PathVariable int id){
	  return manager.getReceipt(id);
	}
	
	@PostMapping("api/addReceipt")
	public void AddReceipt(@RequestBody Receipt receipt) {
		manager.AddReceipt(receipt);
	}
	
	
	@DeleteMapping("api/deleteReceiptbyID/{ID}")
	public void deleteReceiptbyID(@PathVariable int ID) {
		manager.DeleteReceipt(ID);
	}
}
