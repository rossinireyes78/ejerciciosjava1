package com.fase3;

public class Helice3 implements Runnable {
	protected int potenciamax;
	private int potenciac;
	private int pod;
	public String descripci�n;

	public Helice3(int potenciamax, String descripci�n) {
		this.potenciamax = potenciamax;
		this.potenciac = 0;
		this.pod = 0;
		this.descripci�n = descripci�n;
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
			 System.out.println(" �ADVERTENCIA! - Poder fuera de rango. " + descripci�n + " no se iniciar� ");
			  } else if (pod < potenciamax) { 
			  do {
			   potenciamax--;
			   potenciac=potenciamax;
			  System.out.println( descripci�n + " Actual: " + potenciac + " - Poder: " + pod);
			  Thread.sleep(300);
			   } while (pod != potenciamax);
			  System.out.println( " ******** " + descripci�n + " alcanz� la Potencia: " + pod + " ******** "); 
			  } else if (pod > potenciamax) {
			   do {
			    potenciamax++;
			  System.out.println( descripci�n + " Actual: " + potenciac + " - Poder: " +pod);
			   Thread.sleep(300);
			   } while (pod != potenciamax);
			  System.out.println( " ******** " + descripci�n + " alcanz� la Potencia: " + pod + " ******** ");
			  } 
			  Thread.sleep(500);
			   } catch (InterruptedException e) {
			  System.out.println("�Cuidado! ");
			   }
	/*
	  try { 
	  if (pod > potenciamax) {
	 System.out.println(" �ADVERTENCIA! - Poder fuera de rango. " + descripci�n + " no se iniciar� ");
	  } else if (potenciac < potenciamax) { 
	  do {
	   potenciac++;
	  System.out.println( descripci�n + " Actual: " + potenciac + " - Poder: " + pod); Thread.sleep(300);
	   } while (potenciac != potenciamax);
	  System.out.println( " ******** " + descripci�n + " alcanz� la Potencia: " + pod + " ******** "); 
	  } else if (potenciac > potenciamax) {
	   do {
	    potenciac--;
	  System.out.println( descripci�n + " Actual: " + potenciac + " - Poder: " +pod);
	   Thread.sleep(300);
	   } while (potenciac != potenciamax);
	  System.out.println( " ******** " + descripci�n + " alcanz� la Potencia: " + pod + " ******** ");
	  } 
	  Thread.sleep(500);
	   } catch (InterruptedException e) {
	  System.out.println("�Cuidado! ");
	   }
	 */
	}
}
