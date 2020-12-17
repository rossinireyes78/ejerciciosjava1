package com.fase2;

import java.util.ArrayList;
import java.util.List;

public class Coete {
	private String coeteId;
	private int propul;
	private List<Helices> helices;

	public Coete(String coeteId, int propul, List<Helices> helices) throws Exception {
		super();
		this.coeteId = coeteId;
		this.propul = propul;
		this.helices = helices;
		checkCoeteId(coeteId);
		checkPropulsores(propul);
		checkHelices(helices);

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

	public void checkHelices(List<Helices> helices) throws Exception {

		if (helices.size() <= 0) {
			throw new Exception(" El numero tiene que ser mayor a 0");
		}
	}

//método para obtener una lista que contiene todos los valores de potencia de un cohete.

	public String getCoeteId() {
		return coeteId;
	}

	public void setCoeteId(String coeteId) {
		this.coeteId = coeteId;
	}

	public List<Helices> getHelices() {
		return helices;
	}

	public void setHelices(List<Helices> helices) {
		this.helices = helices;
	}

	public int getPropul() {
		return propul;
	}

	public void setPropul(int propul) {
		this.propul = propul;
	}

	public List<Integer> listPropPower() {
		List<Integer> propPowers = new ArrayList<>();
		for (int i = 0; i < helices.size(); i++)
			propPowers.add(helices.get(i).getPoder());
		return propPowers;
	}


}
