package com.PictureNetwork.services;

import java.util.List;

import javax.ejb.Remote;

import com.PictureNetwork.persistance.User;

@Remote
public interface UserServicesRemote {

	User authenticate(String login,String password);
	User createUser(User user );
	User findUserById(int id);
	void updateUser(User user);
	void removeUser(User user);
	void remove_User(int id);
	List<User> findAllUser();
}
