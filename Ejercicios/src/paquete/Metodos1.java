package paquete;

import java.util.Scanner;

public class Metodos1 {
	
	
		public static float sumar(float valor1,float valor2) {
			float sumaFin;
			sumaFin=valor1+valor2;
			 return sumaFin;
			
			
		}
		public static float multiplicacion(float valor1,float valor2) {
			float resultado;
			resultado=valor1*valor2;
			return resultado;
			
			
		}
		public static void main(String [] args) {	
	float valor1,valor2;
	char operacion;
	
 Scanner scan=new Scanner(System.in);
	
    System.out.println("Introduce un primer valor: ");
		valor1=scan.nextFloat();
		
	System.out.println("Introduce un segundo valor: ");
		valor2=scan.nextFloat();
		
	System.out.println("¿Qué operacion desea realizar?\nS:Suma\nM:Multiplicación");
	operacion=scan.next().toUpperCase().charAt(0);
	switch  (operacion) {
	case 'S': System.out.println("El resultado es: "+sumar(valor1,valor2));break;
	case 'M': System.out.println("El resultado es: "+multiplicacion(valor1,valor2));break;
	
	
  
	}
	scan.close();
	}

}
