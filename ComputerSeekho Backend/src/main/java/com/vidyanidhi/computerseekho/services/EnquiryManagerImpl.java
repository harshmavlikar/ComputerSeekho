package com.vidyanidhi.computerseekho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidyanidhi.computerseekho.entities.Enquiry;
import com.vidyanidhi.computerseekho.repositories.EnquiryRepository;
@Service
public class EnquiryManagerImpl implements EnquiryManager{

	@Autowired
	EnquiryRepository erepository;
	@Override
	public void Formsubmit(Enquiry enquiry) {
		erepository.save(enquiry);

		 
	}

	@Override
	public List<Enquiry> GetAll() {
		// TODO Auto-generated method stub
		return erepository.findAll();

	}

	@Override
	public Optional<Enquiry> FindById(int id) {
		// TODO Auto-generated method stub
		return erepository.findById(id);
	

	}

	@Override
	public Optional<Enquiry> GetByName(String name) {
		// TODO Auto-generated method stub
		Optional<Enquiry> p = erepository.findByName(name);
		return p;

	}

//	@Override
//	public void update(Enquiry enq, int id) {
//		erepository.updatedata(enq.getEnquirerName(),enq.getEnquirerMobile(),enq.getEnquirerEmailId(), enq.getEnquirerQuery(), enq.getClosureReason(),enq.isEnquiryProcessedFlag(),id);
//
//		
//	}

	@Override
	public List<Enquiry> getEnquiriesByStaffId(int staff_id) {
		
		return erepository.findByStaff_id(staff_id);
	}
	
	@Override
	public void updateprocessflag(int id) {
		erepository.changeflagbyid(id);

		
	}

	@Override
	public void updateEnquiry(int enquiryId, Enquiry enquiry) {
		erepository.updatedata(enquiry.getEnquirerName(),enquiry.getEnquirerMobile(), enquiry.getEnquirerEmailId(), enquiry.getEnquirerQuery(),enquiry.getClosureReason(),enquiry.isEnquiryProcessedFlag(),enquiryId);
		//,enquiry.getFollowupdate()
		
	}


	

}


