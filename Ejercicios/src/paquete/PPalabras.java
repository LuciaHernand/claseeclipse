package paquete;

import java.util.Scanner;

public class PPalabras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palabra;
		String palabra2;
		
		Scanner scan=new  Scanner(System.in);
		System.out.println("Escribe una palabra:");
		palabra=scan.next();
		
		System.out.println("Escribe otra palabra:");
		palabra2=scan.next();
		
		System.out.println("La primera palabra de cada letra es:\n"+palabra.charAt(0)+"\t"+palabra2.charAt(0));
		
		palabra=palabra.substring(0, 4);
		System.out.println("estas son las 4 primeras letras de tu primera palabra:"+"\n"+palabra);
		
		scan.close();
	}

}
