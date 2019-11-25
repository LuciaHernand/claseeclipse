package rectangulo;

import java.util.Scanner;

public class rectangulo {
	public static void main(String []args) {
		
		float lado1=0.0f;
		float lado2=0.0f;
		int a,b;
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Introduce uno de los lados:");
		lado1=scan.nextFloat();
		
		System.out.println("Introduce el segundo lado:");
		lado2=scan.nextFloat();
		 Operaciones R1=new Operaciones();
		 R1.setLado1(lado1);
		 R1.setLado2(lado2);
		 R1.calcularArea();
		 R1.calcularPerimetro();
		 R1.esCuadrado();
		 
		 a=(int)lado1;
		 b=(int)lado2;
		 R1.setLado1(a);
		 R1.setLado2(b);
		 R1.pintarCuadrado(R1.Lado1,R1.Lado2);
		 
		 
		 scan.close();
	}
}
