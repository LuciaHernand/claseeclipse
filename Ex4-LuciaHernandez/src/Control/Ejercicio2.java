package Control;

import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejercicio2 {
	
	public static void leer(char[][] array, int fila) {
		for (int j = 0; j < array[fila].length; j++) {
			System.out.print(array[fila][j] + "\t");
		}
		System.out.println();
	}
	
	public static void insertarPalabra(char[][] otro,int fila) {
		//Horizontal
		otro[2][3]='H';
		otro[2][4]='O';
		otro[2][5]='L';
		otro[2][6]='A';
		
		//Vertical
		
		otro[5][3]='P';
		otro[6][3]='E';
		otro[7][3]='C';
		otro[8][3]='E';
		otro[9][3]='S';
		for (int j = 0; j < otro[fila].length; j++) {
			System.out.print(otro[fila][j] + "\t");
		}
		System.out.println();
		
	}
	public static char[][] paraTxt(char[][] otro,int fila) {
		//Horizontal
		otro[2][3]='N';
		otro[2][4]='A';
		otro[2][5]='T';
		otro[2][6]='A';
		otro[2][7]='C';
		otro[2][8]='I';
		otro[2][9]='O';
		otro[2][10]='N';
		
		//Vertical
		
		otro[5][3]='T';
		otro[6][3]='E';
		otro[7][3]='N';
		otro[8][3]='I';
		otro[9][3]='S';
		
		
		for (int j = 0; j < otro[fila].length; j++) {
			System.out.print(otro[fila][j] + "\t");
		}
		System.out.println();
	
		return otro;
	}

	public static void main(String[] args) {

		char [][]miArray=new char [15][15] ;
		
		
		char[] letras = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','W','X','Y','Z'};
		
	 for (int n=0;n<miArray.length;n++) {
		 for(int s=0;s<miArray.length;s++) {
		 int x= (int)(Math.random()*24);
		 miArray[n][s]=letras[x];
		 
		 }
	 }
	 //Ejercicio 1 desmarcar para ver
		/*
		 * for (int i = 0; i < miArray.length; i++) { leer(miArray, i); }
		 */
	 //Ejercicio2 Palabras hola y peces, fila  2 y columna 3, desmarcar hasta ejercicio 3 para ver
		/*
		 * for (int i = 0; i < miArray.length; i++) { insertarPalabra(miArray, i); }
		 */ 
	 //Ejercicio 3
	 for (int i = 0; i < miArray.length; i++) {
			paraTxt(miArray,i);}
			Path introducir=Paths.get("Ficheros/SopaDEportes.txt");
			
			BufferedWriter oBuffer=null;
			Charset charset = StandardCharsets.UTF_8;
			
			
			try {
				oBuffer=Files.newBufferedWriter(introducir, charset);
				
				oBuffer.write("Sopa de letras :\t Deportes.\n");
				
				for(int z=0;z<miArray.length;z++) {
					for(int x=0;x<miArray.length;x++) {
					oBuffer.write(miArray[z][x]);
					oBuffer.write("\t");
				}
					oBuffer.write("\n");}
				
				
				oBuffer.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
	
	 
	 
	 
	}

}
