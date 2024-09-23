package com.vidyanidhi.computerseekho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.vidyanidhi.computerseekho.entities.Image;

public interface ImageManager {
	void insert(Image image);

	List<Image> getAll();

	Optional<Image> getImage(int id);

	void delete(int id);

	void update(Image image, int imageid);

}
