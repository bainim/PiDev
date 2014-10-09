package com.PictureNetwork.persistance;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t_subject")
public class Subject implements Serializable {

	private int idsubject;
	private String title;
	private String date;

	private List<Comment> comment;

	@OneToMany(mappedBy = "subject")
	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdsubject() {
		return idsubject;
	}

	public void setIdsubject(int idsubject) {
		this.idsubject = idsubject;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Subject() {

	}

	public Subject(String title, String date) {
		this.title = title;
		this.date = date;

	}

}
