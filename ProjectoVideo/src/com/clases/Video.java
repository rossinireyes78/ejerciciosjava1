package com.clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Video {
	// declaració de variables
	protected String título;
	protected String url;
	static ArrayList<String> tags = new ArrayList<>();

	public Video() {

	}

	public Video(String url, String título) throws Exception {

		checkInfo(url);
		checkInfo(título);

		this.url = url;
		this.título = título;
	}

	public Video(String título, String url, ArrayList<String> tags) throws Exception {
		super();
		checkInfo(url);
		checkInfo(título);
		checkTags(tags);
		this.título = título;
		this.url = url;
		Video.tags = tags;
	}

	public List<String> getAllTags() {
		// return getAllTags();
		return new ArrayList<>();
	}

	public void checkInfo(String info) throws Exception {
		if (info == null) {
			throw new Exception(" RELLENA LOS CAMPOS ");
		}
		if (info.equals(" ")) {
			throw new Exception(" RELLENA LOS CAMPOS ");
		}
	}

	// validació d'omplir els tags:
	public void checkTags(List<String> tags) throws Exception {
		for (int i = 0; i < tags.size(); i++) {
			if (tags.get(i) == null) {
				throw new Exception(" INSERTA UNA ETIQUETA  ");
			}
			if (tags.get(i).equals(" "))

			{
				throw new Exception(" INSERTA UNA ETIQUETA ");
			}
		}
	}

	public static Video enterVideo() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print(" URL DEL VIDEO : ");
		String url = sc.next();
		System.out.print(" TITULO        : ");
		String título = sc.next();
		//sc.close();
		Video vídeo = new Video(título, url, tags);
		System.out.println(" EL VIDEO ES: " + vídeo.toString());
		// Usuario.agregarVideo(vídeo);//Video.getAllVideos();
		return (Video) enterTag();
	}
	
	public static List<String> enterTag() throws Exception {

		Scanner sc = new Scanner(System.in);
		boolean moreTags = true;

		List<String> tags = new ArrayList<>();
		while (moreTags == true) {
			System.out.print(" etiqueta:  ");
			String etiqueta = sc.next();
			tags.add(etiqueta);
			System.out.print("¿mas etiquetas? s o n ");
			String resp = sc.next();

			if (resp.equalsIgnoreCase("s")) {
				moreTags = false;// true
				return enterTag();
			} else if (resp.equalsIgnoreCase("n")) {
				moreTags = false;
				break;
			}
			//sc.close();
		}
		return null;
	}
	
	@Override
	public String toString() {
		return "\ntítulo=" + título + ",url=" + url;
	}
	

}
