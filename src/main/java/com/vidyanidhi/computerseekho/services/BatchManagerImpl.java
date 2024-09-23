package com.vidyanidhi.computerseekho.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidyanidhi.computerseekho.entities.Batch;
import com.vidyanidhi.computerseekho.repositories.BatchRepository;

@Service
public class BatchManagerImpl implements BatchManager {

	@Autowired
	private BatchRepository b_repository;
	@Override
	public void save(Batch ref) 
	{
		b_repository.save(ref);
	}
	@Override
	public List<Batch> getAll() {
		
		return b_repository.findAll();
	}
	@Override
	public Batch getBatch(int batchno) {
		
		return b_repository.getBatch(batchno);
	}
	@Override
	public List<Batch> getUpcomingBatch(){
		return b_repository.getUpcomingBatch();
	}
	@Override
	public List<Batch> getCurrentBatch(){
		return b_repository.getCurrentBatch();
	}
	
	
	  @Override public List<Batch> getPastBatch(){ return
	  b_repository.getPastBatch(); }
	  
	  @Override public List<Batch> getBatchByName(String batchName){
		  return b_repository.getBatchByName(batchName);
	  }
	@Override
	public List<Batch> getBatchByCourseId(int cid) {
		// TODO Auto-generated method stub
		return b_repository.getBatchByCourse_Id(cid);
	}

}
