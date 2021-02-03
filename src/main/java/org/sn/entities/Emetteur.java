package org.sn.entities;

import java.io.Serializable;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity

public class Emetteur implements Serializable{	  

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ide;
    @Column(length=75)
    private String nomE;
    @Column(length=75)
    private String prenomE;
    @Column(length=75)
    private String telE;
    @Column(length=75)
    private String cinE;

	@OneToMany(cascade = CascadeType.ALL ,mappedBy = "emetteur" , 
			targetEntity=Envoie.class,fetch = FetchType.LAZY )
	private List<Envoie> envoies = new ArrayList<Envoie>();
	
    
	public Emetteur() {
		super();
	}

	
	public Emetteur(String nomE, String prenomE, String telE, String cinE, List<Envoie> envoies) {
		super();
		this.nomE = nomE;
		this.prenomE = prenomE;
		this.telE = telE;
		this.cinE = cinE;
		this.envoies = envoies;
	}






	public int getIde() {
		return ide;
	}


	public void setIde(int ide) {
		this.ide = ide;
	}


	public String getNomE() {
		return nomE;
	}


	public void setNomE(String nomE) {
		this.nomE = nomE;
	}


	public String getPrenomE() {
		return prenomE;
	}


	public void setPrenomE(String prenomE) {
		this.prenomE = prenomE;
	}


	public String getTelE() {
		return telE;
	}


	public void setTelE(String telE) {
		this.telE = telE;
	}


	public String getCinE() {
		return cinE;
	}


	public void setCinE(String cinE) {
		this.cinE = cinE;
	}


	public List<Envoie> getEnvoies() {
		return envoies;
	}


	public void setEnvoies(List<Envoie> envoies) {
		this.envoies = envoies;
	}



	
	
	
	

}
