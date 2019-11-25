package paquete;

import java.util.Scanner;

public class IfClase {

	public static void main(String[] args) {
		//ej3
	
	int x;
	float peso, altura,imc;
	String palabra;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Introduce un número al azar");
		
		x=scan.nextInt();
		
		if (x<10) {
			System.out.println("El número que has introducido es menor que 10.");
		}
		
		else  {
			System.out.println("El número que has introducido es mayor que 10.");
		}
		
		System.out.println("Introduce otro número.");
		
		x=scan.nextInt();
		
		if (x%2==0) {
			System.out.println("El número introducido es par.");
		}
			
		else { System.out.println("El número introducido es impar");}
		// ej 4 Comprobar si uno de los caracteres leidos es prohibido \/:*?//
			
	
	
	  System.out.println("Introduce algo");
		
	  palabra=scan.next();
	  
	  if (palabra.charAt(0)==92||palabra.charAt(0)==47||palabra.charAt(0)==42|| palabra.charAt(0)==48)
	  
	  { System.out.println("Has introducido un caracter prhibido =\\/:*?");
			
	  }
	  else System.out.println("Has introducido un caracter permitido");
			
			
	//Ej 5 y6
	  
	System.out.println("Introduce tu peso"); 
	  
	peso=scan.nextFloat();
	
	System.out.println("Introduce tu altura");
	  
	 altura=scan.nextFloat();
	 
	 if (altura>=1.7) { System.out.println("Usted es varón");}
	 else {System.out.println("Usted es mujer");}
	 
	 
	 imc=peso/(altura*2);
	 System.out.println("Veamos tu imc: "+imc);
	 
	 
	 if (imc<18.4) System.out.println("Usted tiene delgadez");
	 if (imc>=18.5 && imc<=24.9) System.out.println("Su peso esta dentro del rango normal");
	 if (imc>24.9 && imc<=29.9) System.out.println("Usted tiene sobre peso");
	 if (imc>29.9 ) System.out.println("Usted tiene obesidad");
	 
	  //ej 7 
	 
	 float valor1, valor2,valor3;
	  
	 String opcion;
	 
	 
	 
	System.out.println("Introduce un numero");
	 valor1=scan.nextFloat();
	 
	 
	System.out.println("Introduce otro valor");
	 
	 valor2=scan.nextFloat();
	 
	 
	 System.out.println("¿Qué quieres hacer?\n\t");
	 System.out.println("S=suma\n\t");
	 System.out.println("M=multiplicación");
	 
	 opcion=scan.next();
	 
	 if (opcion.toUpperCase().equals("S")) { valor3=valor1+valor2; 
	 System.out.println("La suma de " + valor1 +" y " + valor2 + " es igual a "+valor3); }
	  
	 else if (opcion.toUpperCase().equals("M")){valor3=valor1*valor2;
	 System.out.println("La multiplicación de " + valor1 + " y " + valor2 + " es " + valor3 ); }
	
	 
	 scan.close();
	}

}
