package com.idat.MicroservicioPizzeria.service;

import java.util.List;

import com.idat.MicroservicioPizzeria.model.Pizzeria;

public interface IPizzeriaService {

	public List<Pizzeria> listarPizzerias();
	public void guardarPizzeria(Pizzeria pizzer);
	public void asignarPizzas();
}
