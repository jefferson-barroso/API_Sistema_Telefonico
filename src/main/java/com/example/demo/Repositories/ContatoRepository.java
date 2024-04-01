package com.example.demo.Repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Contato;
import com.example.demo.enums.TipoContato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato,Long> {
	 List<Contato> findByTipoContato(TipoContato tipoContato);
	
}
