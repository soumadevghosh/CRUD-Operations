package com.CrudSpringBoot.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Nationality
{
	
	@Id
	private Integer Id;
	private String name;
	private String capital;
	private String updatedBy;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updatedOn;
	public Nationality() {
		
	}
	public Nationality(int id, String name, String capital, String updatedBy, Date updatedOn) {
		super();
		Id = id;
		this.name = name;
		this.capital = capital;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	
}
