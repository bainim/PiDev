package com.PictureNetwork.services;

import java.util.List;

import javax.ejb.Remote;

import com.PictureNetwork.persistance.Comment;
import com.PictureNetwork.persistance.Forum;
import com.PictureNetwork.persistance.Subject;

@Remote
public interface SubjectServicesRemote {
	
	void createSubject(Subject subject);
	Subject findSubjectById(int id);
	void updateSubject(Subject subject);
	
	Subject findSubjectByTitle(String title);
	List<Subject> findAllSubject();
	
	

}
