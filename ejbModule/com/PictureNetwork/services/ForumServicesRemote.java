package com.PictureNetwork.services;

import javax.ejb.Remote;

import com.PictureNetwork.persistance.Forum;

@Remote
public interface ForumServicesRemote {

	void createForum(Forum forum);
	void updateForum(Forum forum);
	void removeForum(Forum forum);
}
