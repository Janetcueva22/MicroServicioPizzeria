package com.idat.MicroservicioPizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.idat.MicroservicioPizzeria.model.PizzeriaDetalle;

@Repository
public interface IPizzeriaPizzaRepository extends JpaRepository<PizzeriaDetalle, Integer>{

}
