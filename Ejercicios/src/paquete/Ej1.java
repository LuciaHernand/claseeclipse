package paquete;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lado,area, perimetro;
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce la medida del lado en cm");
		lado=scan.nextInt();
		
		area=lado*lado;
		perimetro=lado*4;
		System.out.println("El área del cuadrado es "+ area+"cm y su perímetro es "+ perimetro +"cm." );
		scan.close();	 

	}

}
