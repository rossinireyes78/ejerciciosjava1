import java.util.ArrayList;
import java.util.List;

public class Fase4 {
	

	public static void main(String[] args ) {
		
		String string = "Rossini ";
		List<Character> chars = new ArrayList<>();
        for (char ch: string.toCharArray()) 
	    chars.add(ch);
	    
	    
		String string1 = "Reyes";
		List<Character> chars1 = new ArrayList<>();
        for (char ch: string1.toCharArray()) 
	    chars1.add(ch);
        
      
        List<Character> fullname = new ArrayList<>();
        fullname.addAll(chars);
        fullname.addAll(chars1);
        System.out.println(fullname);	
        

	}

}
