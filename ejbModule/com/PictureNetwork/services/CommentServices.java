package com.PictureNetwork.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.PictureNetwork.persistance.Comment;
import com.PictureNetwork.persistance.Subject;
import com.PictureNetwork.persistance.User;

@Stateless
public class CommentServices implements CommentServicesRemote,
		CommentServicesLocal {

	@PersistenceContext(unitName = "PictureNetwork")
	private EntityManager em;

	public CommentServices() {

	}

	@Override
	public Comment createComment(Comment comment) {
		em.persist(comment);
		return comment;

	}

	@Override
	public Comment findCommentById(int id) {
		return em.find(Comment.class, id);
	}

	@Override
	public Comment updateComment(Comment comment) {

		em.merge(comment);
		return comment;
	}

	@Override
	public Comment removeComment(Comment comment) {

		em.remove(em.merge(comment));
		return comment;

	}

	@Override
	public List<Comment> findAllComment() {
		return em.createQuery("select c from Comment c  ", Comment.class)
				.getResultList();
	}

	public List<Comment> findCommentBySubject(Subject subject) {

		return (List<Comment>) em
				.createQuery("select c from Comment c where c.subject=:x",
						Comment.class).setParameter("x", subject)
				.getResultList();

	}

	@Override
	public List<Comment> findCommentByUser(User user) {

		return (List<Comment>) em.createQuery(
				"select c from Comment c where c.user=:x", Comment.class)
				.setParameter("x", user);
	}

	@Override
	public List<Comment> findCommentBySubject(int idsubject) {
		return
				(List<Comment>) em.createQuery(
						"select c from Comment c where c.idsubject=:x", Comment.class)
						.setParameter("x", idsubject );
	}
}
