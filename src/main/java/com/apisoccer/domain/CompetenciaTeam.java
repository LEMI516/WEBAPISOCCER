package com.apisoccer.domain;

import java.io.Serializable;

public class CompetenciaTeam implements Serializable{
	private Integer fasep;
	private Integer id;
	private String id_comp;
	private String team;
	
	public Integer getFasep() {
		return fasep;
	}
	public void setFasep(Integer fasep) {
		this.fasep = fasep;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getId_comp() {
		return id_comp;
	}
	public void setId_comp(String id_comp) {
		this.id_comp = id_comp;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	

}
