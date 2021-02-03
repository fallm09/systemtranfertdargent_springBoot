package org.sn.web;

import java.util.List;

import java.util.Optional;

import org.sn.dao.EmetteurRepository;
import org.sn.entities.Emetteur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmetteurRestService {
	@Autowired
	private EmetteurRepository emetteurRepository;
	@RequestMapping(value="/emetteurs",method=RequestMethod.GET)
	public List<Emetteur> getEmetteurs(){
		return emetteurRepository.findAll();
	}
	@RequestMapping(value="/emetteurs/{id}",method=RequestMethod.GET)
	public Emetteur getEemetteurs(@PathVariable Integer id){
		return emetteurRepository.findById(id).orElse(null);
	}
	
	@RequestMapping(value="/emetteurs",method=RequestMethod.POST)
	public Emetteur save(@RequestBody Emetteur e){
		return emetteurRepository.save(e);
	}
	
	
	@RequestMapping(value="/emetteurs/{id}",method=RequestMethod.DELETE)
	public boolean suprimmer (@PathVariable Integer id){
		emetteurRepository.deleteById(id);
		return true;
	}
	

	@RequestMapping(value="/emetteurs/{id}",method=RequestMethod.PUT)
	public Emetteur save (@PathVariable Integer id ,@RequestBody Emetteur e){
			e.setIde(id); 
		return emetteurRepository.save(e);
	}
	
}


	
	
	

	


