package com.floristeria.project;

public class Decoracion {
	
		//Atributos
	
		public String Material;
		public String Precio;
		
	
		public Decoracion (String Material, String Precio) throws Exception {
		
		
		//Que no acepte campos vacios
		
		if (Material.equals(""))
			throw new Exception("Tienes que introducir una altura");
		if (Precio.equals(""))
			throw new Exception("Tienes que introducir un precio");
		
		
		//Constructores
		
		this.Material = Material;
		this.Precio = Precio;
		
}
		// Getters i Setters

		public String getPrecio() {
			return Precio;
		}
		public String getMaterial() {
			return Material;
		}

		public void setMaterial(String material) {
			Material = material;
		}
		public void setPrecio(String precio) {
			Precio = precio;
		}
		
		//Metodos
		public void addDecoracionMaterial(String askDecoracionMaterial) throws Exception {
			
			if (askDecoracionMaterial.equals(""))
				throw new Exception("Tienes que introducir un material");
			
			
			setMaterial(askDecoracionMaterial);
		}
		
		public void addDecoracionPrecio (String askDecoracionPrecio) throws Exception {
			
			if (askDecoracionPrecio.equals(""))
				throw new Exception("Tienes que introducir un precio");
			
			
			setPrecio (askDecoracionPrecio);
}
}
