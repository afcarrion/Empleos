package com.carricas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.carricas.model.Vacante;
import com.carricas.service.VacantesServiceImpl;

@Controller
@RequestMapping("/vacantes")
public class VacantesController {
	
	@Autowired
	private VacantesServiceImpl serviceVacante;
	
	@GetMapping("/create")
	public String crear() {
		return "/vacantes/formVacante";
	}
	
	@GetMapping("/view/{id}")
	public String verDetalle(@PathVariable("id") int idVacante, Model model) {
		/*System.out.println("Id Vacante: " + idVacante);*/
		Vacante vacante = serviceVacante.buscarPorId(idVacante);
		System.out.println(vacante);
		model.addAttribute("vacante", vacante);
		return "detalle";
	}
	
	@GetMapping("/delete")
	public String eliminar(@RequestParam("id") int idVacante, Model model) {
		System.out.println("Borrando Vacante de Id: " + idVacante);
		model.addAttribute("id",idVacante);
		return "mensaje";
	}
	
	@PostMapping("/save")
	public String guardar(@RequestParam("nombre") String nombre, @RequestParam("descripcion") String descripcion,
			@RequestParam("estatus") String estatus, @RequestParam("fecha") String fecha, @RequestParam("destacado") int destacado,
			@RequestParam("salario") Double salario, @RequestParam("detalles") String detalles) {
		System.out.println("Nombre Vacante: " + nombre);
		System.out.println("Descripcion: " + descripcion);
		System.out.println("Estatus: " + estatus);
		System.out.println("Fecha: " + fecha);
		System.out.println("Destacado: " + destacado);
		System.out.println("Salario: " + salario);
		System.out.println("Detalles: " + detalles);
		
		return "vacantes/listVacantes";
	}
	
	
}
