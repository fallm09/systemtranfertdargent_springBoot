package org.sn.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "envoie")
public class Envoie implements Serializable{

	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	@Column(length=75)
	private Date dateEnv;
	@Column(length=75)
	private String montant;
	@ManyToOne(fetch = FetchType.EAGER , 
			cascade = { 
	                CascadeType.MERGE,
	                CascadeType.REFRESH
			 }) 
	@JoinColumn(name = "emetteur_id")
	private Emetteur emetteur;
	@ManyToOne(fetch = FetchType.EAGER , 
			cascade = { 
	                CascadeType.MERGE,
	                CascadeType.REFRESH
			 })
	
	@JoinColumn(name = "recepteur_idr")
	private Recepteur recepteur;
	
	
	
	public Envoie(Date dateEnv, String montant, Recepteur recepteur, Emetteur emetteur) {
		super();
		this.dateEnv = dateEnv;
		this.montant = montant;
		this.recepteur = recepteur;
		this.emetteur = emetteur;
	}
	public Envoie() {
		
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateEnv() {
		return dateEnv;
	}
	public void setDateEnv(Date dateEnv) {
		this.dateEnv = dateEnv;
	}
	public String getMontant() {
		return montant;
	}
	public void setMontant(String montant) {
		this.montant = montant;
	}
	public Emetteur getEmetteur() {
		return this.emetteur;
	}
	public void setRecepteur(Recepteur recepteur) {
		this.recepteur = recepteur;
	}
	public Recepteur getRecepteur() {
		return this.recepteur;
	}
	public void setEmetteur(Emetteur emetteur) {
		this.emetteur= emetteur;
		
	}

	
	  
	  
}
