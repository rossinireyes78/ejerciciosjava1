package Ciudades;

import java.util.ArrayList;
import java.util.List;


public class Ciudad3 {
	public static void main(String[] args) {
	
	List<String> ciudad = new ArrayList<>();
	System.out.println("     Introduce nombres de 6 ciudades:   ");
	  Teclado_ciu in= new Teclado_ciu();
	  String ciu1=in.getString("1era.ciudad ");
	  String ciu2=in.getString("2da.ciudad  ");
	  String ciu3=in.getString("3era.ciudad ");
	  String ciu4=in.getString("4ta.ciudad  ");
	  String ciu5=in.getString("5ta.ciudad  ");
	  String ciu6=in.getString("6ta.ciudad  ");
	  ciudad.add(ciu1);
	  ciudad.add(ciu2);
	  ciudad.add(ciu3);
	  ciudad.add(ciu4);
	  ciudad.add(ciu5);
	  ciudad.add(ciu6);
	 
	  List<String> ciudadesmodificadas = new ArrayList<>();
	 	    System.out.println("listado de ciudades origen:   "+ciudad);
	 	    
	 	    
	 	   for(int i=0;i<ciudad.size();i++){
	 		   String cd=ciudad.get(i);
	 		   String cd2=cd.replace('a', '4');
	 		  ciudadesmodificadas.add(cd2);
          }	
	 	   
	 	  System.out.print("      Remplazando las a con 4:    " + ciudadesmodificadas);
	  }
				 
	
}
