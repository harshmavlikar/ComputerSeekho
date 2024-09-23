package com.vidyanidhi.computerseekho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vidyanidhi.computerseekho.entities.Album;
import com.vidyanidhi.computerseekho.repositories.AlbumRepository;

@Service
public class AlbumManagerImpl implements AlbumManager {

	@Autowired
	AlbumRepository repository;

	@Override
	public void addAlbum(Album album) {
		repository.save(album);
	}

	@Override
	public List<Album> getAlbum() {
		// TODO Auto-generated method stub
		return repository.findAll();

	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}

	@Override
	public Optional<Album> getSelected(String cat) {
		// TODO Auto-generated method stub
		return repository.cattype(cat);
	}
//
//        @Override
//        public void update(Album album, int id) {
//	     // TODO Auto-generated method stub
//           }

	@Override
	public void update(Album album, int id) {
		// TODO Auto-generated method stub
		repository.update(album.getAlbum_name(), album.getAlbum_description(), album.getAlbum_is_active(), id);
	}

	// @Override
	// public Optional<Album> getSelected(String cat) {
	// TODO Auto-generated method stub
	// return repository.listtype(cat);
	// }
}
