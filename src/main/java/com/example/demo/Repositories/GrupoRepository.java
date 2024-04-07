package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Grupo;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {

}
