package Ciudades;

import java.util.ArrayList;
import java.util.List;


public class Ciudad2 {
	

public static void main(String[] args) {
	String temp;
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
	  
	  	  for(int i=0;i<ciudad.size();i++){

	        for(int j=i+1;j<ciudad.size(); j++){

	        if(ciudad.get(j).compareTo(ciudad.get(i))<0){

	            temp=ciudad.get(j);
	            ciudad.set(j, ciudad.get(i));
	            ciudad.set(i,temp );   

	     }
	        }
	    }

	  
	  
	  System.out.println("Lista de las ciudades en orden alfabético:    "+ciudad);
	  
	  
	 
}


}