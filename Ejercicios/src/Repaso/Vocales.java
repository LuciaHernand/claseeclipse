package Repaso;

import java.util.Scanner;


public class Vocales {
	public static int puntos(String palabra) {
		int contador=0; int puntosA=0; int puntosE=0; int puntosI=0;int puntosO=0;int puntosU=0;
		char letra;
		for(int i=0;i<palabra.length();i++) {
			letra=palabra.charAt(i);
			switch (letra) {
			case 'a': puntosA=puntosA+1;break;
			case 'e': puntosE=puntosE+1;break;
		    case 'i':  puntosI=puntosI+1;break;
		    case 'o': puntosO=puntosO+1;break;
		    case 'u': puntosU=puntosU+1;break;
			}
		contador=puntosA+puntosE+puntosI+puntosO+puntosU;
		}return contador;
	}
	
	
	public static void main(String[] args) {
	String palabra="";

	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Introduce una palabra");
	
	palabra=scan.next();
	palabra=palabra.toLowerCase();

	
	System.out.println("tu palabra tiene "+puntos(palabra)+" vocales.");
	
	scan.close();
	}

}
