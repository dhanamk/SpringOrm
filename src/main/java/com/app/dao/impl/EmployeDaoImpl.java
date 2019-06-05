package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IEmployeDao;
import com.app.model.Employe;
@Repository
public class EmployeDaoImpl implements IEmployeDao {


	@Autowired
	private HibernateTemplate ht;
	
	
	public Integer saveEmploye(Employe emp) {
		return (Integer) ht.save(emp);
	}

	public void updateEmploye(Employe emp) {

		ht.update(emp);
	}

	public void deleteEmploye(Integer id) {

		ht.delete(new Employe(id));
	}

	public Employe getOne(Integer id) {
		return ht.get(Employe.class, id);
	}

	public List<Employe> getAllEmploye() {
		return ht.loadAll(Employe.class);
	}

}
