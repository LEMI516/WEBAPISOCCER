package com.apisoccer.imp;

import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.apisoccer.dao.CompetenciaFixtureDao;
import com.apisoccer.domain.CompetenciaFixture;
import com.apisoccer.domain.Message;
import com.apisoccer.domain.Plantilla;

@Repository
public class CompetenciaFixtureDaoImp implements CompetenciaFixtureDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Message saveCompetenciaFixtures(List<CompetenciaFixture> competenciaFixtures) {
		// TODO Auto-generated method stub
		Message msg=new Message();
		msg.setMsg("");
		msg.setStatus(Message.OK);
		msg.setResult(true);
		try {
			 String sql = "INSERT INTO competencia_fixture (fk,gd,gl,gv,id,id_comp,pkf,pun,team,fase) VALUES (?,?,?,?,?,?,?,?,?,?)";
			 jdbcTemplate.batchUpdate(sql, competenciaFixtures, 100,
		            (PreparedStatement ps, CompetenciaFixture c) -> {
		                ps.setString(1, c.getFk());
		                ps.setInt(2, c.getGd());
		                ps.setInt(3, c.getGl());
		                ps.setInt(4, c.getGv());
		                ps.setInt(5, c.getId());
		                ps.setString(6, c.getId_comp());
		                ps.setString(7, c.getPkf());
		                ps.setInt(8, c.getPun());
		                ps.setString(9, c.getTeam());
		                ps.setString(10, c.getFase().toString());
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
	public Message AllCompetenciaFixtures() {
		// TODO Auto-generated method stub
		return null;
	}

}
