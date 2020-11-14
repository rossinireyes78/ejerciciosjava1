package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehiculoApp {

	public static void main(String[] args) throws Exception {
		List<Wheel> frontWheels = new ArrayList<Wheel>();
		List<Wheel> backWheels = new ArrayList<Wheel>();
		Scanner e = new Scanner(System.in);

		System.out.println("           DATOS DEL COCHE           ");
		System.out.print("Ingrese placa:  ");
		String placa = e.next();
		System.out.print("Ingrese modelo: ");
		String modelo = e.next();
		System.out.print("Ingrese color:  ");
		String color = e.next();
		Car n = new Car(placa, modelo, color);
		System.out.println("        COCHE CREADO         " + "\nPlaca:   " + n.placa + "      Modelo:  " + n.modelo
				+ "      Color:   " + n.color);

		// agregar 2 ruedas traseras y delanteras a tu coche
		System.out.println("  \nAGREGAR RUEDAS A TU COCHE    ");

		// añadir 2 ruedas delanteras al coche

		System.out.print("Marca de ruedas :   ");
		String marcrueda = e.next();
		System.out.print("Diametros :         ");
		double diame = e.nextDouble();
		Wheel ruedas = new Wheel(marcrueda, diame);
		e.close();

		frontWheels.add(ruedas);
		frontWheels.add(ruedas);
		System.out.println("Añadida: " + frontWheels.size() + " ruedas delanteras a tu coche");

		backWheels.add(ruedas);
		backWheels.add(ruedas);
		System.out.println("Añadida: " + backWheels.size() + " ruedas traseras a tu coche");

		n.addWheels(frontWheels, backWheels);
		n.rodar();
		System.out.println(n + "  marca de ruedas: " + ruedas.getMarcarueda() + "  Diametro de tus ruedas: "
				+ ruedas.getDiámetro());

	}

}
