package tresEnRaya;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import jugador.id;

public class TresEnRaya extends id {

	public static void tableroPosiciones() {int posicion=1;

			
		for(int j=0;j<3;j++) {
			for(int i=0;i<3;i++) {
			
			System.out.print("|"+posicion+"|");
			posicion++;
			
		}
			System.out.println();
			}
		
	}
	
	public static void posicionJugador(int opcion,int fichaMaquina) {
		
		
		
		
	}
	
		
	public TresEnRaya() {
		Scanner scan=new Scanner(System.in);
		Random ran=new Random();
		
		char [][] array=new char [3][3];
		
		int opcion;

		int contador;
		System.out.println("Introduce tu nombre");
		
		id j1=new id();
		
		j1.setNombre(scan.next());
		
		System.out.println(j1.toString()+"\tTu ficha será la X, estas son las posiciones:");
		
	
       tableroPosiciones();

      System.out.println("Escoge una posición");
      
      for(int i=0;i<9;i++) {
      
      opcion=scan.nextInt();
      
     int fichaMaquina= (int)(Math.random()*9+1);
     while(  opcion==1 && array [0][0]=='X' || opcion==2 && array [0][1]=='X' || opcion==3 && array [0][2]=='X' || 
			 opcion==4 && array [1][0]=='X' || opcion==5 && array [1][1]=='X' || opcion==6 && array [1][2]=='X' ||
			 opcion==7 && array [2][0]=='X' || opcion==8 && array [2][1]=='X' || opcion==9 && array [2][2]=='X'||
        	 opcion==1 && array [0][0]=='O' || opcion==2 && array [0][1]=='O' || opcion==3 && array [0][2]=='O' || 
        	 opcion==4 && array [1][0]=='O' || opcion==5 && array [1][1]=='O' || opcion==6 && array [1][2]=='O' ||
        	 opcion==7 && array [2][0]=='O' || opcion==8 && array [2][1]=='O' || opcion==9 && array [2][2]=='O') {
    	System.out.println("Introduce una posicion que no este llena");
    	opcion=scan.nextInt();
        }
     
     switch(opcion) {
		case 1: array [0][0]='X';break;
		case 2:array [0][1]='X';break;
		case 3:array [0][2]='X';break;
		case 4:array [1][0]='X';break;
		case 5:array [1][1]='X';break;
		case 6:array [1][2]='X';break;
		case 7:array [2][0]='X';break;
		case 8:array [2][1]='X';break;
		case 9:array [2][2]='X';break;
		}
     while( fichaMaquina==1 && array [0][0]=='X' || fichaMaquina==2 && array [0][1]=='X' || fichaMaquina==3 && array [0][2]=='X' || 
      	   fichaMaquina==4 && array [1][0]=='X' || fichaMaquina==5 && array [1][1]=='X' || fichaMaquina==6 && array [1][2]=='X' ||
      	   fichaMaquina==7 && array [2][0]=='X' || fichaMaquina==8 && array [2][1]=='X' || fichaMaquina==9 && array [2][2]=='X' ||
      	   fichaMaquina==1 && array [0][0]=='O' || fichaMaquina==2 && array [0][1]=='O' || fichaMaquina==3 && array [0][2]=='O' || 
      	   fichaMaquina==4 && array [1][0]=='O' || fichaMaquina==5 && array [1][1]=='O' || fichaMaquina==6 && array [1][2]=='O' ||
      	   fichaMaquina==7 && array [2][0]=='O' || fichaMaquina==8 && array [2][1]=='O' || fichaMaquina==9 && array [2][2]=='O') {
      	fichaMaquina= (int)(Math.random()*9+1);
      }
       
		switch(fichaMaquina) {
		case 1: array [0][0]='O';break;
		case 2:array [0][1]='O';break;
		case 3:array [0][2]='O';break;
		case 4:array [1][0]='O';break;
		case 5:array [1][1]='O';break;
		case 6:array [1][2]='O';break;
		case 7:array [2][0]='O';break;
		case 8:array [2][1]='O';break;
		case 9:array [2][2]='O';break;
		}
		

		
	System.out.println(Arrays.toString(array[0]));
	System.out.println(Arrays.toString(array[1]));
	System.out.println(Arrays.toString(array[2]));	
	while(//horizontales
			array [0][0]=='X' && array [0][1]=='X' && array [0][2]=='X'|| 
			array [1][0]=='X' && array [1][1]=='X' && array [1][2]=='X' || 
			array [2][0]=='X' && array [2][1]=='X' && array [2][2]=='X'||
			//verticales
			array [0][0]=='X' && array [1][0]=='X' && array [2][0]=='X'|| 
			array [0][1]=='X' && array [1][1]=='X' && array [2][1]=='X' || 
			array [0][2]=='X' && array [1][2]=='X' && array [2][2]=='X' ||
			//cruzadas
					array [0][0]=='X' && array [1][1]=='X' && array [2][2]=='X'|| 
					array [0][2]=='X' && array [1][1]=='X' && array [2][0]=='X' 
			) {
		contador=1;
			System.out.println("Has ganado");
			System.exit(contador=1);}
	
	while(//horizontales
			array [0][0]=='O' && array [0][1]=='O' && array [0][2]=='O' || 
			array [1][0]=='O' && array [1][1]=='O' && array [1][2]=='O' || 
			array [2][0]=='O' && array [2][1]=='O' && array [2][2]=='O' ||
			//vertical
			array [0][0]=='O' && array [1][0]=='O' && array [2][0]=='O' || 
			array [0][1]=='O' && array [1][1]=='O' && array [2][1]=='O' || 
			array [0][2]=='O' && array [1][2]=='O' && array [2][2]=='O' ||
			//cruzadas
			array [0][0]=='O' && array [1][1]=='O' && array [2][2]=='O' || 
			array [0][2]=='O' && array [1][1]=='O' && array [2][0]=='O') {
		contador=2;
		System.out.println("Has perdido");
		System.exit(contador=2);
		
	}
	
      }
      
      
      
      
	}

}
