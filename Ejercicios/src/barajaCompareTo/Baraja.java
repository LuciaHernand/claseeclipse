package barajaCompareTo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baraja {
	private List<Carta> baraja; 
	private String[] palos = {(char)9829+ "-Corazones",(char)9830+ "-Rombos",(char) 9827+"-Tréboles", (char)9824+"-Picas" };

	private   int primeraCarta=0;
	public Baraja() {
		baraja= new ArrayList<Carta>();
		
		for (int i = 1; i <= 10; i++) {
		for (int j = 0; j < 4; j++) {
		
				baraja.add( new Carta( i, palos[j]));
			}}

			
	}
	public void pintarBaraja() {
		System.out.println();
		int linea=1;
		for (Carta c : baraja) {
			System.out.print("\t" + c.toString());
			if (linea++%10==0) System.out.println();
		}
	}
	public void pintarPalos() {
		System.out.println();
		
		for (String p : palos) {
			System.out.print("\t" + p);
			
		}
	}
	
	public void barajar() {
		Collections.shuffle(this.baraja);
		
	}
	public Carta darCarta() {
		
		
		return baraja.get(primeraCarta++);
	}	
	

}
