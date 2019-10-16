package com.prestador.apirest.resources;

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

import com.prestador.apirest.model.Especialidade;
import com.prestador.apirest.repository.EspecialidadeRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(value = "/especialidade")
@Api(value="API REST Especialidade")
@CrossOrigin(origins="*")
public class EspecialidadeResource {

	@Autowired
	EspecialidadeRepository especialidadeRepository;
	
	@GetMapping("/listaDeEspecialidade")
	@ApiOperation(value="Retorna uma lista de especialidade")
	public List<Especialidade> listaEspecialidades(){
		return especialidadeRepository.findAll();
	}
	
	@GetMapping("/buscaEspecialidade/{id}")
	@ApiOperation(value="Retorna um especialidade")
	public Especialidade listaProdutoUnico(@PathVariable(value="id") long id){
		return especialidadeRepository.findById(id);
	}

	@PostMapping("/salvaEspecialidade")
	@ApiOperation(value="Salva um especialidade")
	public Especialidade salvaProduto(@RequestBody Especialidade especialidade) {
		return especialidadeRepository.save(especialidade);
	}
	
	@DeleteMapping("/deleteEspecialidade")
	@ApiOperation(value="Deleta um especialidade")
	public void deletaProduto(@RequestBody Especialidade especialidade) {
		especialidadeRepository.delete(especialidade);
	}
	
	@PutMapping("/atualizaEspecialidade")
	@ApiOperation(value="Atualiza um prestador")
	public Especialidade atualizaProduto(@RequestBody Especialidade especialidade)
	{
		return especialidadeRepository.save(especialidade);
	}
	
}
