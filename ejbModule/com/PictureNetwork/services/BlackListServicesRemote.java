package com.PictureNetwork.services;

import java.util.List;

import javax.ejb.Remote;

import com.PictureNetwork.persistance.BlackList;

@Remote
public interface BlackListServicesRemote {

	public void addBlackList(BlackList blacklist) ;
	
	public void updateBlackList(BlackList blacklist) ;
	
	public void removeBlackList(int idword) ;
	
	public List<BlackList> findAll() ;
	
	public BlackList findBlackListById(int idword) ;
	
}


