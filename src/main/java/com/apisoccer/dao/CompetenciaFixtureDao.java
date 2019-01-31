package com.apisoccer.dao;

import java.util.List;

import com.apisoccer.domain.CompetenciaFixture;
import com.apisoccer.domain.Message;

public interface CompetenciaFixtureDao {
	
	public Message saveCompetenciaFixtures(List<CompetenciaFixture> competenciaFixtures);
	
	public Message AllCompetenciaFixtures();	

}
