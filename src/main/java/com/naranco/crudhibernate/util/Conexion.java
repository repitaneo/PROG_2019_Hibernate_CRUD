package com.naranco.crudhibernate.util;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.naranco.crudhibernate.beans.Alumnado;
import javax.persistence.Persistence;

public class Conexion {

	private static EntityManager entity = null;
	
	public static EntityManager getConexion() {
		
		
		if(entity == null) {
			
			EntityManagerFactory emf;
			
			emf = Persistence.createEntityManagerFactory("aplicacion2");
			entity = emf.createEntityManager();
		}
		return entity;
	}
}
