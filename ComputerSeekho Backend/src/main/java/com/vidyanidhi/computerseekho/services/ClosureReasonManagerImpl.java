package com.vidyanidhi.computerseekho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidyanidhi.computerseekho.entities.ClosureReasonMaster;
import com.vidyanidhi.computerseekho.entities.Video;
import com.vidyanidhi.computerseekho.repositories.ClosureReasonMasterRepository;

@Service
public class ClosureReasonManagerImpl implements ClosureReasonManager {
	
	@Autowired
	ClosureReasonMasterRepository repository;
	@Override
	public void addClosureReason(ClosureReasonMaster cr) {
		repository.save(cr);
		
	}

	@Override
	public void deleteClosureReason(int id) {
		repository.deleteById(id);
		
	}

	@Override
	public List<ClosureReasonMaster> getAllClosureResons() {
		List<ClosureReasonMaster> crs = repository.findAll();
		return crs ;
	}

	@Override
	public Optional<ClosureReasonMaster> getClosureReason(int id) {
		Optional<ClosureReasonMaster> crs = repository.findById(id);
		return crs ;
	}

}
