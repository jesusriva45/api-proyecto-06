package com.colegio.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "curso")
public class Curso {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCurso;

	private String codigo;

	private String nombre;
	
	private String estado;
	
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idSistemaEvaluacion")
	private SistemaEvaluacion sistemaEvaluacion;
	

}
