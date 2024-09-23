package com.vidyanidhi.computerseekho.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vidyanidhi.computerseekho.entities.Album;
import com.vidyanidhi.computerseekho.entities.Image;
import com.vidyanidhi.computerseekho.services.ImageManager;

@RestController
@CrossOrigin("http://127.0.0.1:*")
public class ImageController {
	@Autowired
	ImageManager service;

	@GetMapping(value = "api/getImage")
	public List<Image> getImages() {
		System.out.println("Get Mapping : getImage");
		return service.getAll();

	}

	@GetMapping(value = "api/imageById/{imageid}")
	public Optional<Image> getImages(@PathVariable int imageid) {

		Optional<Image> p = service.getImage(imageid);
		return p;
	}

	@PostMapping(value = "api/addImage")
	public ResponseEntity<Image> addpro(@RequestBody Image image) {
		System.out.println("Post Mapping: addImage");
		// manager.addProduct(product);
		service.insert(image);
		return ResponseEntity.ok(image);
	}

	@DeleteMapping(value = "api/image/{imageid}")
	public void removepro(@PathVariable int imageid) {
		service.delete(imageid);
	}

	@PutMapping(value = "api/image/{imageid}")
	public void updatepro(@RequestBody Image image, @PathVariable int imageid) {
		System.out.println("inside updatepro of controller");
		service.update(image, imageid);
	}

}
