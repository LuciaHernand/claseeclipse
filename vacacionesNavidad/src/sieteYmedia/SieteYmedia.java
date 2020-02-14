package sieteYmedia;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import jugador.id;
import piedraPapelTijeras.piedra;
import tresEnRaya.TresEnRaya;

public class SieteYmedia extends id{
	


	public void verMenu(){
		System.out.println("Seleccione la opcion que desee:\t1:Otra carta.\t2:Plantarse.");
	}
	public static void contador(int cartas[],int aleatorio[]){
		float[] puntuacion =new float[10];
		float total;
		for(int x=0;x<9;x++) {
			
			puntuacion[0]=cartas[0];
			puntuacion[1]=aleatorio[0];
			puntuacion[2]=aleatorio[1];
			puntuacion[3]=aleatorio[2];
			puntuacion[4]=aleatorio[3];
			puntuacion[5]=aleatorio[4];
			puntuacion[6]=aleatorio[5];
			puntuacion[7]=aleatorio[6];
			puntuacion[8]=aleatorio[7];
			puntuacion[9]=aleatorio[8];
		while (cartas[0]>=10) {
			puntuacion[0]=(float) 0.5 ;
			
		}
		
		
		while  (aleatorio[x]>=10 ) {
		puntuacion[x]=(float)0.5;
		
		}}
		
		System.out.println(total=puntuacion[0]+puntuacion[1]+puntuacion[2]+puntuacion[3]
				+puntuacion[4]+puntuacion[5]+puntuacion[6]+puntuacion[7]+puntuacion[8]+puntuacion[9]);
		if (total==7.5) System.out.println("Has ganado 3 puntos");
		else if (total<=7)System.out.println("Has ganado un punto");
		else if (total>7.5)System.out.println("Pierdes un punto");
		}
	
	public SieteYmedia() {
		int [] aleatorio=new int [9];
		int [] cartas= new  int[1];
		int i=0;
		int hola=0;
		Scanner scan=new Scanner(System.in);
		Random ran=new Random();
		int opcion;

		
System.out.println("Introduce tu nombre");
		
		id j1=new id();
		
		j1.setNombre(scan.next());
		
		System.out.println("La banca te dara una carta");
		
		 cartas[0]=(int)(Math.random()*12+1);
		System.out.println(cartas[0]);
		
		for(int z=0;z<9;z++) {
		verMenu();
		opcion=scan.nextInt();
		
		switch(opcion) {
		case 1: aleatorio[i]=(int)(Math.random()*12+1);
		System.out.println(Arrays.toString(aleatorio));
		
		i++;break;
			//otra carta
			
		case 2: contador(cartas, aleatorio);hola++;break;
			//plantarse llamar a contador 
		}
		
		
		if (hola==1) {System.exit(1);}
		
		
		}
	}

}
