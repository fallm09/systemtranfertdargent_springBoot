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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "recepteur")
public class Recepteur implements Serializable{

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(length=75)
	private String nomE;
	@Column(length=75)
	private String prenomE;
	@Column(length=75)
	private String telE;
	
	@OneToMany (cascade = CascadeType.ALL , mappedBy = "recepteur" , targetEntity=Envoie.class,
	fetch = FetchType.LAZY)
	private List<Envoie> envoies = new ArrayList<Envoie>();
	
	

	public Recepteur() {
		super();
	}

	

	public Recepteur(String nomE, String prenomE, String telE) {
		super();
		this.nomE = nomE;
		this.prenomE = prenomE;
		this.telE = telE;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public List<Envoie> getEnvoies() {
		return envoies;
	}


	public void setEnvoies(List<Envoie> envoies) {
		this.envoies = envoies;
	}
	
	
	
	
}
