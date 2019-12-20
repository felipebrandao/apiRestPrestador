package com.prestador.apirest.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TB_ESPECIALIDADE")
public class Especialidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String nome_especialidade;
	
	@ManyToMany(mappedBy = "especialidades")
	private List<Prestador> prestadores;

	public Especialidade()
	{
		
	}

	public Especialidade(long id, String nome_especialidade) {
		this.id = id;
		this.nome_especialidade = nome_especialidade;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_especialidade() {
		return nome_especialidade;
	}

	public void setNome_especialidade(String nome_especialidade) {
		this.nome_especialidade = nome_especialidade;
	}

	public List<Prestador> getPrestadores() {
		return prestadores;
	}

	public void setPrestadores(List<Prestador> prestadores) {
		this.prestadores = prestadores;
	}
}
