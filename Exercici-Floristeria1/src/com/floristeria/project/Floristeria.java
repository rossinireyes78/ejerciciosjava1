package com.floristeria.project;

//import java.util.ArrayList;
import java.util.List;


public class Floristeria {

	//Atributos

	private String Nombre;
	private List<Arbol> Arboles;
	private List<Flor> Flores;
	private List<Decoracion> decoracion;
	
	//Constructor
	
	public Floristeria(String nombre) {
		super();
		Nombre = nombre;
		
	}
	
	//Getters i setters
	
	public String getNombre() {
		return Nombre;
	}
	public String setNombre() {
		return Nombre;
	}
	public List<Arbol> getArboles() {
		return Arboles;
	}
	public void setArboles(List<Arbol> arboles) {
		Arboles = arboles;
	}
	public List<Flor> getFlores() {
		return Flores;
	}
	public void setFlores(List<Flor> flores) {
		Flores = flores;
	}
	public List<Decoracion> getDecoracion() {
		return decoracion;
	}
	
	
	public void setDecoracion(List<Decoracion> decoracion) {
		this.decoracion = decoracion;
	}

	@Override
	public String toString() {
		return "Floristeria [Arboles=" + Arboles + "]";
	}
	
	
	
	
	
}
