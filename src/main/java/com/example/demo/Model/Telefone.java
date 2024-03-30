package com.example.demo.Model;

import java.util.Objects;

import com.example.demo.enums.TipoContato;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
public class Telefone {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Pattern(regexp="[0-9]{10,11}", message="Número de telefone inválido")
	private String numero;
	
	@NotBlank
	private TipoContato tipoContato; 
	
	@ManyToOne
	private Contato contato;
	
	public Telefone() {
		
	}


	public Telefone(Long id,
			@NotBlank @Pattern(regexp = "[0-9]{10,11}", message = "Número de telefone inválido") String numero,
			@NotBlank TipoContato tipoContato, Contato contato) {
		super();
		this.id = id;
		this.numero = numero;
		this.tipoContato = tipoContato;
		this.contato = contato;
	}

	


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public TipoContato getTipoContato() {
		return tipoContato;
	}


	public void setTipoContato(TipoContato tipoContato) {
		this.tipoContato = tipoContato;
	}


	public Contato getContato() {
		return contato;
	}


	public void setContato(Contato contato) {
		this.contato = contato;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
