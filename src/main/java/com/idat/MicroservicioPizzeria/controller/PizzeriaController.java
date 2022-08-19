package com.idat.MicroservicioPizzeria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MicroservicioPizzeria.model.Pizzeria;
import com.idat.MicroservicioPizzeria.service.IPizzeriaService;

@Controller
@RequestMapping("/api/v1/pizzeria")
public class PizzeriaController {

	@Autowired private IPizzeriaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizzeria> listarPizzerias(){
		return service.listarPizzerias();
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarPizzeria(@RequestBody Pizzeria pizzer) {
		service.guardarPizzeria(pizzer);
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarPizzas() {
		service.asignarPizzas();
	}
}
