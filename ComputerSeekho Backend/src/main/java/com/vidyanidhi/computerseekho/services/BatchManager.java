package com.vidyanidhi.computerseekho.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vidyanidhi.computerseekho.entities.Batch;


public interface BatchManager {
	void save(Batch ref);
	List<Batch> getAll();
	Batch getBatch(int batchno);
	List<Batch> getUpcomingBatch();
	List<Batch> getCurrentBatch();
	List<Batch> getPastBatch();
	List<Batch> getBatchByName(String batchName);
	List<Batch> getBatchByCourseId(int cid);
}
