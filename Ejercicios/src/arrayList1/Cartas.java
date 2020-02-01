package arrayList1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

import Arrays.BarajaCartas;



public class Cartas {

	public static void j1( ArrayList<String> cartas, int s) {
	
			int x= (int) (Math.random()*s);
			
			System.out.println();
			System.out.print("j1:"+cartas.get(x));
			cartas.remove(x);
			
		}
		
	public static void j2( ArrayList<String> cartas, int s) {
		int x= (int) (Math.random()*s);
		
		
		System.out.print("	j2:"+cartas.get(x));
		cartas.remove(x);
	}
	public static void j3( ArrayList<String> cartas, int s) {
		int x= (int) (Math.random()*s);
		
		
		System.out.print("	j3:"+cartas.get(x));
		System.out.println();
		cartas.remove(x);
	}

	public static void main(String[] args) {
		Random  ran=new Random();
			ArrayList<String> cartas=new ArrayList<String>(Arrays.asList("1a","2a","3a","4a","5a","1b","2b","3b","4b","5b","1c","2c","3c","4c","5c","1d","2d","3d","4d","5d"));
			
						
			System.out.println("Esta es la baraja:");
			System.out.println(cartas);
			System.out.println();
			Collections.shuffle(cartas);
			System.out.println("Ahora vamos a barajar las cartas");
			int s=20;
			
		for(int y=0;y<=2;y++) {

		j1(cartas,s);
		s=s-y;
		j2(cartas,s);
		s=s-y;
		j3(cartas,s);
		s=s-y;
	
		}
		
		
		}
		
	
	
	
	
	}


