package com.apisoccer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apisoccer.dao.HistoryDao;
import com.apisoccer.domain.History;
import com.apisoccer.domain.Message;

@Service
public class HistoryService {
	
	@Autowired
	HistoryDao dao;
	
	public Message saveHistorys(List<History> historyList) {
		return dao.saveHistory(historyList);
	}
	
	public Message allHistorys() {
		return dao.AllHistory();
	}

}
