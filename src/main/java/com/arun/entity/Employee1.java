package com.arun.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Employee1
{
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private Float sal;
	
	private String address;

	
	
	public Employee1(String name, Float sal, String address) {
		super();
		this.name = name;
		this.sal = sal;
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", sal=" + sal + ", address=" + address + "]";
	}
	
	
}
