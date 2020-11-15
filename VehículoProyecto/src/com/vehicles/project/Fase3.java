package com.vehicles.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fase3 {
	public static void main(String[] args) throws Exception {

		List<Wheel> frontWheels = new ArrayList<Wheel>();
		List<Wheel> backWheels = new ArrayList<Wheel>();
		List<Wheel> wheels = new ArrayList<Wheel>();
		Scanner e = new Scanner(System.in);
		VehicleControl in = new VehicleControl();

		menu();
		int opcion = e.nextInt();
		while (opcion != 0) {
			if (!(opcion == 0)) {
				// MATRICULA QUE ACEPTE 4 NUMEROS Y 2 A 3 LETRAS
				String placa = in.getString("Ingrese placa:     ");
				System.out.print("ingrese modelo:    ");
				String modelo = e.next();
				System.out.print("ingrese color:     ");
				String color = e.next();

				if (opcion == 1) {
					System.out.println("    HAS CREADO UN COCHE   ");
					Car n = new Car(placa, modelo, color);
					System.out.println(
							"Placa:   " + n.placa + "      Modelo:  " + n.modelo + "      Color:   " + n.color);
					System.out.println("  \nAGREGAR RUEDAS A TU COCHE    ");

					// añadir 2 ruedas delanteras al coche
					System.out.print("Marca de ruedas :  ");
					String marcrueda = e.next();

					// que acepte el diametro de 0.4 hasta 4
					double diame = in.getDouble("Diametro:          ");
					int c = 0;
					Wheel ruedas = new Wheel(marcrueda, diame);
					// añadiendo ruedas delanteras y traseras
					for (int i = 0; i < 2; i++) {
						backWheels.add(ruedas);
						frontWheels.add(ruedas);
						c = i + 1;
					}
					System.out.println("Añadida: " + c + " ruedas delanteras a tu coche");
					System.out.println("Añadida: " + c + " ruedas traseras a tu coche");

					n.addWheels(frontWheels, backWheels);
					(frontWheels).removeAll(frontWheels);
					backWheels.removeAll(backWheels);
					n.rodar();
					System.out.println(n + "  marca de ruedas: " + ruedas.getMarcarueda() + "  Diametro de tus ruedas: "
							+ ruedas.getDiámetro());

				}
                //CREANDO MOTO
				if (opcion == 2) {
					System.out.println("    HAS CREADO UNA MOTO    ");

					Bike n = new Bike(placa, modelo, color);
					System.out.println(
							"Placa:   " + n.placa + "      Modelo:  " + n.modelo + "      Color:   " + n.color);
					System.out.println("  \nAGREGAR RUEDAS A TU MOTO    ");

					// añadir 2 ruedas delanteras al coche

					System.out.print("Marca de ruedas :   ");
					String marcrueda = e.next();
					double diame = in.getDouble("Diametro:     ");
					Wheel ruedas = new Wheel(marcrueda, diame);
					//AÑADIENDO AL ARRAY LAS RUEDAS DE LA MOTO
					int c = 0;
					for (int i = 0; i < 2; i++) {
						wheels.add(ruedas);
						c = i + 1;
					}
					System.out.println("Añadida: " + c + " ruedas a tu moto");
					n.addTwoWheels(wheels);
					wheels.removeAll(wheels);
					n.rodar();
					System.out.println(n + "  marca de ruedas: " + ruedas.getMarcarueda() + "  Diametro de tus ruedas: "
							+ ruedas.getDiámetro());

				}

			}
			menu();
			opcion = e.nextInt();
		}
		e.close();
	}

	public static void menu() {
		System.out.println("       Elige lo que desees crear      ");
		System.out.println("[1] COCHE");
		System.out.println("[2] MOTO");
		System.out.println("[0] SALIR");
	}

}
