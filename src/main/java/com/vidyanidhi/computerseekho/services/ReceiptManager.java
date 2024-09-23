package com.vidyanidhi.computerseekho.services;

import java.util.List;
import java.util.Optional;

import com.vidyanidhi.computerseekho.entities.Receipt;
import com.vidyanidhi.computerseekho.entities.Video;

public interface ReceiptManager {
	void AddReceipt(Receipt rct);
	void DeleteReceipt(int id);
	Optional<Receipt> getReceipt(int id);
}
