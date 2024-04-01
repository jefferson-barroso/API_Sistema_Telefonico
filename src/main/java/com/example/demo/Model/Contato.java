package com.example.demo.Model;

import java.util.Objects;

import com.example.demo.enums.TipoContato;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class Contato {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(max=60)
	private String nome; 
	
	@Email
	private String email;
	
	@NotBlank
	@Pattern(regexp="^\\(?(\\d{2})\\)?[- ]?(\\d{4,5})[- ]?(\\d{4})$", message="Número de telefone brasileiro inválido")
    private String numero;

	
	@NotNull
	@Column(name = "tipo_contato", nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoContato tipoContato; 
	
	
	public Contato() {
		
	}
	



	public Contato(Long id, @NotBlank @Size(max = 60) String nome, @Email String email,
			@NotBlank @Pattern(regexp = "[0-9]{10,11}") String numero, @NotBlank TipoContato tipoContato) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.numero = numero;
		this.tipoContato = tipoContato;
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




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
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




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
}
