package org.sn;



import org.sn.dao.EmetteurRepository;
import org.sn.dao.EnvoiRepository;
import org.sn.dao.RecepteurRepository;

import org.sn.entities.Recepteur;
import org.sn.entities.Envoie;
import org.sn.entities.Emetteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class AngularApiApplication implements CommandLineRunner {
	
	@Autowired
	private RecepteurRepository recepteurRepository;
	@Autowired
	private EnvoiRepository envoiRepository;
	@Autowired
	private EmetteurRepository emetteurRepository;
	
	
	
	public static void main (String [] args) {
		SpringApplication.run(AngularApiApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		
		Recepteur Emetteur = new Recepteur ();
		Envoie envoie = new Envoie();
		Emetteur recepteur = new Emetteur();
		//EmetteurRepository emetteurRepository= (EmetteurRepository) new Emetteur();
	
		//envoie.setDateEnv(15/09/20);	
		//envoie.setMontant("412000");
		
		envoie.setEmetteur(emetteurRepository.findById(1).get());
		envoie.setRecepteur(recepteurRepository.findById(6).get());
		
		envoiRepository.save (envoie);
		
		//recepteurRepository.save(new Recepteur("Fall", "Mohamed","777052957"));
		// recepteurRepository.save(new Recepteur("0215199404850","Diouf", "Prince"));
		// recepteurRepository.save(new Recepteur("0215199404850","Niang", "Abdou"));
	
		//emetteurRepository.save(new Emetteur("fall","mareme","773454993","0215199404850", null));
			
	}
	
	

		

}
