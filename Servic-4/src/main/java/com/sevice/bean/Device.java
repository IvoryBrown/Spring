package com.sevice.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dolgozok")
public class Device {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 @Column(name = "idugyintezo")
	private Long id;
	@Column(name = "ugyintezo_neve")
	private String name;
	@Column(name = "technikus_neve")
	private String population;


	public Device() {
	}

	public Device(Long id, String name, String population) {
		this.id = id;
		this.name = name;
		this.population = population;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "City{" + "id=" + id + ", name=" + name + ", population=" + population + '}';
	}

}