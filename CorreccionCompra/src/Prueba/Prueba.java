package Prueba;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		//El programa sera un ticket de compra.
		//Declaraciones
		
		Scanner scan=new Scanner(System.in);
		String articulo1, articulo2;
		int cantidadArticulo1,cantidadArticulo2;
		float precioArticulo1,precioArticulo2;
		float ivaArticulo1,ivaArticulo2,ivaTotal;
		float precioSinIva,precioTotal;
		
		
		
		//Programa
		System.out.println("¿Qué producto quiere comprar?");
		
		articulo1=scan.next();
		
		System.out.println("¿Qué cantidad desea comprar?");
		
	    cantidadArticulo1=scan.nextInt();
	    
	    System.out.println("¿Cuál es su precio unitario?");
	   
	    precioArticulo1=scan.nextFloat();
	    
	    System.out.println("¿Cuál es su IVA?");
		
		ivaArticulo1=scan.nextFloat();
		
		//datos articulo 2
		
		System.out.println("Introduzca otro producto que desea comprar");
		
		articulo2=scan.next();
		
		System.out.println("¿Qué cantidad desea comprar?");
		
		cantidadArticulo2=scan.nextInt();
		
		System.out.println("¿Cuál es su precio unitario?");
		
		precioArticulo2=scan.nextFloat();
		
		System.out.println("¿Cuál es su IVA?");
		
		ivaArticulo2=scan.nextFloat();
		
		
		//recibo
		precioSinIva=((precioArticulo1*cantidadArticulo1)+(precioArticulo2*cantidadArticulo2));
		ivaTotal=(precioArticulo1*cantidadArticulo1)*ivaArticulo1 + (precioArticulo2*cantidadArticulo2)*ivaArticulo2;
		precioTotal=precioSinIva+ivaTotal;
		
		System.out.println("Su ticket de compra:");
		System.out.println("ARTÍCULO:\tCANTIDAD:\tPRECIO UNITARIO:");
		System.out.println("\t"+ articulo1.toUpperCase().charAt(0)+articulo1.toLowerCase().substring(articulo1.length()-2, articulo1.length())+"\t\t"+cantidadArticulo1+"\t\t"+precioArticulo1);
		System.out.println("\t"+ articulo2.toUpperCase().charAt(0)+articulo2.toLowerCase().substring(articulo2.length()-2, articulo2.length())+"\t\t"+cantidadArticulo2+"\t\t"+precioArticulo2);
		System.out.println("\t\t\tTotal IVA\t"+ ivaTotal);
		System.out.println("\t\t\tTotal\t\t"+ precioTotal);
		
		
		
		System.out.println("Introduce tu correo electrónico:");
		String correo="";
		boolean esCorreo=false;
		correo=scan.next();
		esCorreo=correo.contains("@");
		System.out.println("es "+ esCorreo + " que es una dirección de correo electrónico");
		
		
	
		
		
		scan.close();

	}

}
