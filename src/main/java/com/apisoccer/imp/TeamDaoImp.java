package com.apisoccer.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.apisoccer.dao.TeamDao;
import com.apisoccer.domain.Message;
import com.apisoccer.domain.Team;


@Repository
public class TeamDaoImp implements TeamDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Message saveTeams(List<Team> teams) {
		// TODO Auto-generated method stub
		Message msg=new Message();
		msg.setMsg("");
		msg.setStatus(Message.OK);
		msg.setResult(true);
		try {
			 String sql = "INSERT INTO team (id,conf,type,name,abre,parent,aux) VALUES (?,?,?,?,?,?,?)";
			 jdbcTemplate.batchUpdate(sql, teams, 100,
		            (PreparedStatement ps, Team t) -> {
		                ps.setInt(1, t.getId());
		                ps.setString(2, t.getConf());
		                ps.setString(3, t.getType());
		                ps.setString(4, t.getName());
		                ps.setString(5, t.getAbre());
		                ps.setString(6, t.getParent());
		                ps.setInt(7, t.getAux());
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
	public Message AllTeams() {
		// TODO Auto-generated method stub
		Message msg=new Message();
		msg.setMsg("");
		msg.setStatus(Message.OK);
		msg.setResult(true);
		try {
			List<Team> teams=jdbcTemplate.query("SELECT * FROM team", new TeamRowMapper());
			msg.setObj(teams);
		} catch (Exception e) {
			msg.setMsg(e.getMessage());
			msg.setStatus(Message.FAIL);
			msg.setResult(false);
			e.printStackTrace();
		}
		return msg;
	}
	
	private static class TeamRowMapper implements RowMapper<Team> {
        @Override
        public Team mapRow(ResultSet rs, int rowNum) throws SQLException {
        	Team t=new Team();
        	t.setId(rs.getInt("id"));
        	t.setConf(rs.getString("conf"));
        	t.setType(rs.getString("type"));
        	t.setName(rs.getString("name"));
        	t.setAbre(rs.getString("abre"));
        	t.setParent(rs.getString("parent"));
        	t.setAux(rs.getInt("aux"));
            return t;
        }
    }	

}
