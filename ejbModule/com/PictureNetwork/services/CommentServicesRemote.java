package com.PictureNetwork.services;

import java.util.List;

import javax.ejb.Remote;

import com.PictureNetwork.persistance.Comment;
import com.PictureNetwork.persistance.Subject;
import com.PictureNetwork.persistance.User;

@Remote
public interface CommentServicesRemote {
	
	Comment createComment(Comment comment);
	Comment findCommentById(int id);
	Comment updateComment(Comment comment);
	Comment removeComment(Comment comment);
	
	List<Comment> findAllComment();

	List<Comment> findCommentBySubject(Subject subject);
	List<Comment> findCommentByUser(User user);
}
