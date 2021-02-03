package org.sn.web;

import java.util.List;

import org.sn.dao.EmetteurRepository;
import org.sn.dao.EnvoiRepository;
import org.sn.dao.RecepteurRepository;
import org.sn.entities.Emetteur;
import org.sn.entities.Envoie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class EnvoieRestService {
	@Autowired
	private EnvoiRepository envoiRepository;

	
	@RequestMapping(value="/envoie",method=RequestMethod.GET)
	public List<Envoie> getEnvoie(){
		return envoiRepository.findAll();
	}

	
	
	@RequestMapping(value="/envoie{id}",method=RequestMethod.GET)
	public Envoie getEnvoie(@PathVariable Integer id){
		return envoiRepository.findById(id).orElse(null);
	}
	@RequestMapping(value="/envoie",method=RequestMethod.POST)
	public Envoie save(@RequestBody Envoie e) {
		return envoiRepository.save(e) ;
	}
	
	@RequestMapping(value="/envoie/{id}",method=RequestMethod.DELETE)
	public boolean supprimer(@PathVariable Integer id) {
		envoiRepository.deleteById(id);
		return true;
		
	}
	@RequestMapping(value="/envoie/{id}",method=RequestMethod.PUT)
	public Envoie save (@PathVariable Integer id ,@RequestBody Envoie e){
			e.setId(id); 
		return envoiRepository.save(e);
	}
	
	
}
