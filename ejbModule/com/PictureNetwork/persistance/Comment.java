package com.PictureNetwork.persistance;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t_comment")
public class Comment implements Serializable {

	

	private int idcomment;
	private Date datecomment;
	private String comm;

	private User user;
	private Subject subject;

	@ManyToOne
	@JoinColumn(name = "subjectcomment_fk")
	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdcomment() {
		return idcomment;
	}

	public void setIdcomment(int idcomment) {
		this.idcomment = idcomment;
	}

	public Date getDatecomment() {
		return datecomment;
	}

	public void setDatecomment(Date datecomment) {
		this.datecomment = datecomment;
	}

	@Lob
	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Comment() {

	}
	
public Comment(Date datecomment, String comm, User user, Subject subject) {
		
		this.datecomment = datecomment;
		this.comm = comm;
		this.user = user;
		this.subject = subject;
	}
	

}
