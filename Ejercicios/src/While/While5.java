package While;

import java.util.Scanner;

public class While5 {

	public static void main(String[] args) {
		
		String palabra;
		String palabra2="";
		
		int contador=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("Escribe una palabra");
		palabra= scan.nextLine().replace(" ", "");
		
		contador= palabra.length()-1; 
//con esto sabemos la longitud de la palabra y como despues de una palabra hay siempre un \n se resta 1
		while (contador>=0) {
	palabra2= palabra2+palabra.charAt(contador);
			contador--;}
		System.out.println(palabra2);
		
		if(palabra2.equals(palabra)) {System.out.println("son palindromas");}
		else {System.out.println("No son palindromas");}
		
scan.close();
	}

	}
