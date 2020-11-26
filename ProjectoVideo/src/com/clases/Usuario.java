package com.clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuario {

	// declaració de variables
	private String nombre;;
	private String apellido;
	private String pw;
	private Date regDate;
	private List<Video> videos = new ArrayList<Video>();

	// constructor amb validació de dades obligòries
	public Usuario() throws Exception {
		nombre = " ";
		apellido = " ";
		pw = " ";
		regDate = new Date();
	}

	public Usuario(String nombre, String apellido, String PW, Date RegDate) throws Exception {

		checkInfo(nombre);
		checkInfo(apellido);
		checkInfo(PW);

		this.nombre = nombre;
		this.apellido = apellido;
		this.pw = PW;
		this.regDate = new Date();

	}

	// validació d'omplir tots els camps:
	public void checkInfo(String info) throws Exception {
		if (info == null) {
			throw new Exception("RELLENAR CAMPOS ");
		}
		if (info.equals(" ")) {
			throw new Exception(" RELLENAR CAMPOS ");
		}
	}

	 public  void  setVideos ( List < Video >  videos ) {
	        this . videos = videos;
	    }
	  public  void  enterVideoToList ( Video  video ) {
	        videos.add(video) ;
	        setVideos (videos);
	    }
	  
	  public List<Video> getAllVideos() {
			return new ArrayList<>(videos);
		}

		public void agregarVideo(Video nuevoVideo) throws Exception {
			if (nuevoVideo == null)
				throw new Exception();
		     videos.add(nuevoVideo);
		}

	@Override
	public String toString() {
		return " nombre =  " + nombre + "  apellido =  " + apellido + " pw =  " + pw + "  regDate = " + regDate;
	}
}
