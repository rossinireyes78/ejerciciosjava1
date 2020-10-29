package Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Restaurante1 {

	public static void main(String[] args) {
		 int b5=5,b10=10,b20=20,b50=50,b100=100,b200=200,b500=500;
		 int total = 0;
		 
	
	     //List<Integer> opcion = new ArrayList<>();
	    
	     String [] menu = {" Entrantes ", " Spaguettis a la Carbonara ",
	    		 " Butifarra con Alubias ", " Codillo al Horno ", " Mariscada "};
	     
	     int [] precio = {10,18,15,20,35};
	     
	     
	     for(int i=0;i<menu.length;i++){
	    	 System.out.println((i+1   )+menu[i]+"    " +"€" + precio[i]);
	       
	     }
	     
	}   
}

	   