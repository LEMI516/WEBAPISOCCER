package com.apisoccer.domain;

import java.io.Serializable;

public class Competencia implements Serializable{
	private String competencia;
	private Integer edicion;
	private Integer	id;
	private String name;
	private String pk;
	private Plantilla plantilla;
	public String getCompetencia() {
		return competencia;
	}
	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}
	public Integer getEdicion() {
		return edicion;
	}
	public void setEdicion(Integer edicion) {
		this.edicion = edicion;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPk() {
		return pk;
	}
	public void setPk(String pk) {
		this.pk = pk;
	}
	public Plantilla getPlantilla() {
		return plantilla;
	}
	public void setPlantilla(Plantilla plantilla) {
		this.plantilla = plantilla;
	}
	
	

}
