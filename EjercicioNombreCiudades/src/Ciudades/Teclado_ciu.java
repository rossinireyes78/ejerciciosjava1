package Ciudades;
import java.util.Scanner;

public class Teclado_ciu {
	private Scanner scanner;
	public Teclado_ciu() {
		scanner = new Scanner(System.in);
	}
	
	
	public Scanner getScanner() {
		return scanner;
	}


	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}


	public String getString(String titulo) {
		String c1="";
		while (c1.equals("")) {
		  System.out.println(titulo);
		   c1=scanner.next();
		   if (!c1.matches("Barcelona") && !c1.matches("Madrid") && !c1.matches("Cadis") && !c1.matches("Valencia") && !c1.matches("Malaga") && !c1.matches("Santander") ) {
              c1="";
              
              
		   }  
		   
		}
		return c1;
		
	}
	
	}

