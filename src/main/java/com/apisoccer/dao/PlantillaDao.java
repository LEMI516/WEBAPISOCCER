package com.apisoccer.dao;

import java.util.List;

import com.apisoccer.domain.Message;
import com.apisoccer.domain.Plantilla;

public interface PlantillaDao {
	
	public Message savePlantillas(List<Plantilla> plantillas);
	
	public Message AllPlantillas();	

}
