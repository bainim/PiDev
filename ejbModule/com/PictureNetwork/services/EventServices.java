package com.PictureNetwork.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.PictureNetwork.persistance.BlackList;
import com.PictureNetwork.persistance.Event;

@Stateless
public class EventServices implements EventServicesRemote, EventServicesLocal {
	
	@PersistenceContext( unitName ="PictureNetwork")
	 private EntityManager em;

    public EventServices() {
    	
    }

	public void createEvent(Event event) {
		em.persist(event);
	}

	public Event findEventById(int id) {
		return em.find(Event.class, id);
	}

	public void updateEvent(Event event) {
		em.merge(event);	
	}
	
	public void removeEvent(Event event) {
		em.remove(em.find(Event.class, event));	
	}
	
	public void remove_Event(int id) {	
		em.remove(em.find(Event.class, id));
	}

	public List<Event> findAllEvent() {
		return em.createQuery("select w from Event w", Event.class).getResultList();
	}

}
