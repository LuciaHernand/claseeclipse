package piedraPapelTijeras;

import java.util.Random;
import java.util.Scanner;

import jugador.id;

public class piedra extends id {
public static void comparar(int ficha,int opciones) {

	if(ficha==1 && opciones==1 || ficha==2 && opciones==2 || ficha==3 && opciones==3)System.out.println("Empate");
	if(ficha==1 && opciones==2 || ficha==2 && opciones==3 || ficha==3 && opciones==1) {System.out.println("Yo gano");}
	if(ficha==1 && opciones==3 || ficha==2 && opciones==1 || ficha==3 && opciones==2) {System.out.println("Tu ganas");}
	

	
	
}
	public piedra() {
		Scanner scan=new Scanner(System.in);

		Random ran=new Random();

		int ficha;
		id j1=new id();
		
		
		System.out.println("Introduce el nombre del Jugador 1");
	 j1.setNombre(scan.next());

		System.out.println(j1.toString()+" \nElige una opción");
		System.out.println("1:Piedra\n2:Papel\n3:Tijeras");

		ficha=scan.nextInt();
		
		int opciones=(int)(Math.random()*3+1);
		System.out.println("Maquina:"+opciones);

		comparar(ficha, opciones);
	
	
	scan.close();
	}

}
