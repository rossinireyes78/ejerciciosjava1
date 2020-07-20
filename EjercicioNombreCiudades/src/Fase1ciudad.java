import java.util.Scanner;
public class Fase1ciudad {
	
	public static void main(String[] args) {
		try (
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("            Introduscan nombres de 6 ciudades    ");	
			System.out.print("Ingresa nombre ciudad1: ");
			String ciu1 = scanner.nextLine();
			System.out.print("Ingresa nombre ciudad2: ");
			String ciu2 = scanner.nextLine();
			System.out.print("Ingresa nombre ciudad3: ");
			String ciu3 = scanner.nextLine();
			System.out.print("Ingresa nombre ciudad4: ");
			String ciu4 = scanner.nextLine();
			System.out.print("Ingresa nombre ciudad5: ");
			String ciu5 = scanner.nextLine();
			System.out.print("Ingresa nombre ciudad6: ");
			String ciu6 = scanner.nextLine();
			System.out.println("Ciudad1:" +ciu1+ "  C1iudad2:" +ciu2+ "  Ciudad3:" +ciu3+ "  Ciudad4:" +ciu4+   "  Ciudad5:" +ciu5+   "  Ciudad6:" +ciu6);
		}
		
      }
	}


