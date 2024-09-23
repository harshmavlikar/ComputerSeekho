package com.vidyanidhi.computerseekho.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ImageMaster")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int image_id;

    @Column(name = "image_path", nullable = false)
    private String image_path;

    @ManyToOne
    @JoinColumn(name = "album_id", referencedColumnName = "album_id")
    private Album album_id;

    @Column(name = "is_album_cover")
    private boolean is_album_cover;

    @Column(name = "image_is_active")
    private boolean image_is_active;

	public int getImage_id() {
		return image_id;
	}

	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}

	public Album getAlbum_id() {
		return album_id;
	}

	public void setAlbum_id(Album album_id) {
		this.album_id = album_id;
	}

	public boolean isIs_album_cover() {
		return is_album_cover;
	}

	public void setIs_album_cover(boolean is_album_cover) {
		this.is_album_cover = is_album_cover;
	}

	public boolean isImage_is_active() {
		return image_is_active;
	}

	public void setImage_is_active(boolean image_is_active) {
		this.image_is_active = image_is_active;
	}

    
}
