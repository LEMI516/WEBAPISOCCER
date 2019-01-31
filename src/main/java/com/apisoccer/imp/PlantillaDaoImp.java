package com.apisoccer.imp;

import java.sql.PreparedStatement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.apisoccer.dao.PlantillaDao;
import com.apisoccer.domain.Message;
import com.apisoccer.domain.Plantilla;
import com.apisoccer.domain.Team;

@Repository
public class PlantillaDaoImp implements PlantillaDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;	

	@Override
	public Message savePlantillas(List<Plantilla> plantillas) {
		// TODO Auto-generated method stub
		Message msg=new Message();
		msg.setMsg("");
		msg.setStatus(Message.OK);
		msg.setResult(true);
		try {
			 String sql = "INSERT INTO plantilla (id,cantClaxGru,cantGru,cantMejTerceros,cantTeam,cantTeamxGru,cff,cfp,confederation,name,typeMatch,typeTeam,typeTorneo) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
			 jdbcTemplate.batchUpdate(sql, plantillas, 100,
		            (PreparedStatement ps, Plantilla p) -> {
		                ps.setInt(1, p.getId());
		                ps.setString(2, p.getCantClaxGru());
		                ps.setString(3, p.getCantGru());
		                ps.setString(4, p.getCantMejTerceros());
		                ps.setString(5, p.getCantTeam());
		                ps.setString(6, p.getCantTeamxGru());
		                ps.setString(7, p.getCff());
		                ps.setString(8, p.getCfp());
		                ps.setString(9, p.getConfederation());
		                ps.setString(10, p.getName());
		                ps.setString(11, p.getTypeMatch());
		                ps.setString(12, p.getTypeTeam());
		                ps.setString(13, p.getTypeTorneo());
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
	public Message AllPlantillas() {
		// TODO Auto-generated method stub
		return null;
	}

}
