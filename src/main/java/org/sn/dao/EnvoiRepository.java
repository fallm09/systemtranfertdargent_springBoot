package org.sn.dao;

import org.sn.entities.Envoie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnvoiRepository extends JpaRepository<Envoie, Integer> {
	Envoie save(Envoie e);
	
}
