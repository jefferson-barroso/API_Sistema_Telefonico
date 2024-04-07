package com.example.demo.Model;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Grupo {
	
	    
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @NotBlank
	    @Size(max = 60)
	    private String nome;

	    @ManyToMany(mappedBy = "grupos")
	    private Set<Contato> contatos = new HashSet<>();
	    
	    public Grupo() {
	    	
	    }

		public Grupo(Long id, @NotBlank @Size(max = 60) String nome, Set<Contato> contatos) {
			this.id = id;
			this.nome = nome;
			this.contatos = contatos;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Set<Contato> getContatos() {
			return contatos;
		}

		public void setContatos(Set<Contato> contatos) {
			this.contatos = contatos;
		}
		
		

	   
	}

