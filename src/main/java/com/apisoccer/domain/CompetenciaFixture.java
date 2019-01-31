package com.apisoccer.domain;

import java.io.Serializable;

public class CompetenciaFixture implements Serializable{
	private Fase fase;
	private String fk;
	private Integer gd;
	private Integer gl;
	private Integer gv;
	private Integer id;
	private String id_comp;
	private String pkf;
	private Integer pun;
	private String team;
	public Fase getFase() {
		return fase;
	}
	public void setFase(Fase fase) {
		this.fase = fase;
	}
	public String getFk() {
		return fk;
	}
	public void setFk(String fk) {
		this.fk = fk;
	}
	public Integer getGd() {
		return gd;
	}
	public void setGd(Integer gd) {
		this.gd = gd;
	}
	public Integer getGl() {
		return gl;
	}
	public void setGl(Integer gl) {
		this.gl = gl;
	}
	public Integer getGv() {
		return gv;
	}
	public void setGv(Integer gv) {
		this.gv = gv;
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
	public String getPkf() {
		return pkf;
	}
	public void setPkf(String pkf) {
		this.pkf = pkf;
	}
	public Integer getPun() {
		return pun;
	}
	public void setPun(Integer pun) {
		this.pun = pun;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	
	

}
