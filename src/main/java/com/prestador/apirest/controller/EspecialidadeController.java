package com.prestador.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prestador.apirest.dto.EspecialidadeDTO;
import com.prestador.apirest.service.EspecialidadeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/especialidade")
@Api(value = "API REST Especialidade")
@CrossOrigin(origins = "*")
public class EspecialidadeController {

	@Autowired
	private EspecialidadeService especialidadeService;

	@GetMapping("/listaDeEspecialidade")
	@ApiOperation(value = "Retorna uma lista de especialidade")
	public List<EspecialidadeDTO> listaEspecialidades() {
		return especialidadeService.listar();
	}

	@GetMapping("/buscaEspecialidade/{id}")
	@ApiOperation(value = "Retorna um especialidade")
	public EspecialidadeDTO listaProdutoUnico(@PathVariable(value = "id") long id) {
		return especialidadeService.buscarPorID(id);
	}

	@PostMapping("/salvaEspecialidade")
	@ApiOperation(value = "Salva um especialidade")
	public EspecialidadeDTO salvaProduto(@RequestBody EspecialidadeDTO especialidade) {
		return especialidadeService.salvar(especialidade);
	}

	@DeleteMapping("/deleteEspecialidade")
	@ApiOperation(value = "Deleta um especialidade")
	public void deletaProduto(@RequestBody EspecialidadeDTO especialidade) {
		especialidadeService.excluir(especialidade);
	}

	@PutMapping("/atualizaEspecialidade")
	@ApiOperation(value = "Atualiza um prestador")
	public EspecialidadeDTO atualizaProduto(@RequestBody EspecialidadeDTO especialidade) {
		return especialidadeService.salvar(especialidade);
	}

}
