package com.apisoccer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apisoccer.dao.TeamDao;
import com.apisoccer.domain.Message;
import com.apisoccer.domain.Team;

@Service
public class TeamService {
	
	@Autowired
	TeamDao teamDao;
	
	public Message saveTeams(List<Team> teams) {
		return teamDao.saveTeams(teams);
	}
	

}
