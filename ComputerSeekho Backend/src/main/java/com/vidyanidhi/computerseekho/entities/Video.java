package com.vidyanidhi.computerseekho.entities;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "VideoMaster")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int video_id;
    
    @OneToMany(mappedBy = "video_id", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Course> course ;


    @Column(name = "video_path", nullable = false)
    private String video_path;

    @Column(name = "video_url")
    private String video_url;
//>>>>>>> branch 'subbranch' of https://github.com/swapnilD31/ComputerSeekho.git

    @ManyToOne 
    @JoinColumn(name = "album_id", referencedColumnName = "album_id")
    private Album album_id;

    @Column(name = "is_album_cover")
    private boolean is_album_cover;

    @Column(name = "video_is_active")
    private boolean video_is_active;

	public int getVideo_id() {
		return video_id;
	}

	public void setVideo_id(int video_id) {
		this.video_id = video_id;
	}

	public String getVideo_path() {
		return video_path;
	}

	public void setVideo_path(String video_path) {
		this.video_path = video_path;
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

	public boolean isVideo_is_active() {
		return video_is_active;
	}

	public void setVideo_is_active(boolean video_is_active) {
		this.video_is_active = video_is_active;
	}

    
}
