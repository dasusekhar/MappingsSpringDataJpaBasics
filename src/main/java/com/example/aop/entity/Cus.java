package com.example.aop.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cus {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_item")
	private Ite ite;
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
	public Ite getIte() {
		return ite;
	}
	public void setIte(Ite ite) {
		this.ite = ite;
	}
	
	

}
