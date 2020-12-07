package com.colegio.service;

import java.util.List;

import com.colegio.entity.SistemaEvaluacion;

public interface SistemaEvaluacionService {
	
	public List<SistemaEvaluacion> listaSistemaEvaluacion();
	
	public List<SistemaEvaluacion> listaSistemaEvaluacionPorNombre(String nombre);

}
