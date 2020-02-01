package barajaCompareTo;
import java.lang.System;
public class PrincipalC {
	static Jugador J1, J2;
	static Baraja B1=new Baraja();

public static void repartir(Jugador J1,Jugador J2,Baraja B1) {
	final int NUMCARTASREPARTO=3;
	for (int i=1;i<=NUMCARTASREPARTO;i++) {
		J1.anadirCarta(B1.darCarta());			
		J2.anadirCarta(B1.darCarta());
	}
}

	public static void main(String[] args) {
char hola='\u2764';

		
		J1=new Jugador();
		J2=new Jugador();
		J1.setNombre("Pepe");
		J2.setNombre("Ariel");
	B1.pintarBaraja();
	B1.barajar();
	B1.pintarBaraja();
		
		System.out.println(hola);
		
		
	}

}
