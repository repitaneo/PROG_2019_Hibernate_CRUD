package com.naranco.crudhibernate.play;


import com.naranco.crudhibernate.beans.Alumnado;
import com.naranco.crudhibernate.util.Operaciones;

import java.util.List;


public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Operaciones operaciones = new Operaciones();
		List <Alumnado> listado = operaciones.getAlumnado();
		
		for(Alumnado alumnado : listado ) {
			
			System.out.println(	alumnado.getIdAlumnado()+" "+
								alumnado.getNombre());
		}
	}
}
