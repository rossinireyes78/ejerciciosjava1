package com.fase1;

import java.util.Scanner;


public class Fase1CoetApp {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		System.out.println("**************INGRESA DATOS DEL 1ER. COHETE************** ");
		System.out.print("Ingresa nombre del 1do. coete :  ");
		String coete1 = sc.next();
		System.out.print("Ingresa numero de propulsores :  ");
		int pro1 = sc.nextInt();
		Fase1Coet nue1 = new Fase1Coet(coete1, pro1);
		System.out.print(nue1.toString());
		

		// 2 cohete

		System.out.println("\n\n**************DATOS DEL 2DO. COHETE************** ");
		Fase1Coet nue2 = new Fase1Coet("LDSFJA32", 6);
		System.out.print(nue2.toString());
		sc.close();

	}

}
