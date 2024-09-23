package com.vidyanidhi.computerseekho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidyanidhi.computerseekho.entities.Video;
import com.vidyanidhi.computerseekho.repositories.VideoRepository;

@Service
public class VideoManagerImpl implements VideoManager {

	@Autowired
	private VideoRepository videoRepo;

	@Override
	public void AddVideo(Video vedio) {
		// TODO Auto-generated method stub
		videoRepo.save(vedio);
		
	}

	@Override
	public void DeleteVideo(int id) {
		// TODO Auto-generated method stub
		videoRepo.deleteById(id);
	}

	@Override
	public List<Video> GetAllVideos() {
		// TODO Auto-generated method stub
		List<Video> vid = videoRepo.findAll();
		return vid ;
	}

	@Override
	public Optional<Video> getVideos(int id) {
		// TODO Auto-generated method stub
		
		Optional<Video> vid = videoRepo.findById(id);
		return vid ;
	}

}
