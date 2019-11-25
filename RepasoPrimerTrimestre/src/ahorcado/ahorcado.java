package ahorcado;

import java.util.Scanner;

public class ahorcado {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String palabraJ1;
		String palabra="";
		String letra;
		
		
		System.out.println("Jugador 1 escribe una palabra:");
		
		
		palabraJ1=scan.next();
		
		palabra=palabraJ1;

		
		System.out.println(palabra);
		
		
		
		System.out.println("Jugador 2 introduce una letra: ");
		scan.next();
		letra=scan.next();
		letra=letra.substring(0,1);
		
	
		System.out.println(letra);
		
		
		if (palabraJ1.contains(letra)) {
			
			
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
