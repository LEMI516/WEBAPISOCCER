package com.apisoccer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apisoccer.dao.CompetenciaEquipoDao;
import com.apisoccer.domain.CompetenciaTeam;
import com.apisoccer.domain.Message;

@Service
public class CompetenciaEquipoServices {
	
	@Autowired
	CompetenciaEquipoDao competenciaEquipoDao;
	
	public Message saveCompetenciaTeams(List<CompetenciaTeam> competenciaTeams) {
		return competenciaEquipoDao.saveCompetenciaTeams(competenciaTeams);
	}
	
	public Message AllCompetenciaTeams() {
		return competenciaEquipoDao.AllCompetenciaTeams();
	}	

}
