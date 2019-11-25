package paquete;

import java.util.Scanner;

public class EjerciciosIf {

	public static void main(String[] args) {
		// ej 1
		
	char letra;
	String palabra;
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Introduce un caracter:");
		
	letra=scan.next().charAt(0);
	
	if (letra>=48 && letra<=57) {System.out.println("Has introducido un número.");}
	else { System.out.println("Has introducido un caracter");}
	
	//ej2
	
	System.out.println("Introduce una palabra");
	
	    palabra=scan.next();
	    
    if (palabra.charAt(1)>=48 && palabra.charAt(1)<=57) {System.out.println("El segundo caracter es un digito");}
	    
	else  {
	 
		 System.out.println("El segundo caracter es una letra");
		 
		 if ((palabra.charAt(1)<=90) && (palabra.charAt(1)>=65)) {
			 System.out.println("Además de ser una letra, es mayúscula."); }
		 
		 else if ((palabra.charAt(1)<=122) && (palabra.charAt(1)<=97)) {
			 System.out.println("Además de ser una letra, es minúscula.");}
	 }
	
	
	
	
	
	
	scan.close();
	} 
	}


