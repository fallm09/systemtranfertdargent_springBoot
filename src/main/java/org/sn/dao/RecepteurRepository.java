package org.sn.dao;



import org.sn.entities.Recepteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecepteurRepository extends JpaRepository<Recepteur, Integer> {

	Recepteur save(Recepteur e);
	
	

}
