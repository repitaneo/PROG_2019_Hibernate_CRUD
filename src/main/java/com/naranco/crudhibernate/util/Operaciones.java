package com.naranco.crudhibernate.util;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import com.naranco.crudhibernate.beans.Alumnado;

public class Operaciones {

	private EntityManager entity;
	
	
	public Operaciones() {
		
		entity = Conexion.getConexion();
	}
	
	
	
	public void insertar(Alumnado alumnado) {
		
		entity.getTransaction().begin();
		entity.persist(alumnado);
		entity.getTransaction().commit();
	}
	
	
	public void actualizar(Alumnado alumnado) {
		
		//entity.beginTransaction();
		//entity.update(alumnado);
		entity.getTransaction().commit();
	}	
	
	
	public void borrar(Alumnado alumnado) {
		
		//entity.beginTransaction();
		//entity.delete(alumnado);
		entity.getTransaction().commit();
	}	
	
	
	@SuppressWarnings("unchecked")
	public List<Alumnado> getAlumnado() {
		
		return entity.createQuery("FROM Alumnado").getResultList();

	}
}
