package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IEmployeDao;
import com.app.model.Employe;
import com.app.service.IEmployeService;
@Service
public class EmployeServiceImpl implements IEmployeService {

	@Autowired
	private IEmployeDao dao;
	
	

	@Transactional
	public Integer saveEmploye(Employe emp) {
		return dao.saveEmploye(emp);
	}

	@Transactional
	public void updateEmploye(Employe emp) {

		dao.updateEmploye(emp);
	}


	@Transactional
	public void deleteEmploye(Integer id) {

		dao.deleteEmploye(id);
	}


	@Transactional(readOnly=true)
	public Employe getOne(Integer id) {
		return dao.getOne(id);
	}


	@Transactional(readOnly=true)
	public List<Employe> getAllEmploye() {
		return dao.getAllEmploye();
	}

}
