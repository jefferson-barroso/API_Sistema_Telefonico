package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Contato;
import com.example.demo.Repositories.ContatoRepository;
import com.example.demo.enums.TipoContato;

@RestController
@RequestMapping("/telefones")
public class ContatoController {

	@Autowired
	ContatoRepository contatoRepository;	



	
	@GetMapping
    public List<Contato> listar() {
    	return contatoRepository.findAll();
    	
    }
	
	 @GetMapping("/tipo/{tipoContato}")
	    public List<Contato> getContatosByTipo(@PathVariable TipoContato tipoContato) {
	        return contatoRepository.findByTipoContato(tipoContato);
	    }
	
	@ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Contato adicionar(@RequestBody Contato contato) {
        return  contatoRepository.save(contato);
    }
	

}
