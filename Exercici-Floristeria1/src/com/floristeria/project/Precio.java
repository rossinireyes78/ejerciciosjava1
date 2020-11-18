package com.floristeria.project;

public abstract class Precio {
             protected String precio;

			public Precio(String precio) {
				super();
				this.precio = precio;
			}

			/**
			 * @return the precio
			 */
			public String getPrecio() {
				return precio;
			}

			/**
			 * @param precio the precio to set
			 */
			public void setPrecio(String precio) {
				this.precio = precio;
			}
             
			
}
