
public class Ejercicio3 {
	 public static void main(String[] args) {
         
        boolean a = true;
         int a�o_nac=1978;
         if  ((a�o_nac % 4 == 0 && a�o_nac % 100 != 0) || (a�o_nac% 100 == 0 && a�o_nac % 400 == 0)){
        	 System.out.println(a+"       es bisiesto       " + a�o_nac); 
           
         }
         else {
        	 a=false;
        	 System.out.println(a+"      no es bisiesto     "+a�o_nac); 
         }   
      
           System.out.println("Bisiestos hasta el a�o de nacimiento");
           for (int i=1948;i<=a�o_nac;i++) {
           if  ((i % 4 == 0 && i % 100 != 0) || (i% 100 == 0 && i % 400 == 0)) {
                System.out.println(i); 
            
            }   
      }
           String nom="Rossini Yadira", ape=" Reyes Borbor" ,nom_ape=nom+ape;
  	     String a�o="30/08/1978";
  	     //int a�o_nac=1978;
  	     System.out.println("                                ");
  	     System.out.println("Mi nombre es :   " +nom_ape);
  	     System.out.println("Nac�:        :   " +a�o);
  	     
  	     if  ((a�o_nac % 4 == 0 && a�o_nac % 100 != 0) || (a�o_nac%100 == 0 && a�o_nac%400 == 0)) {
               System.out.println("             Mi a�o de naciemiento es bisiesto      "); 
             
           }
           else {
          	 System.out.println("              Mi a�o de nacimiento no es bisiesto     "); 
           }   
  	    
    
    }
}
