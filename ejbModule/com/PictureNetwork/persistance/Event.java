package com.PictureNetwork.persistance;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "t_event")
public class Event implements Serializable {

	

	private int idevent;
	private String dateEvent;
	private String Local;
	private String desc;

	public Event() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdevent() {
		return idevent;
	}

	public void setIdevent(int idevent) {
		this.idevent = idevent;
	}

	public String getDateEvent() {
		return dateEvent;
	}

	public void setDateEvent(String dateEvent) {
		this.dateEvent = dateEvent;
	}

	public String getLocal() {
		return Local;
	}

	public void setLocal(String local) {
		Local = local;
	}

	@Lob
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public Event(String dateEvent, String local, String desc) {
		
		this.dateEvent = dateEvent;
		Local = local;
		this.desc = desc;
	}
	

}
