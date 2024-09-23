package com.vidyanidhi.computerseekho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidyanidhi.computerseekho.entities.PaymentType;
import com.vidyanidhi.computerseekho.entities.Video;
import com.vidyanidhi.computerseekho.repositories.PaymentTypeRepository;

@Service
public class PaymentTypeManagerImpl implements PaymentTypeManager {

	@Autowired
	PaymentTypeRepository paymentTypeRepository;
	@Override
	public void AddPaymentType(PaymentType paymentType) {
		paymentTypeRepository.save(paymentType);

	}

	@Override
	public void DeletePaymentType(int id) {
		paymentTypeRepository.deleteById(id);

	}

	@Override
	public List<PaymentType> GetAllPaymentType() {
		List<PaymentType> payt= paymentTypeRepository.findAll();
		return payt;
	}

	@Override
	public Optional<PaymentType> GetPaymentType(int id) {
		Optional<PaymentType> pt = paymentTypeRepository.findById(id);
		return pt ;
	}

}
