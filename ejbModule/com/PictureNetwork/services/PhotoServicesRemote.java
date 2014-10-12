package com.PictureNetwork.services;

import java.util.List;

import javax.ejb.Remote;

import com.PictureNetwork.persistance.Photo;

@Remote
public interface PhotoServicesRemote {
	
	void createPhoto(Photo photo); // a discuter ???
	Photo findPhotoById(int id);
	void updatePhoto(Photo photo);
	void removePhoto(Photo photo);
	void remove_Photo(int id);
	List<Photo> findAllPhoto();

}
