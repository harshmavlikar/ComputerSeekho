package com.vidyanidhi.computerseekho.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vidyanidhi.computerseekho.entities.Enquiry;
import com.vidyanidhi.computerseekho.entities.Followup;
import com.vidyanidhi.computerseekho.repositories.FollowupRepository;
@Service
public class FollowupManagerImpl implements FollowupManager
{
	FollowupRepository followuprepo;


	@Override
	public void Add(Followup follow) {
		followuprepo.save(follow);	
	}

	@Override
	public List<Enquiry> GetAllFollowUp() {
		
		return followuprepo.getAll();
	}

	@Override
	public List<Enquiry> GetFollowUpByStaffId(int staffid) {
		
		return followuprepo.getBystaffId(staffid);
	}

}
