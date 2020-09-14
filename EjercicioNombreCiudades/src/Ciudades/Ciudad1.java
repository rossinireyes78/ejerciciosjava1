package Ciudades;

public class Ciudad1 {

	public static void main(String[] args) {
		    	  System.out.println("     Introduce nombres de 6 ciudades:   ");
		    	  Teclado_ciu in= new Teclado_ciu();
		    	  String ciu1=in.getString("1era.ciudad ");
		    	  String ciu2=in.getString("2da.ciudad  ");
		    	  String ciu3=in.getString("3era.ciudad ");
		    	  String ciu4=in.getString("4ta.ciudad  ");
		    	  String ciu5=in.getString("5ta.ciudad  ");
		    	  String ciu6=in.getString("6ta.ciudad  ");
				  System.out.println("Ciudad1:" +ciu1+ "  C1iudad2:" +ciu2+ "  Ciudad3:" +ciu3+ "  Ciudad4:" +ciu4+   "  Ciudad5:" +ciu5+   "  Ciudad6:" +ciu6);
				 
	}

}
