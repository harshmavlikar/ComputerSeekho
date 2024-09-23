package com.vidyanidhi.computerseekho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vidyanidhi.computerseekho.entities.Image;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface ImageRepository extends JpaRepository<Image, Integer> {
//	@Modifying
//	@Query("update Image i set i.image_id = :imageid,i.image_path = :imagepath, i.imagage_is_active=:imageactive i.is_album_cover= :albumcover where i.image_id = :id")
//	void update(@Param("imageid") int image_id, @Param("imagepath") String image_path,
//			@Param("imageactive") boolean imagage_is_active, @Param(" boolean is_album_cover") boolean is_album_cover,
//			int imageid);
}
