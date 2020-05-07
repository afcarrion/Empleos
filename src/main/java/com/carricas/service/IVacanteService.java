package com.carricas.service;

import java.util.List;

import com.carricas.model.Vacante;

public interface IVacanteService {
	
	List<Vacante> buscarTodas();
	
	Vacante buscarPorId(Integer idVacante);
}
