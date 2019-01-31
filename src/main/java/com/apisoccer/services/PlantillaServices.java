package com.apisoccer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apisoccer.dao.PlantillaDao;
import com.apisoccer.domain.Message;
import com.apisoccer.domain.Plantilla;

@Service
public class PlantillaServices {
	
	@Autowired
	PlantillaDao plantillaDao;
	
	public Message savePlantillas(List<Plantilla> plantillas) {
		return plantillaDao.savePlantillas(plantillas);
	}
	
	public Message AllPlantillas() {
		return plantillaDao.AllPlantillas();
	}

}
