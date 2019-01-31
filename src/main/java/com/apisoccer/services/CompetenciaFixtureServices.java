package com.apisoccer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apisoccer.dao.CompetenciaFixtureDao;
import com.apisoccer.domain.CompetenciaFixture;
import com.apisoccer.domain.Message;

@Service
public class CompetenciaFixtureServices {
	
	@Autowired
	CompetenciaFixtureDao competenciaFixtureDao;
	
	public Message saveCompetenciaFixtures(List<CompetenciaFixture> competenciaFixtures) {
		return competenciaFixtureDao.saveCompetenciaFixtures(competenciaFixtures);
	}
	
	public Message AllCompetenciaFixtures() {
		return competenciaFixtureDao.AllCompetenciaFixtures();
	}	

}
