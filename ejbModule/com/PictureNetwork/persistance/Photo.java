package com.PictureNetwork.persistance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "t_photo")
public class Photo implements Serializable {

	

	private int idphoto;
	private byte[] picbyte;
	private String date;
	private String description;
	private int price;
	private boolean selled;
	private User user;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdphoto() {
		return idphoto;
	}
	
	@ManyToOne
	@JoinColumn(name = "userphoto_fk")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Photo() {

	}
	
	public Photo(byte[] picbyte,/* Image picture,*/ String desc, String date,
			int price, Character selled) {
		
		this.picbyte = picbyte;
		//this.picture = picture;
		this.date = date;
		this.price = price;
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isSelled() {
		return selled;
	}

	public void setSelled(boolean selled) {
		this.selled = selled;
	}
	

}
