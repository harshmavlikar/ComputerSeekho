package com.vidyanidhi.computerseekho.services;

import java.util.List;
import java.util.Optional;

import com.vidyanidhi.computerseekho.entities.PaymentType;
import com.vidyanidhi.computerseekho.entities.Video;

public interface PaymentTypeManager {
	void AddPaymentType(PaymentType paymentType);
	void DeletePaymentType(int id);
	List<PaymentType> GetAllPaymentType();
	Optional<PaymentType> GetPaymentType(int id);
}
