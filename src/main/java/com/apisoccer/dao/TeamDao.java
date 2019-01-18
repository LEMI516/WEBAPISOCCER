package com.apisoccer.dao;

import java.util.List;

import com.apisoccer.domain.Message;
import com.apisoccer.domain.Team;

public interface TeamDao {
	
	public Message saveTeams(List<Team> teams);
	
	public Message AllTeams();

}
