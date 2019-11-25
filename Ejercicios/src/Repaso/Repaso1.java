package Repaso;

import java.util.Scanner;

public class Repaso1 {
	

	public static int operacion(String contraseña) {
		
		int opcion=contraseña.length();
		char letra;
		
		for(int i=0;  i<contraseña.length();i++) {
			letra=contraseña.charAt(i);
			
			if(contraseña.length()<8) { return 1; }
			
			
			if(letra>=33 && letra<=96) {
				opcion=opcion + 2;
			}
		
			else if((contraseña.length()>=8) && (letra>=97 && letra<=122)) {
				opcion= opcion + 1;
			}
		}
			return opcion;
		}
		
	

	public static void main(String[] args) {
		// contraseña con mayusculas minusculas numeros y simbolos mas de 8 caracteres
		String contraseña;
		int solucion;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Introduce una contraseña");
		
		contraseña=scan.next();
		
		
		solucion=operacion(contraseña);
		
	 if (solucion==1) {System.out.println("La contraseña es demasiado corta");
	 
	 }
	 
	 if(solucion>contraseña.length() && solucion<contraseña.length()+10) {System.out.println("Contraseña poco segura");
	 }
	 if(solucion>contraseña.length()+10) {System.out.println("La contraseña es segura");
		}
		
		
		
		
		

	
	
		scan.close();	
		}
	
		}


