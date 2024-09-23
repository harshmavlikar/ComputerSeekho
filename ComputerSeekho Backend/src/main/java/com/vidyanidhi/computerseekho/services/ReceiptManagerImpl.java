package com.vidyanidhi.computerseekho.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidyanidhi.computerseekho.entities.Receipt;
import com.vidyanidhi.computerseekho.repositories.ReceiptRepository;
@Service
public class ReceiptManagerImpl implements ReceiptManager {
	@Autowired
	ReceiptRepository repository;
	@Override
	public void AddReceipt(Receipt rct) {
		repository.save(rct);
		
	}

	@Override
	public void DeleteReceipt(int id) {
		repository.deleteById(id);
	}

	@Override
	public Optional<Receipt> getReceipt(int id) {
		return repository.findById(id);
	}

}
