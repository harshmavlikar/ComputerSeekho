package com.vidyanidhi.computerseekho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vidyanidhi.computerseekho.entities.Receipt;
@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Integer> {

}
