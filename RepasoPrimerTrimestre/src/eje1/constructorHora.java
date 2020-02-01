package eje1;

import java.util.Scanner;

public class constructorHora {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Introduce la hora en formato 24 horas");
		
		hora h1=new hora();
		System.out.println("Introduce la hora:");
		h1.setHora(scan.nextInt());
		System.out.println("Introduce los minutos");
		h1.setMinutos(scan.nextInt());
		System.out.println("Introduce los segundos");
		h1.setSegundos(scan.nextInt());
		
		
		
		
		System.out.println(h1.toString());
		
		System.out.println("Introduce el nuevo formato");
	
		
		h1.transformarHora(scan.nextInt());
		
		System.out.println(h1.toString());
		
		h1.transformarHora(scan.nextInt());
		System.out.println(h1.toString());
		
		scan.close();

	}

}
