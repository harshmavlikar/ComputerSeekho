package com.vidyanidhi.computerseekho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidyanidhi.computerseekho.entities.Payment;
import com.vidyanidhi.computerseekho.entities.Video;
import com.vidyanidhi.computerseekho.repositories.PaymentRepository;

@Service
public class PaymentManagerImpl implements PaymentManager {
	
	@Autowired
	PaymentRepository repository;
	@Override
	public void addPaymet(Payment payment) {
		repository.save(payment);

	}

	@Override
	public void DeletePayment(int id) {
		repository.deleteById(id);

	}

	@Override
	public List<Payment> GetAllPayment() {
		List<Payment> payment = repository.findAll();
		return payment ;
	}

	@Override
	public Optional<Payment> getPayment(int id) {
		return repository.findById(id);
	}

}
