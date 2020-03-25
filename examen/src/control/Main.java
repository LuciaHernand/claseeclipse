package control;

import java.util.Random;

public class Main {
	
	public static void leerArray(char[][] array, int fila) {
		for (int j = 0; j < array[fila].length; j++) {
			System.out.print(array[fila][j] + "\t");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Random rndm = new Random();
		
		//Apartado 1 (Para ver contenido: quitar comentarios del for leerArray)
		char[][] array;
		array = new char[7][7];
		/*
		 * for (int i = 0; i < array.length; i++) { for (int j = 0; j < array[i].length;
		 * j++) { char caracterRellenar = (char)(rndm.nextDouble()*92+65); array[i][j] =
		 * caracterRellenar; } }
		 */
		
		for (int i = 0; i < array.length; i++) {
		leerArray(array, i);
		}
		
		//Apartado 2 (Para ver contenido: quitar comentarios del for leerArray)
		array[2][3] = 'S';
		array[2][4] = 'O';
		array[2][5] = 'L';
		
		/*
		 * for (int i = 0; i < array.length; i++) { leerArray(array, i); }
		 */
		//Apartado 3 (Para ver contenido: quitar comentarios del for leerArray)
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				char caracterRellenar = (char)(rndm.nextDouble()*92+65);
				array[i][j] = caracterRellenar;
			}
		}
		
		array[2][1] = 'A';
		array[3][1] = 'G';
		array[4][1] = 'U';
		array[5][1] = 'A';

		for (int i = 0; i < array.length; i++) {
			leerArray(array, i);
		}
		
	}

}
