package com.fase3;

public class Helice3 implements Runnable {
	protected int potenciamax;
	private int potenciac;
	private int pod;
	public String descripción;

	public Helice3(int potenciamax, String descripción) {
		this.potenciamax = potenciamax;
		this.potenciac = 0;
		this.pod = 0;
		this.descripción = descripción;
	}

	// Getters y setter

	public int getPotenciamax() {
		return potenciamax;
	}

	public void setPotenciamax(int potenciamax) {
		this.potenciamax = potenciamax;
	}

	public int getPotenciac() {
		return potenciac;
	}

	public void setPotenciac(int potenciac) {
		this.potenciac = potenciac;
	}

	public int getPod() {
		return pod;
	}

	public void setPod(int pod) {
		this.pod = pod;
	}

	// metodo Run
	public void run() {
		 try { if (pod >= potenciamax) {
			 System.out.println(" ¡ADVERTENCIA! - Poder fuera de rango. " + descripción + " no se iniciará ");
			  } else if (pod < potenciamax) { 
			  do {
			   potenciamax--;
			   potenciac=potenciamax;
			  System.out.println( descripción + " Actual: " + potenciac + " - Poder: " + pod);
			  Thread.sleep(300);
			   } while (pod != potenciamax);
			  System.out.println( " ******** " + descripción + " alcanzó la Potencia: " + pod + " ******** "); 
			  } else if (pod > potenciamax) {
			   do {
			    potenciamax++;
			  System.out.println( descripción + " Actual: " + potenciac + " - Poder: " +pod);
			   Thread.sleep(300);
			   } while (pod != potenciamax);
			  System.out.println( " ******** " + descripción + " alcanzó la Potencia: " + pod + " ******** ");
			  } 
			  Thread.sleep(500);
			   } catch (InterruptedException e) {
			  System.out.println("¡Cuidado! ");
			   }
	/*
	  try { 
	  if (pod > potenciamax) {
	 System.out.println(" ¡ADVERTENCIA! - Poder fuera de rango. " + descripción + " no se iniciará ");
	  } else if (potenciac < potenciamax) { 
	  do {
	   potenciac++;
	  System.out.println( descripción + " Actual: " + potenciac + " - Poder: " + pod); Thread.sleep(300);
	   } while (potenciac != potenciamax);
	  System.out.println( " ******** " + descripción + " alcanzó la Potencia: " + pod + " ******** "); 
	  } else if (potenciac > potenciamax) {
	   do {
	    potenciac--;
	  System.out.println( descripción + " Actual: " + potenciac + " - Poder: " +pod);
	   Thread.sleep(300);
	   } while (potenciac != potenciamax);
	  System.out.println( " ******** " + descripción + " alcanzó la Potencia: " + pod + " ******** ");
	  } 
	  Thread.sleep(500);
	   } catch (InterruptedException e) {
	  System.out.println("¡Cuidado! ");
	   }
	 */
	}
}
