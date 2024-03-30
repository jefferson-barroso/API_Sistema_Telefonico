package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato,Long> {

}
