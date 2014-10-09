package com.PictureNetwork.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.PictureNetwork.persistance.Subject;
import com.PictureNetwork.persistance.User;


@Stateless
public class UserServices implements UserServicesRemote, UserServicesLocal {

	@PersistenceContext(unitName = "PictureNetwork")
	private EntityManager em;
	
    public UserServices() {
        // TODO Auto-generated constructor stub
    }

	
	@Override
	public User findUserById(int id) {
		return em.find(User.class, id);
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
