package com.corso.vo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class FormCategoria {
	
	private Integer id; 
	
	@NotNull
	@Size(min=2, max=30, message=" inserire almeno due caratteri e non superare i 30 caratteri")
	@Pattern(regexp = "[a-zA-Z]{5}", message = "non rispetta il formato")
	private String nome; 
	
	@NotBlank(message = "last  name is blank ")
	private String descrizione;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	@Override
	public String toString() {
		return "FormCategoria [id=" + id + ", nome=" + nome + ", descrizione=" + descrizione + "]";
	}
	
	
}
