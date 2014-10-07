package com.PictureNetwork.persistance;

import java.awt.Image;
import java.io.Serializable;
import java.util.Arrays;
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

import com.sun.mail.handlers.image_jpeg;

import oracle.jrockit.jfr.parser.ChunkParser;

@Entity
@Table(name = "t_photo")
public class Photo implements Serializable {

	

	private int idphoto;
	private byte[] picbyte;
	//private Image picture;
	private String desc;
	private Date date;
	private int price;
	private Character selled;

	private User user;

	@ManyToOne
	@JoinColumn(name = "userphoto_fk")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdphoto() {
		return idphoto;
	}

	public void setIdphoto(int idphoto) {
		this.idphoto = idphoto;
	}

	@Lob
	public byte[] getPicbyte() {
		return picbyte;
	}

	public void setPicbyte(byte[] picbyte) {
		this.picbyte = picbyte;
	}

	/*public Image getPicture() {
		return picture;
	}

	public void setPicture(Image picture) {
		this.picture = picture;
	}*/

	@Lob
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Character getSelled() {
		return selled;
	}

	public void setSelled(Character selled) {
		this.selled = selled;
	}

	public Photo() {

	}
	
	public Photo(byte[] picbyte,/* Image picture,*/ String desc, Date date,
			int price, Character selled, User user) {
		
		this.picbyte = picbyte;
		//this.picture = picture;
		this.desc = desc;
		this.date = date;
		this.price = price;
		this.selled = selled;
		this.user = user;
	}
	

}
