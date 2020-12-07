package com.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entity.Curso;
import com.colegio.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService{

	@Autowired
	private CursoRepository repository;
	
	
	@Override
	public Curso inserta(Curso obj) {
		return repository.save(obj);
	}

	@Override
	public List<Curso> listaCursos() {
		return repository.findAll();
	}
	
	
	@Override
	public List<Curso> listaCursoPorNombre(String nombre) {
		return repository.listaPorNombre(nombre);
	}

	
}
