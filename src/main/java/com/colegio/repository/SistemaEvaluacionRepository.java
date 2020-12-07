package com.colegio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.colegio.entity.SistemaEvaluacion;




public interface SistemaEvaluacionRepository extends JpaRepository<SistemaEvaluacion, Integer>{
	
	
	@Query("select x from sistemaevaluacion x where x.nombre = :var_filtro")
	public List<SistemaEvaluacion> listaPorNombre(@Param("var_filtro") String filtro);

}
