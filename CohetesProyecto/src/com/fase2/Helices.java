package com.fase2;

public class Helices {

	private int poder;

	// constructor
	public Helices(int poder) throws Exception {
		this.poder = poder;
		checkPoder(poder);
	}

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}

	public void checkPoder(int poder) throws Exception {
		if (poder < 0) {
			throw new Exception(" La potència maxima no puede ser negativa ");
		}
	}

	@Override
	public String toString() {
		return " poder: " + poder;
	}

	

	
}