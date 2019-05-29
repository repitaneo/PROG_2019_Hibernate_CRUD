package com.naranco.crudhibernate.util;


import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.naranco.crudhibernate.beans.Alumnado;


public class Conexion {

	private static SessionFactory sesion = null;
	
	public static SessionFactory getConexion() {
		
		if(sesion == null) {
			
			Configuration config = new Configuration();
			config.configure("hibernate.cfg.xml");
			config.addAnnotatedClass(Alumnado.class);
			
			ServiceRegistry service 
			= new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			
			sesion = config.buildSessionFactory(service);
		}
		return sesion;
	}
}
