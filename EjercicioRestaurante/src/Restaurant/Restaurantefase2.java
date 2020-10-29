package Restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;





public class Restaurantefase2 {

	public static void main(String[] args) {
		Map<String, Integer>myMap1 = new HashMap<String,Integer>();

		int b5=0,b10=0,b20=0,b50=0,b100=0,b200=0,b500=0;
		 int total = 0;
		 
	
	     
	    
	     String [] menu = {"Entrantes", "Spaguettis a la Carbonara",
	    		 "Butifarra con Alubias", "Codillo al Horno", "Mariscada"};
	     
	     
	     int [] precio = {30,35,40,50,155};
	     
	     for(int i=0;i<menu.length;i++){
	    	 System.out.println((i+1   )+menu[i]+"    "  + precio[i] +"€");
	    	 myMap1.put(menu[i], precio[i]);
	       
	     }
	     
	     //elegir lo que desea comer y guardar en una lista
	     Scanner sc = new Scanner(System.in);
	     ArrayList<String> opcion = new ArrayList<>();
	    
	     
	     
	     System.out.println("¿*********  Elige lo que deseas comer  o (salir  S )*********?");
	    
	           
	     String n="";
	    
	 
	     boolean ok;
	    
		 while (!n.equalsIgnoreCase("S")) {
	    	 System.out.println("menu: ");
		     n = sc.nextLine(); 
		     ok=false;
		     for (String e:menu) {
		    	 if (e.equalsIgnoreCase(n)) {
		    		 opcion.add(n);
		    		 ok=true;
		    	 }
		     }
		     if (!ok) {
		    	 System.out.println("tu plato no existe en el menu");
		     }
		    	
		 }
		 sc.close();
		 System.out.println("Has elegido: " + opcion.size() +"platos ");
	     System.out.println(opcion);
	    
	     
	     //comparar la lista con el array si existe calcular el total caso contrario el plato no existe
	        int c=0;
			for (int i = 0; i < menu.length; i++) {
				for(int j=0;j<opcion.size(); j++){
					
			        if(opcion.get(j).equalsIgnoreCase(menu[i])){
                         c=c+1;			     
                         System.out.println(menu[i]+":  "+(precio[i]));
			        	 total+=precio[i];
			          }
					}     
				
			  }
	

			 
			System.out.println("De los cuales solo: "+c +"  existen en la carta ");
			System.out.println("total "+ total);
			
			while (total!=0){
				if (total>=500) {
					b500++;
					total-=500;
				}else if(total>=200) {	
					b200++;
					total-=200;
				}else if(total>=100) {	
					b100++;
					total-=100;	
				}else if(total>=50) {	
					b50++;
					total-=50;
				}else if(total>=20) {	
					b20++;
					total-=20;
				}else if(total>=10) {	
					b10++;
					total-=10;
				}else if(total>=5) {	
					b5++;
					total-=5;
					
				}
			}
			
			
	        if (b500>=1){
		       System.out.println(b500+ " billete de 500 ");
	        }
            if (b200>=1) {
		       System.out.println(b200+ " billete de 200 ");

	        } 
            if (b100>=1) {
	       	   System.out.println(b100+ " billete de 100 ");
	        }
	        if (b50>=1) {	
		       System.out.println(b50+ " billete de 50 ");
	        }
	        if (b20>=1) {	
	        	System.out.println(b20+ " billete de 20 ");
	        }
	        if (b10>=1) {	
		       System.out.println(b10+ " billete de 10 ");
	        }
	        if (b5>=1) {	
		       System.out.println(b5+ " billete de 5 ");
	        }
				
      }

}	


		



