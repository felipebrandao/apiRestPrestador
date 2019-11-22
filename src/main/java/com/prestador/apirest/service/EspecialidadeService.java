package com.prestador.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prestador.apirest.dto.EspecialidadeDTO;
import com.prestador.apirest.entity.Especialidade;
import com.prestador.apirest.repository.EspecialidadeRepository;

@Service
public class EspecialidadeService {
	
	@Autowired
	private EspecialidadeRepository especialidadeRepository;

	public List<EspecialidadeDTO> listar() {
		List<Especialidade> listaDeEspecialidade = especialidadeRepository.findAll(); 
		
		return EspecialidadeDTO.converterListaDTO(listaDeEspecialidade);
	}

	public EspecialidadeDTO buscarPorID(long id) {
		Especialidade especialidade = especialidadeRepository.findById(id);
		return new EspecialidadeDTO(especialidade);
	}

	public void salvar(EspecialidadeDTO especialidadeDTO) {
		Especialidade especialidade = especialidadeDTO.converterEspecialidade();  
		especialidadeRepository.save(especialidade);
	}

	public void excluir(EspecialidadeDTO especialidadeDTO) {
		Especialidade especialidade = especialidadeDTO.converterEspecialidade();
		especialidadeRepository.delete(especialidade);
	}

	

}
