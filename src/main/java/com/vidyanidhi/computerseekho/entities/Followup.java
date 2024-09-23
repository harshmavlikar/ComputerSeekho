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
@Table(name = "Followup")
public class Followup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int followupid;

    @ManyToOne
    @JoinColumn(name = "enquiry_id",referencedColumnName ="enquiryId")
    private Enquiry enquiryid;

    @ManyToOne
    @JoinColumn(name = "staff_id", referencedColumnName ="staff_id")
    private Staff staffid;

    @Column(name = "followup_date")
    @Temporal(TemporalType.DATE)
    private Date followupdate;

    @Column(name="followup_msg")
    private String followupmsg;

    @Column(name="is_active")
    private boolean isactive;

	public int getFollowupid() {
		return followupid;
	}

	public void setFollowupid(int followupid) {
		this.followupid = followupid;
	}

	public Enquiry getEnquiryid() {
		return enquiryid;
	}

	public void setEnquiryid(Enquiry enquiryid) {
		this.enquiryid = enquiryid;
	}

	public Staff getStaffid() {
		return staffid;
	}

	public void setStaffid(Staff staffid) {
		this.staffid = staffid;
	}

	public Date getFollowupdate() {
		return followupdate;
	}

	public void setFollowupdate(Date followupdate) {
		this.followupdate = followupdate;
	}

	public String getFollowupmsg() {
		return followupmsg;
	}

	public void setFollowupmsg(String followupmsg) {
		this.followupmsg = followupmsg;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

    
}
