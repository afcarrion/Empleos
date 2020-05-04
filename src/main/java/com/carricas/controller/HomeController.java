package com.carricas.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.carricas.model.Vacante;

@Controller
public class HomeController {
	
	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		List<Vacante> lista = getVacantes();
		model.addAttribute("vacantes",lista);
		return "tabla";
	}
	
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		Vacante vacante = new Vacante();
		vacante.setNombre("Ingeniero de comunicaciones");
		vacante.setDescripcion("Se solicita ingeniero para dar soporte a intranet");
		vacante.setFecha(new Date());
		vacante.setSalario(9000.0);
		
		model.addAttribute("vacante", vacante);
		return "detalle";
	}
	
	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		List<String> lista = new LinkedList<String>();
		lista.add("Ingeniero de Sistemas");
		lista.add("Auxiliar de contablidad");
		lista.add("Vendedor");
		lista.add("Arquitecto");
		
		model.addAttribute("listaEmpleos",lista);
		return "listado";
	}

	@GetMapping("/")
	public String mostrarHome(Model model) {
		/*
		 * model.addAttribute("mensaje", "Bienvenidos a EmpleosApp");
		 * model.addAttribute("fecha", new Date());
		 */

		String nombre = "Auxiliar de contabilidad";
		Date fechaPub = new Date();
		double salario = 9000.0;
		boolean vigente = true;

		model.addAttribute("nombre", nombre);
		model.addAttribute("fecha", fechaPub);
		model.addAttribute("salario", salario);
		model.addAttribute("vigente", vigente);

		return "home";
	}
	
	/**
	 * Metodo que regresa una lista de objetos de tipo Vacante
	 * @return
	 */
	
	private List<Vacante> getVacantes(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		List<Vacante> listaVacantes = new LinkedList<Vacante>();
		
		try {
			//Crear la oferta de trabajo 1
			Vacante vacante1 = new Vacante();
			vacante1.setId(1);
			vacante1.setNombre("Ingeniero Civil");
			vacante1.setDescripcion("Solicitamos Ingeniero civil para diseñar puente peatonal");
			vacante1.setFecha(sdf.parse("08-02-2019"));
			vacante1.setSalario(1000.0);
			vacante1.setDestacado(1);
			
			//Creamos la oferta de trabajo 1
			Vacante vacante2 = new Vacante();
			vacante2.setId(2);
			vacante2.setNombre("Contador Publico ");
			vacante2.setDescripcion("Importante empresa necesita contador publico con cinco años de experiencia certificada.");
			vacante2.setFecha(sdf.parse("23-12-2019"));
			vacante2.setSalario(10000.0);
			vacante2.setDestacado(0);
			
			//Creamos la oferta de trabajo 1
			Vacante vacante3 = new Vacante();
			vacante3.setId(3);
			vacante3.setNombre("Ingeniero Electrico");
			vacante3.setDescripcion("Empresa local requiere  ingeniero electrico para mantenimiento electrico");
			vacante3.setFecha(sdf.parse("15-04-2019"));
			vacante3.setSalario(550.0);
			vacante3.setDestacado(0);
			
			//Creamos la oferta de trabajo 1
			Vacante vacante4 = new Vacante();
			vacante4.setId(4);
			vacante4.setNombre("Ingeniero Mecanico");
			vacante4.setDescripcion("Empresa internacional automotriz requiere ingeniero con 4 años de experiencia ");
			vacante4.setFecha(sdf.parse("10-01-2019"));
			vacante4.setSalario(2400.0);
			vacante4.setDestacado(1);
			
			listaVacantes.add(vacante1);
			listaVacantes.add(vacante2);
			listaVacantes.add(vacante3);
			listaVacantes.add(vacante4);
			
			
		} catch (Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
		return listaVacantes;
	}
}
