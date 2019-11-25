package Pintados;

import java.util.Scanner;

public class arbol {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Introduzca numero de filas: ");
        int numFilas = scan.nextInt();
        scan.close();
 
        System.out.println();
        for(int altura = 1; altura<=numFilas; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
        int x=0;
        for(int y=0;y<=3;y++) {
        while (x<=4) {
        System.out.print(" ");x++;}
        while(x<=8) {
        System.out.print("*");x++;}
        System.out.println();x=0;
        }
	}

}
