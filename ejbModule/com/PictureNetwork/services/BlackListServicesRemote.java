package com.PictureNetwork.services;

import javax.ejb.Remote;

import com.PictureNetwork.persistance.BlackList;

@Remote
public interface BlackListServicesRemote {

	void createBlackList(BlackList blacklist);
	void updateBlackList(BlackList blacklist);
	void removeBlackList(BlackList blacklist);
	
	
}
