package com.vidyanidhi.computerseekho.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vidyanidhi.computerseekho.entities.Album;
import com.vidyanidhi.computerseekho.entities.Video;
import com.vidyanidhi.computerseekho.services.VideoManager;

@RestController
public class VideoController {
	@Autowired
	VideoManager video_Service;
	
	@GetMapping("api/getVideos")
	public List<Video> getAllVideos(){
	  return	video_Service.GetAllVideos();
	}
	
	@GetMapping("api/getVideobyID/{ID}")
	public Optional<Video> getVideobyID(@PathVariable int ID){
		return video_Service.getVideos(ID);
	}
	
	@PostMapping("api/addVideos")
	public ResponseEntity<Video> AddVideo(@RequestBody Video video) {
		video_Service.AddVideo(video);
		return ResponseEntity.ok(video);
	}
	
	
	@DeleteMapping("api/deleteVideobyID/{ID}")
	public void deleteVideobyID(@PathVariable int ID) {
		video_Service.DeleteVideo(ID);
	}
}
