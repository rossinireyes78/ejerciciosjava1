import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Fase3 {
       
	public static void main(String[] args) {
	    Map<Character, Integer>diccionario = new HashMap<Character,Integer>();
		String string = "Rossini";
		List<Character> chars = new ArrayList<>();
		
		
        for (char ch: string.toCharArray()) {
	    chars.add(ch);
	     }
        System.out.println(chars);
	  
      
		for(int i=0;i<string.length();i++) {
			 if (diccionario.containsKey(string.charAt(i))){
				 diccionario.put(string.charAt(i),(diccionario.get(string.charAt(i))+1));
			 } else {
				 diccionario.put(string.charAt(i),1);
			 }
		  }
		System.out.println(diccionario.toString());
	}
	
}

		


		

		
	
	

	

	

