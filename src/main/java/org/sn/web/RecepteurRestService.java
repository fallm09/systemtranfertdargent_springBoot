package org.sn.web;

import java.util.List;


import org.sn.dao.RecepteurRepository;

import org.sn.entities.Recepteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecepteurRestService {
	
	
	@Autowired
	private RecepteurRepository recepteurRepository ;
	
	@RequestMapping(value="/recepteur",method=RequestMethod.GET)
	public List<Recepteur> getRecepteur(){
		return recepteurRepository.findAll();
	}
	
	
	@RequestMapping(value="/recepteur/{id}",method=RequestMethod.GET)
	public Recepteur getReecepteur(@PathVariable Integer id){
		return recepteurRepository.findById(id).orElse(null);
		
	}
	
	
	@RequestMapping(value="/recepteur",method=RequestMethod.POST)
	public Recepteur save(@RequestBody Recepteur e){
		return recepteurRepository.save(e);
		
	}
	
	@RequestMapping(value="/recepteur/{id}",method=RequestMethod.PUT)
	public Recepteur save (@PathVariable Integer id ,@RequestBody Recepteur e){
			e.setId(id); ;
			return recepteurRepository.save(e);
	}
	

	@RequestMapping(value="/recepteur/{id}",method=RequestMethod.DELETE)
	public boolean suprimmer (@PathVariable Integer id){
		recepteurRepository.deleteById(id);
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
