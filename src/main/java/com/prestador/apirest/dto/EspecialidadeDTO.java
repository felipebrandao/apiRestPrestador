package com.prestador.apirest.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.prestador.apirest.entity.Especialidade;

public class EspecialidadeDTO {

	private long id;

	private String nome_especialidade;

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
	
	public EspecialidadeDTO(Especialidade especialidade) {
		this.id = especialidade.getId();
		this.nome_especialidade = especialidade.getNome_especialidade();
	}

	public static List<EspecialidadeDTO> converterListaDTO(List<Especialidade> listaDeEspecialidade) {
		return listaDeEspecialidade.stream().map(EspecialidadeDTO::new).collect(Collectors.toList());
	}

	public Especialidade converterEspecialidade() {
		return new Especialidade(this.id, this.nome_especialidade);
	}

}
