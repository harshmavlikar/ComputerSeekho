package com.vidyanidhi.computerseekho.entities;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "AlbumMaster")
public class Album {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int album_id;

	@Column(name = "album_name", nullable = false)
	private String album_name;

	@Column(name = "album_description", nullable = false)
	private String album_description;

	@Column(name = "start_date")
	@Temporal(TemporalType.DATE)
	private Date start_date;

	@Column(name = "end_date")
	@Temporal(TemporalType.DATE)
	private Date end_date;

	@Column(name = "album_is_active")
	private boolean album_is_active;

	public int getAlbum_id() {
		return album_id;
	}

	public void setAlbum_id(int album_id) {
		this.album_id = album_id;
	}

	public String getAlbum_name() {
		return album_name;
	}

	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}

	public String getAlbum_description() {
		return album_description;
	}

	public void setAlbum_description(String album_description) {
		this.album_description = album_description;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public boolean getAlbum_is_active() {
		return album_is_active;
	}

	public void setAlbum_is_active(boolean album_is_active) {
		this.album_is_active = album_is_active;
	}

	public Album() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Album(int album_id, String album_name, String album_description, Date start_date, Date end_date,
			boolean album_is_active) {
		super();
		this.album_id = album_id;
		this.album_name = album_name;
		this.album_description = album_description;
		this.start_date = start_date;
		this.end_date = end_date;
		this.album_is_active = album_is_active;
	}

	@Override
	public String toString() {
		return "Album [album_id=" + album_id + ", album_name=" + album_name + ", album_description=" + album_description
				+ ", start_date=" + start_date + ", end_date=" + end_date + ", album_is_active=" + album_is_active
				+ "]";
	}
	
	
}