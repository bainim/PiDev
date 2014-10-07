package com.PictureNetwork.services;

import java.util.List;

import javax.ejb.Stateless;

import com.PictureNetwork.persistance.Event;

/**
 * Session Bean implementation class EventServices
 */
@Stateless
public class EventServices implements EventServicesRemote, EventServicesLocal {

    /**
     * Default constructor. 
     */
    public EventServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void createEvent(Event event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Event findEventById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEvent(Event event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeEvent(Event event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove_Player(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Event> findAllPlayer() {
		// TODO Auto-generated method stub
		return null;
	}

}
