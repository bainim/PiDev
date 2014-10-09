package com.PictureNetwork.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.PictureNetwork.persistance.Comment;
import com.PictureNetwork.persistance.Forum;


@Stateless
public class ForumServices implements ForumServicesRemote, ForumServicesLocal {

	@PersistenceContext( unitName ="PictureNetwork")
	 private EntityManager em;
    public ForumServices() {
    }

	@Override
	public Forum createForum(Forum forum) {
		em.persist(forum);
		return forum;
	}

	@Override
	public Forum updateForum(Forum forum) {
		 em.merge(forum);
		 return forum;
	}

	@Override
	public Forum removeForum(Forum forum) {
		em.remove(em.merge(forum));
		 return forum;
	}

	

}
