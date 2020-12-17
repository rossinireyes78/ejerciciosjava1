package com.fase3;

import java.util.ArrayList;
import java.util.List;

public class Coete3 {
	private String coetecod;
	private int num_pro;
	private List<Helice3>pro_list=new ArrayList<Helice3>();

	public Coete3(String coetecod, List<Helice3> pro_list) {
		super();
		this.coetecod=coetecod;
		this.pro_list=pro_list;

	}

// getter y setter
	public String getCoetecod() {
		return coetecod;
	}

	public void setCoetecod(String coetecod) {
		this.coetecod = coetecod;
	}

	public int getNum_pro() {
		return num_pro;
	}

	public void setNum_pro(int num_pro) {
		this.num_pro = num_pro;
	}

	public List<Helice3> getPro_list() {
		return pro_list;
	}

	public void setPro_list(List<Helice3> pro_list) {
		this.pro_list = pro_list;
	}


	public void setPod(int pod) {
		for (Helice3 helice : pro_list) {
			helice.setPod(pod);
			Thread t=new Thread(helice);
			t.start();
		}
	}

	// metodo frenar
	public void freno(int pod) {
		for (Helice3 helice : pro_list) {
			helice.setPod(pod);
			Thread t=new Thread(helice);
			t.start();
			
		}
	}

}
