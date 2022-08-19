package com.idat.MicroservicioPizzeria.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.MicroservicioPizzeria.DTO.PizzaDTO;

@FeignClient(name="idat-pizza", url = "localhost:9010")
public interface OpenFeignClient {

	@GetMapping("/api/v1/pizza/listar")
	public List<PizzaDTO> listadoPizzas();
}
