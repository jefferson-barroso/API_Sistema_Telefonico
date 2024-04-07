package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.GrupoContato;

@Repository
public interface GrupoContatoRepository extends JpaRepository<GrupoContato, Long>{

}
