package com.floristeria.project;

import java.util.ArrayList;
import java.util.List;

public class FloristeriaRepo {


	private static List<Arbol> a=new ArrayList<>();
	private static List<Flor> f=new ArrayList<>();
	private static List<Decoracion> d=new ArrayList<>();
	public FloristeriaRepo() {
		
	}
	
	//agregar arbol
	public List<Arbol> getAllArbols(){
		return new ArrayList<>(a);
	}
	
	
	public void addArbol(Arbol ar) throws Exception{
		if(ar==null) throw new Exception() ;
		a.add(ar);
	}
	
	// agregar flor
	public List<Flor> getAllFlors(){
		return new ArrayList<>(f);
	}
	
	
	public void addFlor(Flor flo) throws Exception{
		if(flo==null) throw new Exception() ;
		f.add(flo);
	}
	
	//agregar decoracion
	public List<Decoracion> getAllDecoracion(){
		return new ArrayList<>(d);
	}
	
	
	public void addDecoracion(Decoracion dec) throws Exception{
		if(dec==null) throw new Exception() ;
		d.add(dec);
	}

	@Override
	public String toString() {
		return "getAllArbols " + getAllArbols().size() + ", getAllFlors" + getAllFlors().size()
				+ ", getAllDecoracion " + getAllDecoracion().size() ;
	}
	
	
}
