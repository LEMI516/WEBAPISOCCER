package com.apisoccer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apisoccer.dao.CompetenciaDao;
import com.apisoccer.domain.Message;
import com.apisoccer.domain.Competencia;

@Service
public class CompetenciaServices {
	
	@Autowired
	CompetenciaDao competenciaDao;
	
	public Message saveCompetencias(List<Competencia> competencias) {
		return competenciaDao.saveCompetencias(competencias);
	}
	
	public Message AllCompetencias() {
		return competenciaDao.AllCompetencias();
	}	

}
