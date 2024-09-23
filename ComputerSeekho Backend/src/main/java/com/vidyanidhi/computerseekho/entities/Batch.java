package com.vidyanidhi.computerseekho.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Batch")
public class Batch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int batch_id;

    @Column(name = "batch_name")
    private String batch_name;

    @Column(name = "batch_start_date")
    private Date batch_start_date;

    @Column(name = "batch_end_date")
    private Date batch_end_date;

    @ManyToOne
    @JoinColumn(name = "course_id", referencedColumnName ="course_id")
    private Course course_id;

    @Column(name = "final_presentation_date")
    private Date final_presentation_date;

    @Column(name = "batch_fees")
    private float batch_fees;

    @Column(name = "course_fees_from")
    private Date course_fees_from;

    @Column(name = "course_fees_to")
    private Date course_fees_to;

    @Column(name = "batch_is_active")
    private boolean batch_is_active;

	public int getBatch_id() {
		return batch_id;
	}

	public void setBatch_id(int batch_id) {
		this.batch_id = batch_id;
	}

	public String getBatch_name() {
		return batch_name;
	}

	public void setBatch_name(String batch_name) {
		this.batch_name = batch_name;
	}

	public Date getBatch_start_date() {
		return batch_start_date;
	}

	public void setBatch_start_date(Date batch_start_date) {
		this.batch_start_date = batch_start_date;
	}

	public Date getBatch_end_date() {
		return batch_end_date;
	}

	public void setBatch_end_date(Date batch_end_date) {
		this.batch_end_date = batch_end_date;
	}

	public Course getCourse_id() {
		return course_id;
	}

	public void setCourse_id(Course course_id) {
		this.course_id = course_id;
	}

	public Date getFinal_presentation_date() {
		return final_presentation_date;
	}

	public void setFinal_presentation_date(Date final_presentation_date) {
		this.final_presentation_date = final_presentation_date;
	}

	public float getBatch_fees() {
		return batch_fees;
	}

	public void setBatch_fees(float batch_fees) {
		this.batch_fees = batch_fees;
	}

	public Date getCourse_fees_from() {
		return course_fees_from;
	}

	public void setCourse_fees_from(Date course_fees_from) {
		this.course_fees_from = course_fees_from;
	}

	public Date getCourse_fees_to() {
		return course_fees_to;
	}

	public void setCourse_fees_to(Date course_fees_to) {
		this.course_fees_to = course_fees_to;
	}

	public boolean isBatch_is_active() {
		return batch_is_active;
	}

	public void setBatch_is_active(boolean batch_is_active) {
		this.batch_is_active = batch_is_active;
	}

	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batch(int batch_id, String batch_name, Date batch_start_date, Date batch_end_date, Course course_id,
			Date final_presentation_date, float batch_fees, Date course_fees_from, Date course_fees_to,
			boolean batch_is_active) {
		super();
		this.batch_id = batch_id;
		this.batch_name = batch_name;
		this.batch_start_date = batch_start_date;
		this.batch_end_date = batch_end_date;
		this.course_id = course_id;
		this.final_presentation_date = final_presentation_date;
		this.batch_fees = batch_fees;
		this.course_fees_from = course_fees_from;
		this.course_fees_to = course_fees_to;
		this.batch_is_active = batch_is_active;
	}

	@Override
	public String toString() {
		return "Batch [batch_id=" + batch_id + ", batch_name=" + batch_name + ", batch_start_date=" + batch_start_date
				+ ", batch_end_date=" + batch_end_date + ", course_id=" + course_id + ", final_presentation_date="
				+ final_presentation_date + ", batch_fees=" + batch_fees + ", course_fees_from=" + course_fees_from
				+ ", course_fees_to=" + course_fees_to + ", batch_is_active=" + batch_is_active + "]";
	}

    
}
