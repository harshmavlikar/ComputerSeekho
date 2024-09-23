package com.vidyanidhi.computerseekho.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ClosureReasonMaster")
public class ClosureReasonMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int closure_reason_id;

    @Column(name = "closure_reason_desc", nullable = false)
    private String closure_reason_desc;

    // Getters and Setters
    public int getClosure_reason_id() {
        return closure_reason_id;
    }

    public void setClosure_reason_id(int closure_reason_id) {
        this.closure_reason_id = closure_reason_id;
    }

    public String getClosure_reason_desc() {
        return closure_reason_desc;
    }

    public void setClosure_reason_desc(String closure_reason_desc) {
        this.closure_reason_desc = closure_reason_desc;
    }
}
