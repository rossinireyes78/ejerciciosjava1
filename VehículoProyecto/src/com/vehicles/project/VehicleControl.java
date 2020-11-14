package com.vehicles.project;

import java.util.Scanner;

public class VehicleControl {
	private Scanner scanner;

	public VehicleControl() {
		scanner = new Scanner(System.in);
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}
//METODO PARA QUE ACEPTE LA PLACA 4 NUMEROS Y 2 A 3 LETRAS MAYUSCULAS
	public String getString(String placacorrecta) {
		String c2 = "";
		while (c2.equals("")) {
			System.out.print(placacorrecta);
			c2 = scanner.next();
			if (!c2.matches("([0-9]{4,5})([A-Z]{2,4})")) {
				c2 = "";
			}
		}
		return c2;
	}
  // METODO PARA QUE ACEPTE EL DIAMETRO ENTRE 0.4 HASTA 4
	public double getDouble(String titulo) {
		double c1 = 0;
		while (c1 == 0) {
			System.out.print(titulo);
			c1 = scanner.nextDouble();
			if ((c1 < 0.4) || (c1 > 4)) {
				c1 = 0;

			}

		}
		return c1;
	}

}
