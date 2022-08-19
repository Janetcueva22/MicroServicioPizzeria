package com.idat.MicroservicioPizzeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MicroservicioPizzeria.DTO.PizzaDTO;
import com.idat.MicroservicioPizzeria.client.OpenFeignClient;
import com.idat.MicroservicioPizzeria.model.Pizzeria;
import com.idat.MicroservicioPizzeria.model.PizzeriaDetalle;
import com.idat.MicroservicioPizzeria.model.PizzeriaPizzaFK;
import com.idat.MicroservicioPizzeria.repository.IPizzeriaPizzaRepository;
import com.idat.MicroservicioPizzeria.repository.IPizzeriaRepository;

@Service
public class PizzeriaServiceImpl implements IPizzeriaService{

	@Autowired private IPizzeriaRepository repository;
	@Autowired private OpenFeignClient feign;
	@Autowired private IPizzeriaPizzaRepository pizzeriaPizzaRepository;
	
	@Override
	public List<Pizzeria> listarPizzerias() {
		return repository.findAll();
	}

	@Override
	public void guardarPizzeria(Pizzeria pizzer) {
		repository.save(pizzer);
	}

	@Override
	public void asignarPizzas() {
		List<PizzaDTO> listado=feign.listadoPizzas();
		
		PizzeriaDetalle detalle = null;
		PizzeriaPizzaFK fk = null;
		
		for(PizzaDTO pizzaDTO : listado) {
			
			detalle = new PizzeriaDetalle();
			fk = new PizzeriaPizzaFK();
			
			fk.setIdPizza(pizzaDTO.getIdPizza());
			fk.setIdPizerria(1);
		
			detalle.setFk(fk);
			pizzeriaPizzaRepository.save(detalle);
		}
	}

}
