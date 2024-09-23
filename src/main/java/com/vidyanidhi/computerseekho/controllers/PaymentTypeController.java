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

import com.vidyanidhi.computerseekho.entities.PaymentType;
import com.vidyanidhi.computerseekho.entities.Video;
import com.vidyanidhi.computerseekho.services.PaymentTypeManager;
import com.vidyanidhi.computerseekho.services.VideoManager;

@RestController
public class PaymentTypeController {
	@Autowired
	PaymentTypeManager manager;
	
	@GetMapping("api/paymentType")
	public List<PaymentType> getAllPaymentType(){
	  return	manager.GetAllPaymentType();
	}
	
	@GetMapping("api/getPaymentTypebyID/{ID}")
	public Optional<PaymentType> getPaymentTypeById(@PathVariable int ID){
		return manager.GetPaymentType(ID);
	}
	
	@PostMapping("api/addPaymentType")
	public void addPaymentType(@RequestBody PaymentType paymentType) {
		manager.AddPaymentType(paymentType);
	}
	
	@DeleteMapping("api/deletePaymentTypebyID/{ID}")
	public void deleteVideobyID(@PathVariable int ID) {
		manager.DeletePaymentType(ID);
	}
}
