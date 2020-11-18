package com.floristeria.view;

import com.floristeria.project.*;

//import java.util.List;
import java.util.Scanner;

//import com.coets.project.Accion;

public class main_floristeria {
	private static FloristeriaRepo a�adir = new FloristeriaRepo();

	public static void main(String[] args) throws Exception  {

		Scanner e = new Scanner(System.in);
		System.out.print("ingrese   nombre  floristeria:    ");
		String nomf = e.next();
		System.out.print("         floristeria:    " + nomf);
		menu();
		int opcion = e.nextInt();
		while (opcion != 2) {
			if (!(opcion == 2)) {
                //A�ADE ARBOLES
				if (opcion == 1) {

					System.out.print("ingrese altura:    ");
					String altura = e.next();
					System.out.print("ingrese precio:     ");
					String precio = e.next();
					Arbol ar = new Arbol(altura, precio);
					a�adir.addArbol(ar);
					//System.out.println( a�adir.getAllArbols().size());
				}
				
				//A�ADE FLORES
				if (opcion == 2) {

					System.out.print("ingrese color:    ");
					String color = e.next();
					System.out.print("ingrese precio:     ");
					String precio = e.next();
					Flor flr =new Flor(color, precio);
					a�adir.addFlor(flr);
					//System.out.println( a�adir.getAllArbols().size());
				}

				//3 �ade decoraciones
				
				if (opcion == 3) {

					System.out.print("ingrese material:    ");
					menu1();
					
					String material = e.next();
					int opcion1 = e.nextInt();
					while (opcion1 != 0) {
					if (opcion1 == 1) {
						
					System.out.println("plastico");
					}
					if (opcion1 == 2) {
						System.out.println("material:   madera");
					}
					System.out.println("ingrese precio:     ");
					String precio = e.next();
					Decoracion mop =new Decoracion(material, precio);
					a�adir.addDecoracion(mop);
					//System.out.println( a�adir.getAllArbols().size());
				}

				
				
				// Cas 4 = Stock
				
				if (opcion == 4) {
					System.out.println( "STOCKS ARBOLES:  "+a�adir.getAllArbols().size());
					System.out.println( "STOCKS FLORES:  " +a�adir.getAllFlors().size());
					System.out.println( "STOCKS DECORACIONES:  "+a�adir.getAllDecoracion().size());
				}

			   }

			menu();
			opcion = e.nextInt();
		}
		e.close();
	}
	}
	public static void menu() {
		System.out.println("      \n Elige lo que deseas hacer     ");
		System.out.println("[1] A�ADE ARBOL");
		System.out.println("[2] A�ADE FLOR");
		System.out.println("[3] A�ADE DECORACION ");
		System.out.println("[4] STOCK");
		System.out.println("[0] SALIR");
	}

	public static void menu1() {
		System.out.println("[1] plastico   + [2] madera  ");
	}

}
