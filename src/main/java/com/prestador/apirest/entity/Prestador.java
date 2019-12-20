package com.prestador.apirest.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="TB_PRESTADOR")
public class Prestador implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String nome_prestador;
	
	private String endereco;
	
	private Double latitude;
	
	private Double longitude;
	
    @ManyToMany
    @JoinTable(name = "TB_PRESTADOR_ESPECIALIDADE",
            joinColumns = @JoinColumn(name = "id_prestador"),
            inverseJoinColumns = @JoinColumn(name = "id_especialidade"))
    private List<Especialidade> especialidades;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_prestador() {
		return nome_prestador;
	}

	public void setNome_prestador(String nome_prestador) {
		this.nome_prestador = nome_prestador;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public List<Especialidade> getEspecialidades() {
		return especialidades;
	}

	public void setEspecialidades(List<Especialidade> especialidades) {
		this.especialidades = especialidades;
	}
	
}

