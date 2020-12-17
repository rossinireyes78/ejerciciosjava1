package com.fase3;

import java.util.ArrayList;
import java.util.Scanner;

public class Coete3App {

	public static void main(String[] args) {

		ArrayList<Helice3> Coete1_He = new ArrayList<Helice3>();
		Coete1_He.add(new Helice3(10, " Coete 1 - Propulsor 1 "));
		Coete1_He.add(new Helice3(30, " Coete 1 - Propulsor 2 "));
		Coete1_He.add(new Helice3(80, " Coete 1 - Propulsor 3 "));

		ArrayList<Helice3> Coete2_He = new ArrayList<Helice3>();
		Coete2_He.add(new Helice3(30, " Coete 2 - Propulsor 1 "));
		Coete2_He.add(new Helice3(40, "  Coete 2 - Propulsor 2 "));
		Coete2_He.add(new Helice3(50, "  Coete 2 - Propulsor 3 "));
		Coete2_He.add(new Helice3(50, "  Coete 2 - Propulsor 4 "));
		Coete2_He.add(new Helice3(30, "  Coete 2 - Propulsor 5 "));
		Coete2_He.add(new Helice3(10, "  Coete 2 - Propulsor 6 "));

		Coete3 Ncoe1 = new Coete3(" 32WESSDS ", Coete1_He);
		Coete3 Ncoe2 = new Coete3(" LDSFJA32 ", Coete2_He);
		System.out.println(" Coetet1 - Código: " + Ncoe1.getCoetecod() + " - Nº de propulsores: " + Coete1_He.size());
		for (int i = 0; i < Coete1_He.size(); i++) {
			System.out.println(" propulsor " + (i + 1) + " -Potencia Maxima: " + Coete1_He.get(i).getPotenciamax());
		}
		System.out.println(" -------------------------------------------------- ");
		System.out.println(" Coete2- Código: " + Ncoe2.getCoetecod() + " - Nº de propulsores: " + Coete2_He.size());
		for (int i = 0; i < Coete2_He.size(); i++) {
			System.out.println("propulsor " + (i + 1) + " -Potencia Maxima: " + Coete2_He.get(i).getPotenciamax());
		}

		boolean resp = false;
		System.out.println(" ---------------------------------- ");
		System.out.println(" Por favor, seleccione una de las opciones: ");
		System.out.println(" [1] - Establecer potencia a los Coetes  [2] - Salir ");
		Scanner salir = new Scanner(System.in);
		do {
			
			int input1 = salir.nextInt();
			switch (input1) {
			case 1:
				System.out.println("¿ Introducir potencia al coete 1? ");
				int input2 = salir.nextInt();
				System.out.println("¿ Introducir potencia al coete 2? ");
				int input3 = salir.nextInt();
				Ncoe1.setPod(input2);
				Ncoe2.setPod(input3);
				break;
			case 2:
				resp=true;
				break;
			}
		} while (resp!=true);
		salir.close();
	}
}
