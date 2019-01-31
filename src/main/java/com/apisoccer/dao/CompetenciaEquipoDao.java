package com.apisoccer.dao;

import java.util.List;

import com.apisoccer.domain.CompetenciaTeam;
import com.apisoccer.domain.Message;

public interface CompetenciaEquipoDao {
	
	public Message saveCompetenciaTeams(List<CompetenciaTeam> competenciaTeams);
	
	public Message AllCompetenciaTeams();	

}
