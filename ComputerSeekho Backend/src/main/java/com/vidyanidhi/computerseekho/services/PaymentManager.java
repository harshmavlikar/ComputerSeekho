package com.vidyanidhi.computerseekho.services;

import java.util.List;
import java.util.Optional;

import com.vidyanidhi.computerseekho.entities.Payment;
import com.vidyanidhi.computerseekho.entities.Video;

public interface PaymentManager {
	void addPaymet(Payment payment);
	void DeletePayment(int id);
	List<Payment> GetAllPayment();
	Optional<Payment> getPayment(int id);
}
