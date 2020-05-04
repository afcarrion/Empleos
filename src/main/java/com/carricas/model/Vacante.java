package com.carricas.model;

import java.util.Date;

import lombok.Data;

@Data
public class Vacante {
	
	private Integer Id;
	private String nombre;
	private String descripcion;
	private Date fecha;
	private Double salario;
	private Integer destacado;
	
	/*
	 *Este metodo esta sobre escrito desde la libreria lombok por eso no es necesario implementarlo.
	 * @Override
	public String toString() {
		return "Vacante [Id=" + Id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha
				+ ", salario=" + salario + "]";
	}*/
	
	
}
