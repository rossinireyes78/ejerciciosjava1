package com.fase1;

public class Fase1Coet {
	private String coeteId;
	private int propul;

	public Fase1Coet(String coeteId, int propul) throws Exception {
		super();
		this.coeteId = coeteId;
		this.propul = propul;
		checkCoeteId(coeteId);
		checkPropulsores(propul);
	}

	public void checkCoeteId(String coeteId) throws Exception {
		if (this.coeteId.length() != 8) {
			throw new Exception("permite solo 8  caracteres ");
		}
	}

	public void checkPropulsores(int propul) throws Exception {
		if (this.propul <= 0) {
			throw new Exception(" propulsor mayor de 0");
		}
	}

	public String getCoeteId() {
		return coeteId;
	}

	public void setCoeteId(String coeteId) {
		this.coeteId = coeteId;
	}

	public int getPropulsores() {
		return propul;
	}

	public void setPropulsores(int propul) {
		this.propul = propul;
	}

	@Override
	public String toString() {
		return "Nombre de Cohete=" + coeteId + ",   #de propulsores=" + propul;
	}

}
