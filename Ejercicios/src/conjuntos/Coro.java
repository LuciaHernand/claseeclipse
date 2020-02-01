package conjuntos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Coro {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		String comprobar;
		
		Set<String> instrumentos=new HashSet<String>();
		
		instrumentos.add("Pandereta");
		instrumentos.add("Trompeta");
		instrumentos.add("Guitarra");
		instrumentos.add("Tuba");
		
		instrumentos.remove("Tuba");
		
		System.out.println(instrumentos);
	
		System.out.println();
		System.out.println("Intruduce un instrumento.");
		
		
		
		System.out.println(instrumentos.contains(comprobar=scan.next()));
		
		Iterator<String> i=instrumentos.iterator();
		ArrayList<String> Ordenar=new ArrayList();
		while(i.hasNext()) {
			
			
			Ordenar.add(i.next());
		}
		System.out.println();
		System.out.println("ArrayList nuevo");
		System.out.println(Ordenar);
		
	
	
	}

}
