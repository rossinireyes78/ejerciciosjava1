
public class Ejercicio3 {
	 public static void main(String[] args) {
         
        boolean a = true;
         int año_nac=1978;
         if  ((año_nac % 4 == 0 && año_nac % 100 != 0) || (año_nac% 100 == 0 && año_nac % 400 == 0)){
        	 System.out.println(a+"       es bisiesto       " + año_nac); 
           
         }
         else {
        	 a=false;
        	 System.out.println(a+"      no es bisiesto     "+año_nac); 
         }   
      
           System.out.println("Bisiestos hasta el año de nacimiento");
           for (int i=1948;i<=año_nac;i++) {
           if  ((i % 4 == 0 && i % 100 != 0) || (i% 100 == 0 && i % 400 == 0)) {
                System.out.println(i); 
            
            }   
      }
           String nom="Rossini Yadira", ape=" Reyes Borbor" ,nom_ape=nom+ape;
  	     String año="30/08/1978";
  	     //int año_nac=1978;
  	     System.out.println("                                ");
  	     System.out.println("Mi nombre es :   " +nom_ape);
  	     System.out.println("Nací:        :   " +año);
  	     
  	     if  ((año_nac % 4 == 0 && año_nac % 100 != 0) || (año_nac%100 == 0 && año_nac%400 == 0)) {
               System.out.println("             Mi año de naciemiento es bisiesto      "); 
             
           }
           else {
          	 System.out.println("              Mi año de nacimiento no es bisiesto     "); 
           }   
  	    
    
    }
}
