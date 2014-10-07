package com.PictureNetwork.services;

import java.util.List;

import javax.ejb.Stateless;

import com.PictureNetwork.persistance.User;

/**
 * Session Bean implementation class UserServices
 */
@Stateless
public class UserServices implements UserServicesRemote, UserServicesLocal {

    /**
     * Default constructor. 
     */
    public UserServices() {
        // TODO Auto-generated constructor stub
    }

	
	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove_User(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User authenticate(String login, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
