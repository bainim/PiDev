package com.PictureNetwork.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.PictureNetwork.persistance.Comment;
import com.PictureNetwork.persistance.Forum;
import com.PictureNetwork.persistance.Subject;


@Stateless
public class SubjectServices implements SubjectServicesRemote, SubjectServicesLocal {

	@PersistenceContext( unitName ="PictureNetwork")
	 private EntityManager em;
	
    public SubjectServices() {
    	
    }

	@Override
	public Subject createSubject(Subject subject) {

		em.persist(subject);
		return subject;
	}

	@Override
	public Subject findSubjectById(int id) {
		return em.find(Subject.class, id);
	}

	@Override
	public Subject updateSubject(Subject subject) {

		 em.merge(subject);
		 return subject;
	}

	@Override
	public Subject removeSubject(Subject subject) {

		 em.remove(em.merge(subject));
		 return subject;
	}


	@Override
	public List<Subject> findAllSubject() {
		return em.createQuery("select s from Subject s  ",Subject.class).getResultList();
	}
	


}
