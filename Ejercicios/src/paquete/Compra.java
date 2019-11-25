package paquete;

import java.util.Scanner;


public class Compra {

	public static void main(String[] args) {
		
		float precioLeche, precioPan,precioCereales,finalPan,finalCereales, impuestos,totalCompra,sinIva, finalLeche;
		int leche, pan, cereales;
			Scanner scan=new Scanner(System.in);
		String producto1;
		String producto2;
		String producto3;
		producto1= "leche";  
		producto2="pan";
		producto3="cereal";
		System.out.println("Productos que puedes comprar:" + producto1+", "+ producto2+" y "+producto3+".");
		
		//System.out.println("Escribe leche.");
		
		
		
		//System.out.println();
		System.out.println("Introduce el precio de la leche." );
	
		precioLeche=scan.nextFloat();
	
		leche=3;
		finalLeche=precioLeche*leche;
		
		
		System.out.println("Introduzca el precio del pan");
		precioPan=scan.nextFloat();
		//System.out.println("Introduzca la cantidad de pan que quiere");
		pan=2;
		finalPan=precioPan*pan;
	
		System.out.println("Introduzca el precio de los cereales");
		precioCereales=scan.nextFloat();

//System.out.println("Introduzca la cantidad de cereales que quiere");
		cereales=3;
		finalCereales=cereales*precioCereales;
		
		
	    //hay que sumarle el 7%//	
		impuestos=((finalLeche+finalPan+finalCereales)*0.07F);
		sinIva=(finalLeche+finalPan+finalCereales);
		totalCompra=(finalLeche+finalPan+finalCereales)+impuestos;
		System.out.println("Total compra:"+"\n\t");
		System.out.println("Producto"+"\t\t"+"cantidad"+"\t\t"+"\t\t"+"precio"+"\t\t"+"\t\t"+"total"+"\n\t");
		System.out.println(producto1+"\t\t"+"\t\t"+leche+"\t\t"+" * "+"\t\t"+precioLeche+"\t\t"+" = "+"\t\t"+finalLeche+"\n\t");
		System.out.println(producto2+"\t\t"+"\t\t"+pan +"\t\t"+" * " +"\t\t"+precioPan+"\t\t"+ " = " +"\t\t"+finalPan +"\n\t");
		System.out.println(producto3+"\t\t"+"\t\t"+  cereales + "\t\t"+" * " +"\t\t"+ precioCereales +"\t\t"+ " = " +"\t\t"+finalCereales+"\n\t");
		System.out.println("precio sin iva "+"\t\t"+sinIva+"\n\t");
		System.out.println( "total iva "+"\t\t"+ impuestos+"\n\t");
		System.out.println("con el 7% de iva" +"\t\t"+totalCompra);
		
		scan.close();
	}

}