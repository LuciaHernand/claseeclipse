package ProyectoJava;

import java.util.Scanner;





public class LuciaHernandezZamora3 {
	public static int contadorA(String frase2) {
		int puntosA=0;
		char letra;
		for(int i=0;i<frase2.length();i++) {
			letra=frase2.charAt(i);
			switch (letra) {
			case 'a': puntosA=puntosA+1;break;
			case 'A': puntosA=puntosA+1;break;}}
		
		return puntosA;
	}
	
    public static int contadorE(String frase2) {
			int puntosE=0;
			char letra;
			for(int k=0;k<frase2.length();k++) {
				letra=frase2.charAt(k);
				switch (letra) {
				case 'e': puntosE=puntosE+1;break;
				case 'E':puntosE=puntosE+1;break;}}
			
			return puntosE;
		}
		

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	
	String frase2;
			
	
			System.out.println("Introduce una frase");
				frase2=scan.nextLine();
			
				System.out.println("La frase tiene " +contadorA(frase2) +"a");
				System.out.println("La frase tiene " +contadorE(frase2)+ "e");
		
scan.close();
	}
	}


