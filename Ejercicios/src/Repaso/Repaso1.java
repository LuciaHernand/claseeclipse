package Repaso;

import java.util.Scanner;

public class Repaso1 {
	

	public static int operacion(String contraseņa) {
		
		int opcion=contraseņa.length();
		char letra;
		
		for(int i=0;  i<contraseņa.length();i++) {
			letra=contraseņa.charAt(i);
			
			if(contraseņa.length()<8) { return 1; }
			
			
			if(letra>=33 && letra<=96) {
				opcion=opcion + 2;
			}
		
			else if((contraseņa.length()>=8) && (letra>=97 && letra<=122)) {
				opcion= opcion + 1;
			}
		}
			return opcion;
		}
		
	

	public static void main(String[] args) {
		// contraseņa con mayusculas minusculas numeros y simbolos mas de 8 caracteres
		String contraseņa;
		int solucion;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Introduce una contraseņa");
		
		contraseņa=scan.next();
		
		
		solucion=operacion(contraseņa);
		
	 if (solucion==1) {System.out.println("La contraseņa es demasiado corta");
	 
	 }
	 
	 if(solucion>contraseņa.length() && solucion<contraseņa.length()+10) {System.out.println("Contraseņa poco segura");
	 }
	 if(solucion>contraseņa.length()+10) {System.out.println("La contraseņa es segura");
		}
		
		
		
		
		

	
	
		scan.close();	
		}
	
		}


