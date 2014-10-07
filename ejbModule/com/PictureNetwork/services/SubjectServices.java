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
	public void createSubject(Subject subject) {

		em.persist(subject);
	}

	@Override
	public Subject findSubjectById(int id) {
		return em.find(Subject.class, id);
	}

	@Override
	public void updateSubject(Subject subject) {

		 em.merge(subject);
	}

	@Override
	public void removeSubject(Subject subject) {

		 em.remove(em.merge(subject));
	}

	@Override
	public void remove_Subject(int id) {
		em.remove(em.find(Subject.class, id));		
		
	}

	@Override
	public List<Subject> findAllSubject() {
		return em.createQuery("select s from Subject s  ",Subject.class).getResultList();
	}
	
public List<Subject> findSubjectByForum(Forum forum) {
		
		return (List<Subject>) em.createQuery("select s from Subject s where s.forum=:x",Subject.class).setParameter("x", forum);

	}

}
