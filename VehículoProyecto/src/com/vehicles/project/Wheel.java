package com.vehicles.project;

public class Wheel{
	
		 private String marcarueda;
		 private double diámetro;
         
         
		 

		public Wheel ( String marca  , double diámetro ) { 
			this . marcarueda = marca;
			this . diámetro = diámetro;
		}
		

		public String getMarcarueda() {
			return marcarueda;
		}

		public void setMarcarueda(String marcarueda) {
			this.marcarueda = marcarueda;
		}

		public double getDiámetro() {
			return diámetro;
		}
		
		public void setDiámetro(double diámetro) {
			this.diámetro = diámetro;
		}

		
}
