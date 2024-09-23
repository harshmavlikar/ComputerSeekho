package com.vidyanidhi.computerseekho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vidyanidhi.computerseekho.entities.Video;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {

}
