package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String placa;
	protected String modelo;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String placa, String modelo, String color) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.color = color;

	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModeloS() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public List<Wheel> getAllWheels() {
		return new ArrayList<>(wheels);
	}

	public abstract void rodar();

	@Override
	public String toString() {
		return " placa " + placa + " marca " + modelo + " color " + color + " wheels " + wheels;
	}

}