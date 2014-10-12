package com.PictureNetwork.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.PictureNetwork.persistance.Subject;

@Stateless
public class SubjectServices implements SubjectServicesRemote,
		SubjectServicesLocal {

	@PersistenceContext(unitName = "PictureNetwork")
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
	public List<Subject> findAllSubject() {
		return em.createQuery("select s from Subject s  ", Subject.class)
				.getResultList();
	}

	
	public Subject findSubjectByTitle(String title) {
		
		String jpql = "select p from Subject p where p.title = :param ";
		Query query = em.createQuery(jpql);
		query.setParameter("param", title);

		return  (Subject) query.getSingleResult();
	}
}
