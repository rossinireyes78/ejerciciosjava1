package com.fase2;

import java.util.ArrayList;
import java.util.List;

public class CoeteApp {
	public static void main(String[] args) throws Exception {

		// crear lista de hélices 1
		List<Helices> helices1 = new ArrayList<>();
		helices1.add(new Helices(10));
		helices1.add(new Helices(30));
		helices1.add(new Helices(80));
		// crear lista de hélices 2
		List<Helices> helices2 = new ArrayList<>();
		helices2.add(new Helices(30));
		helices2.add(new Helices(40));
		helices2.add(new Helices(50));
		helices2.add(new Helices(50));
		helices2.add(new Helices(30));
		helices2.add(new Helices(10));

		// crea cohetes con rocketId y lista de hélices.
		// List<Helices> helices1;
		Coete coete1 = new Coete("32WESSDS", 3, helices1);
		Coete coete2 = new Coete("LDSFJA32", 6, helices2);

		// imprimir coetes con el metodo 
		printRocketInfo(coete1);
		printRocketInfo(coete2);
	}

	public static void printRocketInfo (Coete coete) {
		System.out.println("*******COETE,#PROPULSOR Y POTENCIAS*******");
		String listPropPowerString = coete.listPropPower().toString().replaceAll(" (^ \\ [| \\ ] $) ", " ");
		System.out.println(coete.getCoeteId() + "  :  " + coete.getPropul() + "  :  " + listPropPowerString);
	}
}
