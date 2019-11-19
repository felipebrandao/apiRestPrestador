package com.prestador.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prestador.apirest.entity.Prestador;

public interface PrestadorRepository extends JpaRepository<Prestador, Long> {

	Prestador findById(long id);
}
