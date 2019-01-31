package com.apisoccer.imp;

import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.apisoccer.dao.CompetenciaDao;
import com.apisoccer.domain.Competencia;
import com.apisoccer.domain.Message;


@Repository
public class CompetenciaDaoImp implements CompetenciaDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Message saveCompetencias(List<Competencia> competencias) {
		// TODO Auto-generated method stub
		Message msg=new Message();
		msg.setMsg("");
		msg.setStatus(Message.OK);
		msg.setResult(true);
		try {
			 String sql = "INSERT INTO competencia (id,competencia,edicion,name,pk,plantilla) VALUES (?,?,?,?,?,?)";
			 jdbcTemplate.batchUpdate(sql, competencias, 100,
		            (PreparedStatement ps, Competencia c) -> {
		                ps.setInt(1, c.getId());
		                ps.setString(2, c.getCompetencia());
		                ps.setInt(3, c.getEdicion());
		                ps.setString(4, c.getName());
		                ps.setString(5, c.getPk());
		                ps.setString(6, c.getPlantilla().toString());
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
	public Message AllCompetencias() {
		// TODO Auto-generated method stub
		return null;
	}

}
