package com.colegio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.entity.SistemaEvaluacion;
import com.colegio.service.SistemaEvaluacionService;


@RestController
@RequestMapping("/api/rest/sistemaevaluacion/")
public class SistemaEvaluacionController {
	
	@Autowired
	private SistemaEvaluacionService service;
	
	@GetMapping
	public ResponseEntity<List<SistemaEvaluacion>> lista() {
		return ResponseEntity.ok(service.listaSistemaEvaluacion());
	}
	
	@GetMapping("porNombre/{filtro}")
	public ResponseEntity<List<SistemaEvaluacion>> listaPorNombre(@PathVariable String filtro){
		return ResponseEntity.ok(service.listaSistemaEvaluacionPorNombre(filtro));
	}

}
