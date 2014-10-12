package com.PictureNetwork.services;

import java.util.List;

import javax.ejb.Remote;

import com.PictureNetwork.persistance.Event;

@Remote
public interface EventServicesRemote {

	void createEvent(Event event);
	Event findEventById(int id);
	void updateEvent(Event event);
	void removeEvent(Event event);
	void remove_Event(int id);
	List<Event> findAllEvent();
}