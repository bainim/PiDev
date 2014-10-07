package com.PictureNetwork.services;

import javax.ejb.Stateless;

import com.PictureNetwork.persistance.Forum;

/**
 * Session Bean implementation class ForumServices
 */
@Stateless
public class ForumServices implements ForumServicesRemote, ForumServicesLocal {

    /**
     * Default constructor. 
     */
    public ForumServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void createForum(Forum forum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateForum(Forum forum) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeForum(Forum forum) {
		// TODO Auto-generated method stub
		
	}

}
