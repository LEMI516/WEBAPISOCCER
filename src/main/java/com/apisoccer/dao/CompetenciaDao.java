package com.apisoccer.dao;

import java.util.List;

import com.apisoccer.domain.Message;
import com.apisoccer.domain.Competencia;

public interface CompetenciaDao {
	
	public Message saveCompetencias(List<Competencia> competencias);
	
	public Message AllCompetencias();		

}
