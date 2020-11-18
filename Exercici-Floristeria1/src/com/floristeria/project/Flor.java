package com.floristeria.project;

//import java.util.List;


public class Flor extends Precio {

		//Atributos
	
		public String Color;
	
	
		public Flor(String color, String precio) throws Exception {
			super(precio);
			Color = color;
		
		
		
		//Que no acepte campos vacios
		
		if (Color.equals(""))
			throw new Exception("Tienes que introducir un color");
        if (precio.equals(""))
			throw new Exception("Tienes que introducir un precio");
		
		
		//Constructores
		
		this.Color = color;
		this.precio = precio;
		
}
		// Getters i Setters

		public String getColor() {
			return Color;
		}


		
		public void setColor(String color) {
			Color = color;
		}
		
		
}

