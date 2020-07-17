import java.util.ArrayList;
import java.util.List;

public class Fase2 {

	public static void main(String[] args) {
		String string = "Rossini";
		List<Character> chars = new ArrayList<>();
		
        for (char ch: string.toCharArray()) {
	    chars.add(ch);
	     }
		System.out.println(chars);
		
		
		
		//recorrer la lista y mostrar si es vocal , consonante y q no contiene numeros
		int contador=0;
		int cons=0;
		for(int x=0;x<string.length();x++) {
		if ((string.charAt(x)=='a') || (string.charAt(x)=='e') || (string.charAt(x)=='i') || (string.charAt(x)=='o') || (string.charAt(x)=='u')){ 
		    contador++;
		    System.out.println(string.charAt(x)+ "      posición   " +x+ "  es Vocal" );
		 } else if ((string.charAt(x)=='0')|| (string.charAt(x)=='1')||(string.charAt(x)=='2')|| (string.charAt(x)=='3')||(string.charAt(x)=='4')|| (string.charAt(x)=='5')||(string.charAt(x)=='6')|| (string.charAt(x)=='7')||(string.charAt(x)=='8')|| (string.charAt(x)=='9'))  {
			 
			 
				 System.out.println(string.charAt(x)+ "      posición   " +x+  "  los nombres no contienen numeros ");
			    } else { 
	        	cons++;
			    	System.out.println(string.charAt(x)+ "      posición   " +x+  "  es consonante");
		}
	  }
		 System.out.println("  Vocales encontradas   "+ contador );
		 System.out.println( "  Consonantes encontradas   "  +cons );
	}
}