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

import com.prestador.apirest.model.Prestador;
import com.prestador.apirest.repository.PrestadorRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping(value = "/prestador")
@Api(value="API REST Prestador")
@CrossOrigin(origins="*")
public class PrestadorResource {

	@Autowired
	PrestadorRepository prestadorRepository;
	
	@GetMapping("/listaPrestador")
	@ApiOperation(value="Retorna uma lista de prestador")
	public List<Prestador> listaPrestadores(){
		return prestadorRepository.findAll();
	}
	
	@GetMapping("/buscaPrestador/{id}")
	@ApiOperation(value="Retorna um prestador")
	public Prestador listaProdutoUnico(@PathVariable(value="id") long id){
		return prestadorRepository.findById(id);
	}

	@PostMapping("/salvaPrestador")
	@ApiOperation(value="Salva um prestador")
	public Prestador salvaProduto(@RequestBody Prestador prestador) {
		return prestadorRepository.save(prestador);
	}
	
	@DeleteMapping("/deletaPrestador")
	@ApiOperation(value="Deleta um prestador")
	public void deletaProduto(@RequestBody Prestador prestador) {
		prestadorRepository.delete(prestador);
	}
	
	@PutMapping("/atualizaPrestador")
	@ApiOperation(value="Atualiza um prestador")
	public Prestador atualizaProduto(@RequestBody Prestador prestador)
	{
		return prestadorRepository.save(prestador);
	}
	
	@GetMapping("/listaPrestadorMaisProximos")
	@ApiOperation(value="Retorna uma lista de prestador")
	public List<Prestador> listaPrestadores(@PathVariable(value="id") int id){
				
		return prestadorRepository.findAll();
	}
	
}
