package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Telefone;
import com.example.demo.Repositories.TelefoneRepository;

@RestController
@RequestMapping("/telefones")
public class TelefoneController {

	@Autowired
	TelefoneRepository telefoneRepository;

	public TelefoneController(TelefoneRepository telefonerepository) {
		super();
		this.telefoneRepository = telefonerepository;
	}
	
	
	@GetMapping
    public List<Telefone> listar() {
    	return telefoneRepository.findAll();
    	
    }
}
