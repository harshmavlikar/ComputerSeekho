package com.vidyanidhi.computerseekho.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PaymentTypeMaster")
public class PaymentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int payment_type_id;

    @Column(name = "payment_type_desc", nullable = false)
    private String payment_type_desc;

	public int getPayment_type_id() {
		return payment_type_id;
	}

	public void setPayment_type_id(int payment_type_id) {
		this.payment_type_id = payment_type_id;
	}

	public String getPayment_type_desc() {
		return payment_type_desc;
	}

	public void setPayment_type_desc(String payment_type_desc) {
		this.payment_type_desc = payment_type_desc;
	}

    
}
