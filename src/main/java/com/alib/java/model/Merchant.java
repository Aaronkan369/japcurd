package com.alib.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="94brand")
public class Merchant {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String country;
	private Double thvalue;
	private Double fovalue;
	private Double fivalue;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Double getThvalue() {
		return thvalue;
	}
	public void setThvalue(Double thvalue) {
		this.thvalue = thvalue;
	}
	public Double getFovalue() {
		return fovalue;
	}
	public void setFovalue(Double fovalue) {
		this.fovalue = fovalue;
	}
	public Double getFivalue() {
		return fivalue;
	}
	public void setFivalue(Double fivalue) {
		this.fivalue = fivalue;
	}
	@Override
	public String toString() {
		return "Merchant [id=" + id + ", name=" + name + ", country=" + country + ", thvalue=" + thvalue + ", fovalue="
				+ fovalue + ", fivalue=" + fivalue + "]";
	}

	
	
}
