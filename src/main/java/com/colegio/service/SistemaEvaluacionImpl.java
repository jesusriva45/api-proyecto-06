package com.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.colegio.entity.SistemaEvaluacion;
import com.colegio.repository.SistemaEvaluacionRepository;

public class SistemaEvaluacionImpl implements SistemaEvaluacionService{
	
	
	@Autowired
	private SistemaEvaluacionRepository repository;

	@Override
	public List<SistemaEvaluacion> listaSistemaEvaluacion() {
		return repository.findAll();
	}

	@Override
	public List<SistemaEvaluacion> listaSistemaEvaluacionPorNombre(String nombre) {
		return repository.listaPorNombre(nombre);
	}
	
	

	

}
