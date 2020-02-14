package jugador;

import java.util.Scanner;

import piedraPapelTijeras.piedra;
import sieteYmedia.SieteYmedia;
import tresEnRaya.TresEnRaya;

public class id {
	public String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Jugador 1- "+nombre;
	}

	public static void menu(int juego){
		switch (juego) {
		case 1: piedra p1=new piedra();break;
		case 2: TresEnRaya t1=new TresEnRaya();break;
		case 3:SieteYmedia s1=new SieteYmedia();break;
		
		}
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int juego;
		
		System.out.println("Selecciona el piedra que quieras");
		System.out.println("1:Piedra,papel o tijeras.\n2:Tres en raya.\n3:Siete y media.");
		juego=scan.nextInt();
		menu(juego);
	scan.close();	
	}

}
