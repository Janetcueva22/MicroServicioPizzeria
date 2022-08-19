package com.idat.MicroservicioPizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.MicroservicioPizzeria.model.Pizzeria;

public interface IPizzeriaRepository extends JpaRepository<Pizzeria, Integer>{

}
