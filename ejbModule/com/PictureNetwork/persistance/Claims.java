package com.PictureNetwork.persistance;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "t_claims")
public class Claims implements Serializable {

	private int idclaim;
	private String dateclaims;
	private String claim;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdclaim() {
		return idclaim;
	}

	public void setIdclaim(int idclaim) {
		this.idclaim = idclaim;
	}

	public String getClaim() {
		return claim;
	}

	public void setClaim(String claim) {
		this.claim = claim;
	}

	
	public String getDateclaims() {
		return dateclaims;
	}

	public void setDateclaims(String dateclaims) {
		this.dateclaims = dateclaims;
	}

	public Claims() {

	}

	public Claims( String dateclaims, String claim) {
		
		this.dateclaims = dateclaims;
		this.claim = claim;
	}
	
	

}
