package com.example.aop.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ite {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	 @OneToOne(cascade=CascadeType.ALL,mappedBy="ite")
	 private Cus cus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Cus getCus() {
		return cus;
	}
	public void setCus(Cus cus) {
		this.cus = cus;
	}
	 

}
