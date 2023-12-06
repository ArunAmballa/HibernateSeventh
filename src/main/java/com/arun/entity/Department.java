package com.arun.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department 
{
	@Id
	private String deptId;
	
	private String deptName;
	
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Employee1> employee;


	public String getDeptId() {
		return deptId;
	}


	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public Set<Employee1> getEmployee() {
		return employee;
	}


	public void setEmployee(Set<Employee1> employee) {
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", employee=" + employee + "]";
	}
	
	
	

}
