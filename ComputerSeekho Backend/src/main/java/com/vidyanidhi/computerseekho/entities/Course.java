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
@Table(name = "Course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int course_id;

    @Column(name = "course_name")
    private String course_name;

    @Column(name = "course_description")
    private String course_description;

    @Column(name = "course_duration")
    private int course_duration;

    @Column(name = "course_syllabus")
    private String course_syllabus;

    @Column(name = "age_grp_type")
    private String age_grp_type;

    @Column(name = "course_is_active")
    private boolean course_is_active;

    @Column(name = "cover_photo")
    private String cover_photo;

    @ManyToOne
    @JoinColumn(name = "video_id", referencedColumnName ="video_id")
    private Video video_id;
    
    @OneToMany(mappedBy = "courseId", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Enquiry> enquiries;

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCourse_description() {
		return course_description;
	}

	public void setCourse_description(String course_description) {
		this.course_description = course_description;
	}

	public int getCourse_duration() {
		return course_duration;
	}

	public void setCourse_duration(int course_duration) {
		this.course_duration = course_duration;
	}

	public String getCourse_syllabus() {
		return course_syllabus;
	}

	public void setCourse_syllabus(String course_syllabus) {
		this.course_syllabus = course_syllabus;
	}

	public String getAge_grp_type() {
		return age_grp_type;
	}

	public void setAge_grp_type(String age_grp_type) {
		this.age_grp_type = age_grp_type;
	}

	public boolean isCourse_is_active() {
		return course_is_active;
	}

	public void setCourse_is_active(boolean course_is_active) {
		this.course_is_active = course_is_active;
	}

	public String getCover_photo() {
		return cover_photo;
	}

	public void setCover_photo(String cover_photo) {
		this.cover_photo = cover_photo;
	}

	public Video getVideo_id() {
		return video_id;
	}

	public void setVideo_id(Video video_id) {
		this.video_id = video_id;
	}

	
    
}
