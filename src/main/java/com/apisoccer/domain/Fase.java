package com.apisoccer.domain;

import java.io.Serializable;

public class Fase implements Serializable{
	private String id;
	private String n;
	private Integer n2;
	private String name;
	private Integer pos;
	private String type;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	public Integer getN2() {
		return n2;
	}
	public void setN2(Integer n2) {
		this.n2 = n2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPos() {
		return pos;
	}
	public void setPos(Integer pos) {
		this.pos = pos;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{ id: \""+getId()+"\" " + 
				" n: \""+getN()+"\"" + 
				" n2: "+getN2()+" "+ 
				" name: \""+getName()+"\" " + 
				" pos: "+getPos()+" " + 
				" type: \""+getType()+"\"}";
	}
	
	

}
