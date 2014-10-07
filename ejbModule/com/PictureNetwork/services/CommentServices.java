package com.PictureNetwork.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.PictureNetwork.persistance.Comment;
import com.PictureNetwork.persistance.Subject;

/**
 * Session Bean implementation class CommentServices
 */
@Stateless
public class CommentServices implements CommentServicesRemote, CommentServicesLocal {

	@PersistenceContext( unitName ="PictureNetwork")
	 private EntityManager em;
	
    public CommentServices() {
    	
    }

	@Override
	public void createComment(Comment comment) {
		em.persist(comment);
		
	}

	@Override
	public Comment findCommentById(int id) {
		return em.find(Comment.class, id);
	}

	@Override
	public void updateComment(Comment comment) {

		 em.merge(comment);
	}

	@Override
	public void removeComment(Comment comment) {

		 em.remove(em.merge(comment));
	}

	@Override
	public void remove_Comment(int id) {
		em.remove(em.find(Comment.class, id));		
	}

	@Override
	public List<Comment> findAllComment() {
		return em.createQuery("select c from Comment c  ",Comment.class).getResultList();
	}
	
	public List<Comment> findCommentBySubject(Subject subject) {
		
		return (List<Comment>) em.createQuery("select c from Comment c where c.subject=:x",Comment.class).setParameter("x", subject);

	}
}
