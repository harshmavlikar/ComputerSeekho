package com.vidyanidhi.computerseekho.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.vidyanidhi.computerseekho.entities.Album;
import com.vidyanidhi.computerseekho.services.AlbumManager;

@RestController
@CrossOrigin("*")

public class AlbumController {
	@Autowired
	AlbumManager manager;

	@GetMapping(value = "api/getAlbums") // working
	public List<Album> showAlbum() {
		return manager.getAlbum();
	}

	@PostMapping(value = "api/addAlbums") // working
	public ResponseEntity<Album> addAlbum(@RequestBody Album album) {
		System.out.println("addalbum called");
		manager.addAlbum(album);
		return ResponseEntity.ok(album);
	}

	@DeleteMapping(value = "api/deleteAlbums/{aid}") // working
	public void removeAlbum(@PathVariable int aid) {
		manager.delete(aid);
	}

	@GetMapping(value = "api/getAlbumsByname/{cat}")
	public Optional<Album> getAlbumCat(@PathVariable String cat) {
		return manager.getSelected(cat);
	}

	@PutMapping(value = "api/updateAlbums/{aid}") // working
	public void updateAlbum(@RequestBody Album album, @PathVariable int aid) {
		System.out.println("inside updatealbum of controller");
		manager.update(album, aid);
	}

}
