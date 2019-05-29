package com.naranco.crudhibernate.beans;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="alumnado")
public class Alumnado implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idalumnado")
	private int idAlumnado;
	@Column(name="nombre")
	private String nombre;
	@Column(name="telefono")
	private String telefono;
	@Column(name="localidad")
	private String localidad;
	
	
	
	@Override
	public String toString() {
		return "Alumnado [idAlumnado=" + idAlumnado + ", nombre=" + nombre + ", telefono=" + telefono + ", localidad="
				+ localidad + "]";
	}
	public int getIdAlumnado() {
		return idAlumnado;
	}
	public void setIdAlumnado(int idAlumnado) {
		this.idAlumnado = idAlumnado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	
	
	
	
	
}
