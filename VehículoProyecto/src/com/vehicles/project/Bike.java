package com.vehicles.project;

import java.util.List;

public class Bike extends Vehicle {

	public Bike(String placa, String modelo, String color) {
		super(placa, modelo, color);
	}

	public void addTwoWheels(List<Wheel> wheels) throws Exception {
		if (wheels.size() != 2)
			throw new Exception();

		Wheel rightWheel = wheels.get(0);
		Wheel leftWheel = wheels.get(1);

		if (!rightWheel.equals(leftWheel))
			throw new Exception();

		this.wheels.add(leftWheel);
		this.wheels.add(rightWheel);
	}

	@Override
	public void rodar() {
		System.out.println("---------------------LISTOS PARA RODAR-------------------------");

	}

	@Override
	public String toString() {
		return "placa: " + placa + "   modelo: " + modelo + "   color:" + color + "   ruedas: " + wheels.size();
	}

}
