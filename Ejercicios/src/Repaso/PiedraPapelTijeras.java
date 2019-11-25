package Repaso;

import java.util.Scanner;

public class PiedraPapelTijeras {
	public static void main(String[] args) {
		
		int jugador1,jugador2 = 0;
		int puntos1=0,puntos2=0;
		
		Scanner scan=new Scanner(System.in);
		
		do {
		System.out.println("Jugador 1 introduce una de las opciones:");
		System.out.println("\t1:Piedra.\t2:Papel.\t3:Tijeras");
				jugador1=scan.nextInt();
	    
		System.out.println("Jugador 2 introduce una de las opciones:");
		System.out.println("\t1:Piedra.\t2:Papel.\t3:Tijeras");
		         jugador2=scan.nextInt();
		
		if(jugador1==1 && jugador2==1)System.out.println("Empate");
		if(jugador1==1 && jugador2==2) {puntos2=puntos2+1;
		System.out.println("Jugador 1: "+puntos1+"\nJugador2: "+puntos2);}
		if(jugador1==1 && jugador2==3) {puntos1=puntos1+1;
		System.out.println("Jugador 1: "+puntos1+"\nJugador2: "+puntos2);}
		
		if(jugador1==2 && jugador2==2)System.out.println("Empate");
		if(jugador1==2 && jugador2==1) {puntos1=puntos1+1;
			System.out.println("Jugador 1: "+puntos1+"\nJugador2: "+puntos2);}
		if(jugador1==2 && jugador2==3) {puntos2=puntos2+1;
		System.out.println("Jugador 1: "+puntos1+"\nJugador2: "+puntos2);}
		
		
		if(jugador1==3 && jugador2==3)System.out.println("Empate");
		
		if(jugador1==3 && jugador2==1) {puntos2=puntos2+1;
		System.out.println("Jugador 1: "+puntos1+"\nJugador2: "+puntos2);}
		
		if(jugador1==3 && jugador2==2) {puntos1=puntos1+1;
		System.out.println("Jugador 1: "+puntos1+"\nJugador2: "+puntos2);}
		if(puntos1==10) {System.out.println("Jugador1 Wins!");System.exit(10);}
		if(puntos2==10) {System.out.println("Jugador2 Wins!");System.exit(10);}
	
		}while(puntos1<=10||puntos2<=10);
		
		
		
	scan.close();	
	}}