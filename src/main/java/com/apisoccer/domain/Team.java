package com.apisoccer.domain;

import java.io.Serializable;

public class Team implements Serializable {
	private Integer id;
	private String conf;
	private String type;
	private String name;
	private String abre;
	private String parent;
	private Integer aux;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getConf() {
		return conf;
	}
	public void setConf(String conf) {
		this.conf = conf;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbre() {
		return abre;
	}
	public void setAbre(String abre) {
		this.abre = abre;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public Integer getAux() {
		return aux;
	}
	public void setAux(Integer aux) {
		this.aux = aux;
	}
	
	
	
	

	
	
	


}
