package com.PictureNetwork.services;

import java.util.List;

import javax.ejb.Remote;

import com.PictureNetwork.persistance.Comment;
import com.PictureNetwork.persistance.Forum;
import com.PictureNetwork.persistance.Subject;

@Remote
public interface SubjectServicesRemote {
	
	Subject createSubject(Subject subject);
	Subject findSubjectById(int id);
	Subject updateSubject(Subject subject);
	Subject removeSubject(Subject subject);
	
	List<Subject> findAllSubject();
	
	

}
