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

import com.vidyanidhi.computerseekho.entities.Payment;
import com.vidyanidhi.computerseekho.entities.Video;
import com.vidyanidhi.computerseekho.services.PaymentManager;

@RestController
public class PaymentController {

	@Autowired
	PaymentManager manager;
	
	@GetMapping("api/getPayments")
	public List<Payment> getAllPayments(){
	  return manager.GetAllPayment();
	}
	
	@GetMapping("api/getPaymentbyID/{ID}")
	public Optional<Payment> getPaymentbyID(@PathVariable int ID){
		return manager.getPayment(ID);
	}
	
	@PostMapping("api/addPayment")
	public void AddPayment(@RequestBody Payment payment) {
		manager.addPaymet(payment);
	}
	
	@DeleteMapping("api/deletePaymentbyID/{ID}")
	public void deletePaymentbyID(@PathVariable int ID) {
		manager.DeletePayment(ID);
	}
}
