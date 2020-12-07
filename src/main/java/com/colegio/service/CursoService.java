package com.colegio.service;



import java.util.List;

import com.colegio.entity.Curso;

public interface CursoService {
	
	public abstract Curso inserta(Curso obj);
	
	public List<Curso> listaCursos();
	
	public List<Curso> listaCursoPorNombre(String nombre);
	

}
