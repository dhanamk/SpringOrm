package com.app.dao;

import java.util.List;

import com.app.model.Employe;

public interface IEmployeDao {

	public Integer saveEmploye(Employe emp);
	
	public void updateEmploye(Employe emp);
	
	public void deleteEmploye(Integer id);
	
	public Employe getOne(Integer id);
	
	public List<Employe> getAllEmploye();
	
}
