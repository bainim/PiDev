package com.PictureNetwork.persistance;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Admin extends User implements Serializable{

	public Admin() {
		super();
		
	}

	
}
