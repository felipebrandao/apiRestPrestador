package com.prestador.apirest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prestador.apirest.dto.EspecialidadeDTO;
import com.prestador.apirest.repository.EspecialidadeRepository;

@Service
public class EspecialidadeService {
	
	@Autowired
	private EspecialidadeRepository especialidadeRepository;

	public List<EspecialidadeDTO> listar() {
		List<EspecialidadeDTO> listaDeEspecialidade = especialidadeRepository.findAll()
																			 .stream().map(EspecialidadeDTO::new)
																			 .collect(Collectors.toCollection(ArrayList::new)); 
		
		return listaDeEspecialidade;
	}

	public EspecialidadeDTO buscarPorID(long id) {
		EspecialidadeDTO especialidadeDTO = especialidadeRepository.findById(id)
				.map
		return ;
	}

	public EspecialidadeDTO salvar(EspecialidadeDTO especialidade) {
		// TODO Auto-generated method stub
		return null;
	}

	public void excluir(EspecialidadeDTO especialidade) {
		// TODO Auto-generated method stub
		
	}

	

}
