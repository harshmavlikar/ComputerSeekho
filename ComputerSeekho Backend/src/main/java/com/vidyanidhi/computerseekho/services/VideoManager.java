package com.vidyanidhi.computerseekho.services;

import java.util.List;
import java.util.Optional;

import com.vidyanidhi.computerseekho.entities.Video;

public interface VideoManager {
	void AddVideo(Video vdo);
	void DeleteVideo(int id);
	List<Video> GetAllVideos();
	Optional<Video> getVideos(int id);
}
