package com.carricas.service;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.carricas.model.Vacante;

@Service
public class VacantesServiceImpl implements IVacanteService{
	
	List<Vacante> listaVacantes = null;
	
	public VacantesServiceImpl() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		listaVacantes = new LinkedList<Vacante>();
		
		try {
			//Crear la oferta de trabajo 1
			Vacante vacante1 = new Vacante();
			vacante1.setId(1);
			vacante1.setNombre("Ingeniero civil");
			vacante1.setDescripcion("Solicitamos Ingeniero civil para diseñar puente peatonal");
			vacante1.setFecha(sdf.parse("08-02-2019"));
			vacante1.setSalario(1000.0);
			vacante1.setDestacado(1);
			vacante1.setImagen("empresa1.png");
			
			//Creamos la oferta de trabajo 1
			Vacante vacante2 = new Vacante();
			vacante2.setId(2);
			vacante2.setNombre("Contador Publico ");
			vacante2.setDescripcion("Importante empresa necesita contador publico con cinco años de experiencia certificada.");
			vacante2.setFecha(sdf.parse("23-12-2019"));
			vacante2.setSalario(10000.0);
			vacante2.setDestacado(0);
			vacante2.setImagen("empresa2.png");
			
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
			vacante4.setImagen("empresa4.png");
			
			listaVacantes.add(vacante1);
			listaVacantes.add(vacante2);
			listaVacantes.add(vacante3);
			listaVacantes.add(vacante4);
			
			
		} catch (Exception e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}
	
	public List<Vacante> buscarTodas() {
		return listaVacantes;
	}

	public Vacante buscarPorId(Integer idVacante) {
			for(Vacante v: listaVacantes) {
				if(v.getId()==idVacante) {
					return v;
				}
			}
		return null;
	}

	public void guardar(Vacante vacante) {
		listaVacantes.add(vacante);
	}

}
