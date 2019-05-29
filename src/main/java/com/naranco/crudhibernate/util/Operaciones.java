package com.naranco.crudhibernate.util;

import java.util.List;

import org.hibernate.Session;

import com.naranco.crudhibernate.beans.Alumnado;

public class Operaciones {

	private Session sesion;
	
	
	public Operaciones() {
		
		sesion = Conexion.getConexion().openSession();
	}
	
	
	
	public void insertar(Alumnado alumnado) {
		
		sesion.beginTransaction();
		sesion.delete(alumnado);
		sesion.getTransaction().commit();
	}
	
	
	public void actualizar(Alumnado alumnado) {
		
		sesion.beginTransaction();
		sesion.update(alumnado);
		sesion.getTransaction().commit();
	}	
	
	
	public void borrar(Alumnado alumnado) {
		
		sesion.beginTransaction();
		sesion.delete(alumnado);
		sesion.getTransaction().commit();
	}	
	
	
	public List<Alumnado> getAlumnado() {
		
		return sesion.createQuery("FROM Alumnado").list();

	}
}
