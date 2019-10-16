package com.prestador.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prestador.apirest.model.Especialidade;

public interface EspecialidadeRepository extends JpaRepository<Especialidade, Long> {

	Especialidade findById(long id);

}
