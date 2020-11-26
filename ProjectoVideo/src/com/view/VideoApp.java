package com.view;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.clases.Usuario;
import com.clases.Video;

public class VideoApp {

	private static Video fVideo = new Video();

	public static void main(String[] args) throws Exception {

		// variable

		// introduir usuari. Aquesta és la manera de que es mantingui en la memòria i no
		// s'inicialitzi.
		Scanner sc = new Scanner(System.in);
		System.out.println(" ----------INGRESO DE USUARIO----------");
		System.out.print(" INGRESA TU NOMBRE: ");
		String Nombre = sc.next();
		System.out.print(" INGRESA TU AOELLIDO: ");
		String Apellido = sc.next();
		System.out.print(" INGRESA TU PASSWORD: ");
		String pw = sc.next();
		Date regDate = new Date();

		Usuario usuario = new Usuario(Nombre, Apellido, pw, regDate);

		// introducció de n videos
		boolean moreVideos = true;
		while (moreVideos = true) {

			System.out.print(" ******DESEAS AGREGAR VIDEOS***: CONTESTAR [S]  O  [N]***** ");
			String resp = sc.next();
			if (resp.equalsIgnoreCase("S")) {
				usuario.enterVideoToList(Video.enterVideo());
				moreVideos = true;

			} else if (resp.equalsIgnoreCase("N")) {
				moreVideos = false;
				break;
			} else {
				System.out.print(" CONTESTAR [S]  O  [N] ");
			}
		}
		sc.close();
		System.out.print(" TUS DATOS DE USUARIO INGRESADO: " + usuario.toString());
		List<Video> allVideos = usuario.getAllVideos();// fVideo.getAllVideos();
		System.out.println(" VIDEOS " + allVideos);
		List<String> allTags = fVideo.getAllTags();
		System.out.println(" ETIQUETAS " + allTags);

	}

}
