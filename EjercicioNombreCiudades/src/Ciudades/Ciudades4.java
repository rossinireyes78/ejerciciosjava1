package Ciudades;

import java.util.ArrayList;
//import java.util.List;


public class Ciudades4 {

	public static void main(String[] args) {
		//int temp;
		ArrayList<String> ciudad=new ArrayList<String>();
	
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
		  System.out.println("ciudades"+ciudad);
		  
		  System.out.println("-----arreglos por caracteres-----");
		
		  
		  char[] nomCiudadlongitud = ciu1.toCharArray();
		  	  for(int i=0;i<nomCiudadlongitud.length;i++){
		
		  		System.out.print(nomCiudadlongitud[i]+"|");
		  	  }
		  	System.out.print("    "); 
		  		 
		  	char[] nomCiudadlongitud2 = ciu2.toCharArray();
		  	  for(int i=0;i<nomCiudadlongitud2.length;i++){
		  		  
		  		System.out.print(nomCiudadlongitud2[i]+"|");
		  	  }
		  	System.out.print("    ");
		  	
		  	  char[] nomCiudadlongitud3 = ciu3.toCharArray();
		  	  for(int i=0;i<nomCiudadlongitud3.length;i++){
		  		  
		  		System.out.print(nomCiudadlongitud3[i]+"|");
		  	  }
		  	System.out.print("    ");
		  	
		  	char[] nomCiudadlongitud4 = ciu4.toCharArray();
		  	  for(int i=0;i<nomCiudadlongitud4.length;i++){
		  		  
		  		System.out.print(nomCiudadlongitud4[i]+"|");
		  	  }
		  	System.out.print("    ");
		  	
		  	char[] nomCiudadlongitud5 = ciu5.toCharArray();
		  	  for(int i=0;i<nomCiudadlongitud5.length;i++){
		  		  
		  		System.out.print(nomCiudadlongitud5[i]+"|");
		  	  }
		  	System.out.print("    ");
        
		  	char[] nomCiudadlongitud6 = ciu6.toCharArray();
		  	  for(int i=0;i<nomCiudadlongitud6.length;i++){
		  		  
		  		System.out.print(nomCiudadlongitud6[i]+"|");
		  	  }
		 	  	  
		  	System.out.println();
		  	System.out.println("*****nombres de ciudades inversos*****");
		  	for (int i=ciu1.length()-1;i>=0;i--) {
				
		  		  System.out.print(nomCiudadlongitud[i]+"|");
		  	  }
		  	System.out.print("    ");
		  	
		  	for (int i=ciu2.length()-1;i>=0;i--) {
				
		  		  System.out.print(nomCiudadlongitud2[i]+"|");
		  	  }
		  	System.out.print("    ");
		  	
		  	for (int i=ciu3.length()-1;i>=0;i--) {
				
		  		  System.out.print(nomCiudadlongitud3[i]+"|");
		  	  }
		  	System.out.print("    ");
		  	
		  	for (int i=ciu4.length()-1;i>=0;i--) {
				
		  		  System.out.print(nomCiudadlongitud4[i]+"|");
		  	  }
		  	System.out.print("    ");
		  	
		  	for (int i=ciu5.length()-1;i>=0;i--) {
				
		  		  System.out.print(nomCiudadlongitud5[i]+"|");
		  	  }
		  	System.out.print("    ");
		  	
		  	for (int i=ciu6.length()-1;i>=0;i--) {
				
		  		  System.out.print(nomCiudadlongitud6[i]+"|");
		  	  }
		  }

}
