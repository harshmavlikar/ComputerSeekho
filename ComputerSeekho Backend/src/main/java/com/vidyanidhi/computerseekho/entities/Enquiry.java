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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "Enquiry")
public class Enquiry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int enquiryId;

    @Column(name = "enquirer_name", nullable = false)
    private String enquirerName;

    @Column(name = "enquirer_address")
    private String enquirerAddress;

    @Column(name = "enquirer_mobile")
    private String enquirerMobile;

    @Column(name = "enquirer_alternate_mobile")
    private String enquirerAlternateMobile;

    @Column(name = "enquirer_emailid")
    private String enquirerEmailId;

    @Column(name = "enquiry_date")
    @Temporal(TemporalType.DATE)
    private Date enquiryDate;

    @Column(name = "enquirer_query")
    private String enquirerQuery;

    @ManyToOne
    @JoinColumn(name="closure_reason_id", referencedColumnName ="closure_reason_id")
    private ClosureReasonMaster closureReasonID;

    @Column(name="closure_reason")
    private String closureReason;

    @Column(name="enquiry_processed_flag")
    private boolean enquiryProcessedFlag;

    @ManyToOne
    @JoinColumn(name="course_id", referencedColumnName ="course_id")
    private Course courseId;

    @ManyToOne
    @JoinColumn(name="staff_id",referencedColumnName ="staff_id")
    private Staff staffId;


    @Column(name="student_name")
    private String studentName;

    @Column(name="enquiry_counter")
    private int enquiryCounter;

    @Column(name = "followup_date")
    @Temporal(TemporalType.DATE)
    private Date followUpDate;

	public int getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(int enquiryId) {
		this.enquiryId = enquiryId;
	}

	public String getEnquirerName() {
		return enquirerName;
	}

	public void setEnquirerName(String enquirerName) {
		this.enquirerName = enquirerName;
	}

	public String getEnquirerAddress() {
		return enquirerAddress;
	}

	public void setEnquirerAddress(String enquirerAddress) {
		this.enquirerAddress = enquirerAddress;
	}

	public String getEnquirerMobile() {
		return enquirerMobile;
	}

	public void setEnquirerMobile(String enquirerMobile) {
		this.enquirerMobile = enquirerMobile;
	}

	public String getEnquirerAlternateMobile() {
		return enquirerAlternateMobile;
	}

	public void setEnquirerAlternateMobile(String enquirerAlternateMobile) {
		this.enquirerAlternateMobile = enquirerAlternateMobile;
	}

	public String getEnquirerEmailId() {
		return enquirerEmailId;
	}

	public void setEnquirerEmailId(String enquirerEmailId) {
		this.enquirerEmailId = enquirerEmailId;
	}

	public Date getEnquiryDate() {
		return enquiryDate;
	}

	public void setEnquiryDate(Date enquiryDate) {
		this.enquiryDate = enquiryDate;
	}

	public String getEnquirerQuery() {
		return enquirerQuery;
	}

	public void setEnquirerQuery(String enquirerQuery) {
		this.enquirerQuery = enquirerQuery;
	}

	public ClosureReasonMaster getClosureReasonID() {
		return closureReasonID;
	}

	public void setClosureReasonID(ClosureReasonMaster closureReasonID) {
		this.closureReasonID = closureReasonID;
	}

	public String getClosureReason() {
		return closureReason;
	}

	public void setClosureReason(String closureReason) {
		this.closureReason = closureReason;
	}

	public boolean isEnquiryProcessedFlag() {
		return enquiryProcessedFlag;
	}

	public void setEnquiryProcessedFlag(boolean enquiryProcessedFlag) {
		this.enquiryProcessedFlag = enquiryProcessedFlag;
	}

	public Course getCourseId() {
		return courseId;
	}

	public void setCourseId(Course courseId) {
		this.courseId = courseId;
	}

	public Staff getStaffId() {
		return staffId;
	}

	public void setStaffId(Staff staffId) {
		this.staffId = staffId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getEnquiryCounter() {
		return enquiryCounter;
	}

	public void setEnquiryCounter(int enquiryCounter) {
		this.enquiryCounter = enquiryCounter;
	}

	public Date getFollowUpDate() {
		return followUpDate;
	}

	public void setFollowUpDate(Date followUpDate) {
		this.followUpDate = followUpDate;
	}

	
}
