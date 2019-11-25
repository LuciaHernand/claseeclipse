package paquete;

import java.util.Scanner;

public class EjDescuento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int precio;
		double descuento25;
		double descuento50;
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce el precio");
		precio=scan.nextInt();
		
		descuento25=precio*0.75;
		descuento50=precio*0.5;
		System.out.println("Para un articulo cuyo coste es "+ precio + "€ con 25% de descuento "+descuento25+"€ y con el 50% de descuento "+descuento50+"€" );
scan.close();
	}

}
