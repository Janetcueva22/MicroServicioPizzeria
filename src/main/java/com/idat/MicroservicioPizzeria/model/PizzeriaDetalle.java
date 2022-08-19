package com.idat.MicroservicioPizzeria.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="detalle_pizzeria")
public class PizzeriaDetalle {

	@Id
	private PizzeriaPizzaFK fk= new PizzeriaPizzaFK();

	public PizzeriaPizzaFK getFk() {
		return fk;
	}

	public void setFk(PizzeriaPizzaFK fk) {
		this.fk = fk;
	}
}
