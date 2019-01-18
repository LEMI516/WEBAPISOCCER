package com.apisoccer.imp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.apisoccer.dao.TeamDao;
import com.apisoccer.domain.Message;
import com.apisoccer.domain.Team;

@Repository
public class TeamDaoImp implements TeamDao {

	@Override
	public Message saveTeams(List<Team> teams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message AllTeams() {
		// TODO Auto-generated method stub
		return null;
	}

}
