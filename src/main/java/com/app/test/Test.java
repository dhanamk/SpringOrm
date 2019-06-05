package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.model.Employe;
import com.app.service.IEmployeService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		IEmployeService service=ac.getBean("employeServiceImpl",IEmployeService.class);
		service.saveEmploye(new Employe(10, "Dhanamjaya", 2000.02));
		service.saveEmploye(new Employe(20, "Kakarla", 4000.02));
		service.saveEmploye(new Employe(30, "Gudur", 6000.02));
		
		
		//service.updateEmploye(new Employe(10, "Dhana", 3500.00));
		
		//service.deleteEmploye(10);
		
		//service.getAllEmploye().toString();
		
		System.out.println("Done");
		
		
	}
}
