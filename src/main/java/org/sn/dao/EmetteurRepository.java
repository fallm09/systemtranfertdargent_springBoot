package org.sn.dao;

import org.sn.entities.Emetteur;

import org.springframework.data.jpa.repository.JpaRepository;



public interface EmetteurRepository extends JpaRepository<Emetteur,Integer> {

	
	Emetteur save(Emetteur e);
	
	

}
