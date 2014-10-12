package com.PictureNetwork.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.PictureNetwork.persistance.Comment;
import com.PictureNetwork.persistance.Photo;


@Stateless
public class PhotoServices implements PhotoServicesRemote, PhotoServicesLocal {

	@PersistenceContext( unitName ="PictureNetwork")
	 private EntityManager em;
    public PhotoServices() {
    }

	@Override
	public void createPhoto(Photo photo) {
		em.persist(photo);
		
	}

	@Override
	public Photo findPhotoById(int id) {
		return em.find(Photo.class, id);
	}

	@Override
	public void updatePhoto(Photo photo) {
		 em.merge(photo);
		
	}

	@Override
	public void removePhoto(Photo photo) {
		em.remove(em.merge(photo));
		
	}

	@Override
	public void remove_Photo(int id) {
		em.remove(em.find(Comment.class, id));		
		
	}

	@Override
	public List<Photo> findAllPhoto() {
		return em.createQuery("select p from Photo p  ",Photo.class).getResultList();
	}

}
