package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fase2Vehiculo {

	public static void main(String[] args) throws Exception {

		List<Wheel> frontWheels = new ArrayList<Wheel>();
		List<Wheel> backWheels = new ArrayList<Wheel>();
		Scanner e = new Scanner(System.in);
		VehicleControl in = new VehicleControl();

		System.out.println("           DATOS DEL COCHE           ");
		// MATRICULA QUE ACEPTE 4 NUMEROS Y 2 A 3 LETRAS
		String placa = in.getString("Ingrese placa:     ");
		System.out.print("Ingrese modelo: ");
		String modelo = e.next();
		System.out.print("Ingrese color:  ");
		String color = e.next();
		Car n = new Car(placa, modelo, color);
		System.out.println("        COCHE CREADO         " + "\nPlaca:   " + n.placa + "      Modelo:  " + n.modelo
				+ "      Color:   " + n.color);

		// agregar 2 ruedas traseras y delanteras a tu coche
		System.out.println("  \nAGREGAR RUEDAS A TU COCHE    ");
		System.out.print("Marca de ruedas :   ");
		String marcrueda = e.next();

		// que acepte3 letras y 4 nnumeros
		double diame = in.getDouble("Diametro:     ");
		Wheel ruedas = new Wheel(marcrueda, diame);
		e.close();
		// AÑDIENDO LAS RUEDAS TRASERAS Y ELANTERAS AL ARRAY
		for (int i = 0; i < 2; i++) {
			backWheels.add(ruedas);
			frontWheels.add(ruedas);
		}
		System.out.println("Añadida: " + frontWheels.size() + " ruedas delanteras a tu coche");
		System.out.println("Añadida: " + backWheels.size() + " ruedas traseras a tu coche");

		n.addWheels(frontWheels, backWheels);
		n.rodar();
		System.out.println(n + "  marca de ruedas: " + ruedas.getMarcarueda() + "  Diametro de tus ruedas: "
				+ ruedas.getDiámetro());

	}

}