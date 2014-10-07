package com.PictureNetwork.services;

import java.util.List;

import javax.ejb.Remote;

import com.PictureNetwork.persistance.Comment;
import com.PictureNetwork.persistance.Subject;

@Remote
public interface CommentServicesRemote {
	
	void createComment(Comment comment);
	Comment findCommentById(int id);
	void updateComment(Comment comment);
	void removeComment(Comment comment);
	void remove_Comment(int id);
	List<Comment> findAllComment();

	List<Comment> findCommentBySubject(Subject subject);
}
