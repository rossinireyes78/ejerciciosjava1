package com.floristeria.project;

//import java.util.ArrayList;
//import java.util.List;

public class Arbol {
	
		//Atributos
	
		public String Altura;
		public String Precio;
	
	
		public Arbol (String Altura, String Precio) throws Exception {
		
		
		//Que no acepte campos vacios
		
		if (Altura.equals(""))
			throw new Exception("Tienes que introducir una altura");
		if (Precio.equals(""))
			throw new Exception("Tienes que introducir un precio");
		
		
		//Constructores
		
		this.Altura = Altura;
		this.Precio = Precio;
		
}
		// Getters i Setters

		public String getAltura() {
			return Altura;
		}
		public void setAltura(String altura) {
			Altura = altura;
		}

		public String getPrecio() {
			return Precio;
		}
		public void setPrecio(String precio) {
			Precio = precio;
		}

		//Metodos
		
		
}