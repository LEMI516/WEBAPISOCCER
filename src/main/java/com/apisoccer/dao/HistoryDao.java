package com.apisoccer.dao;

import java.util.List;

import com.apisoccer.domain.History;
import com.apisoccer.domain.Message;

public interface HistoryDao {
	
	public Message saveHistory(List<History> historyList);
	
	public Message AllHistory();

}
