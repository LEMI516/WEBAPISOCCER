package com.apisoccer.imp;

import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.apisoccer.dao.CompetenciaEquipoDao;
import com.apisoccer.domain.CompetenciaTeam;
import com.apisoccer.domain.Message;
import com.apisoccer.domain.Plantilla;

@Repository
public class CompetenciaEquipoDaoImp implements CompetenciaEquipoDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;	
	
	@Override
	public Message saveCompetenciaTeams(List<CompetenciaTeam> competenciaTeams) {
		// TODO Auto-generated method stub
		Message msg=new Message();
		msg.setMsg("");
		msg.setStatus(Message.OK);
		msg.setResult(true);
		try {
			 String sql = "INSERT INTO plantilla (id,fasep,id_comp,team) VALUES (?,?,?,?)";
			 jdbcTemplate.batchUpdate(sql, competenciaTeams, 100,
		            (PreparedStatement ps, CompetenciaTeam c) -> {
		                ps.setInt(1, c.getId());
		                ps.setInt(2, c.getFasep());
		                ps.setString(3, c.getId_comp());
		                ps.setString(4, c.getTeam());
		            }
		     );			
		} catch (Exception e) {
			msg.setMsg(e.getMessage());
			msg.setStatus(Message.FAIL);
			msg.setResult(false);
			e.printStackTrace();
		}
		return msg;
	}

	@Override
	public Message AllCompetenciaTeams() {
		// TODO Auto-generated method stub
		return null;
	}

}
