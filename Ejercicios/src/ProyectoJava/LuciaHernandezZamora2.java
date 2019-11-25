package ProyectoJava;

import java.util.Scanner;

public class LuciaHernandezZamora2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String frase1="";
		int opcion;
		
		
		
	    System.out.println("Escribe una frase");
		
		frase1=scan.nextLine();
		
		if(frase1.length()<11) System.out.println("Introduce una frase más larga");
		
		

			
			System.out.println("¿Que quieres hacer?\n1:Poner todas las tetras en mayúscula\n2:Poner todas las letras en minúsculas\n3:Los 10 primeros caracteres de la frase\n4:Los 10 últimos carácteres de la frase\n5:Los 10 últimos caráscteres de la frase mostrando el resto con *\n6:Nada");
			opcion=scan.nextInt();
			switch (opcion) {
			
			case 1: frase1=frase1.toUpperCase();System.out.println(frase1);break;
			case 2: frase1=frase1.toLowerCase(); System.out.println(frase1);break;
			case 3: frase1=frase1.substring(0,10);System.out.println(frase1);break;
			case 4: frase1=frase1.substring(frase1.length()-10,frase1.length());System.out.println(frase1)  ;break;
			case 5:break;
			case 6: System.exit(6);
			}
			scan.close();

	}

}
