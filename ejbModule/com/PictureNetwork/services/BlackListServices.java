package com.PictureNetwork.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.PictureNetwork.persistance.BlackList;

/**
 * Session Bean implementation class BlackListServices
 */
@Stateless

public class BlackListServices implements BlackListServicesRemote, BlackListServicesLocal {

	@PersistenceContext( unitName ="PictureNetwork")
	 private EntityManager em;
    public BlackListServices() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void createBlackList(BlackList blacklist) {
		
	}

	@Override
	public void updateBlackList(BlackList blacklist) {

		
	}

	@Override
	public void removeBlackList(BlackList blacklist) {
		// TODO Auto-generated method stub
		
	}

}
