package Repaso;

import java.util.Scanner;

public class Repaso1 {
	

	public static int operacion(String contrase�a) {
		
		int opcion=contrase�a.length();
		char letra;
		
		for(int i=0;  i<contrase�a.length();i++) {
			letra=contrase�a.charAt(i);
			
			if(contrase�a.length()<8) { return 1; }
			
			
			if(letra>=33 && letra<=96) {
				opcion=opcion + 2;
			}
		
			else if((contrase�a.length()>=8) && (letra>=97 && letra<=122)) {
				opcion= opcion + 1;
			}
		}
			return opcion;
		}
		
	

	public static void main(String[] args) {
		// contrase�a con mayusculas minusculas numeros y simbolos mas de 8 caracteres
		String contrase�a;
		int solucion;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Introduce una contrase�a");
		
		contrase�a=scan.next();
		
		
		solucion=operacion(contrase�a);
		
	 if (solucion==1) {System.out.println("La contrase�a es demasiado corta");
	 
	 }
	 
	 if(solucion>contrase�a.length() && solucion<contrase�a.length()+10) {System.out.println("Contrase�a poco segura");
	 }
	 if(solucion>contrase�a.length()+10) {System.out.println("La contrase�a es segura");
		}
		
		
		
		
		

	
	
		scan.close();	
		}
	
		}


