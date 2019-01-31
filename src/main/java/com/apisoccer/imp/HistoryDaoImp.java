package com.apisoccer.imp;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.apisoccer.dao.HistoryDao;
import com.apisoccer.domain.History;
import com.apisoccer.domain.Message;
import com.apisoccer.domain.Team;


@Repository
public class HistoryDaoImp implements HistoryDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;	

	@Override
	public Message saveHistory(List<History> historyList) {
		// TODO Auto-generated method stub
		Message msg=new Message();
		msg.setMsg("");
		msg.setStatus(Message.OK);
		msg.setResult(true);
		try {
			 String sql = "INSERT INTO history (id,cam,sub,ter,cuar,torn,comp) VALUES (?,?,?,?,?,?,?)";
			 jdbcTemplate.batchUpdate(sql, historyList, 100,
		            (PreparedStatement ps, History h) -> {
		                ps.setInt(1, h.getId());
		                ps.setString(2, h.getCam());
		                ps.setString(3, h.getSub());
		                ps.setString(4, h.getTer());
		                ps.setString(5, h.getCuar());
		                ps.setString(6, h.getTorn());
		                ps.setString(7, h.getComp());
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
	public Message AllHistory() {
		// TODO Auto-generated method stub
		Message msg=new Message();
		msg.setMsg("");
		msg.setStatus(Message.OK);
		msg.setResult(true);
		try {
			List<History> historys=jdbcTemplate.query("SELECT * FROM history", new HistoryRowMapper());
			msg.setObj(historys);
		} catch (Exception e) {
			msg.setMsg(e.getMessage());
			msg.setStatus(Message.FAIL);
			msg.setResult(false);
			e.printStackTrace();
		}
		return msg;
	}
	
	private static class HistoryRowMapper implements RowMapper<History> {
        @Override
        public History mapRow(ResultSet rs, int rowNum) throws SQLException {
        	History h=new History();
        	h.setId(rs.getInt("id"));
        	h.setCam(rs.getString("cam"));
        	h.setSub(rs.getString("sub"));
        	h.setTer(rs.getString("ter"));
        	h.setCuar(rs.getString("cuar"));
        	h.setTorn(rs.getString("torn"));
        	h.setComp(rs.getString("comp"));
            return h;
        }
    }		

}
