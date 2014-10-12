package com.PictureNetwork.services;

import java.util.List;
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
    }
    
    
	public void addBlackList(BlackList blacklist) {
		em.persist(blacklist);
	}
	
	public void updateBlackList(BlackList blacklist) {
		em.merge(blacklist);
		//BlackList managedBlackList =  em.merge(blacklist);
	}
	
	public void removeBlackList(int idword) {
		em.remove(em.find(BlackList.class, idword));
	}
	
	
	
	
	public List<BlackList> findAll() {
		return em.createQuery("select w from BlackList w", BlackList.class).getResultList();
	}
	
	public BlackList findBlackListById(int idword) {
		return em.find(BlackList.class, idword);
	}


	
	

}












