package com.PictureNetwork.persistance;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_blacklist")
public class BlackList implements Serializable {

	private int idword;
	private String word;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdword() {
		return idword;
	}

	public void setIdword(int idword) {
		this.idword = idword;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public BlackList() {

	}

	public BlackList(String word) {

		this.word = word;
	}
	
	
	
}
