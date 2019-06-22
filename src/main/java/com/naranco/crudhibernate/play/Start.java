package com.naranco.crudhibernate.play;


import com.naranco.crudhibernate.beans.Alumnado;
import com.naranco.crudhibernate.util.Operaciones;

import java.util.List;

import javax.persistence.EntityManager;


public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("holaaaaa");
		
		
		Alumnado alumno = new Alumnado();
		alumno.setIdAlumnado(0);
		alumno.setLocalidad("Oviedo");
		alumno.setNombre("Marcos");
		alumno.setTelefono("5555");
		
		
		
		Operaciones operaciones = new Operaciones();
		operaciones.insertar(alumno);
		
		
		
		
		List <Alumnado> listado = operaciones.getAlumnado();
		for(Alumnado alumnado : listado ) {
			
			System.out.println("--> ["+	alumnado.getIdAlumnado()+"] "+
								alumnado.getNombre());
		}		
		
		
	
		
		
		/*
		
		

		
		
		

		*/
		
		
	}
}
