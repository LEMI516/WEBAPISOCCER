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
		Message msg=new Message();
		msg.setMsg("");
		msg.setStatus(Message.OK);
		msg.setResult(true);
		return msg;
	}

	@Override
	public Message AllTeams() {
		// TODO Auto-generated method stub
		return null;
	}

}
