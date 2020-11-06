package Restaurant;

//import java.util.ArrayList;

//import java.util.List;
//import java.util.Scanner;

public class Restaurante1 {

	public static void main(String[] args) {
		// int b5=0,b10=0,b20=0,b50=0,b100=0,b200=0,b500=0;
		// int total = 0;

		String[] menu = { " Entrante ", " Spaguettis a la Carbonara ", " Butifarra con Alubias ", " Codillo al Horno ",
				" Mariscada " };

		int[] precio = { 30, 35, 40, 50, 155 };

		for (int i = 0; i < menu.length; i++) {
			System.out.println((i + 1) + menu[i] + "    " + "€" + precio[i]);

		}

	}
}
