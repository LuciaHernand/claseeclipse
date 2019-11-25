package PrimerPrograma;

import java.util.Scanner;

public class Controlar {

	public static void main(String[] args) {
	
	int opcion;
	
	
	Scanner scan=new Scanner(System.in);
	
		do {
			System.out.println("0: Salir");
			System.out.println("1: Insertar nueva señal probitiva");
		System.out.println("2: Insertar señal informativa");
			System.out.println("Inserta la opcion deseada");
			
		opcion=scan.nextInt();
			switch (opcion) {
			
			case 1:prohibitiva p1=new prohibitiva();
			System.out.println("Iantroduce el nombre del archivo");
			scan.nextLine();
			p1.setNombreArchivoImagen(scan.nextLine());
			
			System.out.println("Introduce e lnombre de la señal");
			
			p1.setTexto(scan.nextLine());
			
			System.out.println("Introduce el alto");
			
			p1.setAlto(scan.nextInt());
			System.out.println("Introduce el ancho");
			
			p1.setAncho(scan.nextInt());
			p1.html();
				
				break;
			case 2:informativa i1=new informativa();
			i1.setIdSenial(1);
			System.out.println("Introduce el numero de señal");
			i1.setNum(scan.nextInt());
			System.out.println("Introduce el texto deseado");
			scan.nextLine();
			i1.setTexto(scan.nextLine());
			System.out.println("Vamos a ello");
			i1.Cuadrado();
		break;
			case 0: System.exit(0);break;
			}
			
		if(opcion>=3)System.out.println("Introduce una opcion valida");

	}while (opcion!=0);
scan.close();
}}
