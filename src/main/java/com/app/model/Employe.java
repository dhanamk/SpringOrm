package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="springorm")
public class Employe {

	
	@Id
	@Column(name="eid")
	private Integer empI;
	
	@Column(name="ename")
	private String empName;
	
	
	@Column(name="esal")
	private Double empSal;

	public Employe() {
		super();
	}
	
	

	public Employe(Integer empId, String empName, Double empSal) {
		super();
		this.empI = empId;
		this.empName = empName;
		this.empSal = empSal;
	}



	public Employe(Integer empId) {
		super();
		this.empI = empId;
	}



	public Integer getEmpId() {
		return empI;
	}

	public void setEmpId(Integer empId) {
		this.empI = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

	@Override
	public String toString() {
		return "Employe [empId=" + empI + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
		
	
}
