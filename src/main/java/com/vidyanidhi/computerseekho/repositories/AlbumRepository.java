package com.vidyanidhi.computerseekho.repositories;

import org.springframework.stereotype.Repository;

import com.vidyanidhi.computerseekho.entities.Album;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface AlbumRepository extends JpaRepository<Album, Integer> {

	@Modifying
	@Query("update Album album set album.album_name= :name,album.album_description=:description,album.album_is_active=:albumisactive where album.id=:id")
	void update(@Param("name") String album_name, @Param("description") String album_description,
			@Param("albumisactive") boolean album_is_active, int id);

	@Query(value = "Select * from Album  where album_name=:cat", nativeQuery = true)
	Optional<Album> cattype(@Param("cat") String cat);

}
