package com.PictureNetwork.services;

import javax.ejb.Remote;

import com.PictureNetwork.persistance.Forum;

@Remote
public interface ForumServicesRemote {

	Forum createForum(Forum forum);
	Forum updateForum(Forum forum);
	Forum removeForum(Forum forum);
}
