package conjuntos;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Basico {

	public static void main(String[] args) {
		
		Set<Integer> conjunto=new HashSet<Integer>();
		for (int i=0;i<10;i++) {
			conjunto.add(i);
			
		}
		
		//Recorrido de todo el conjunto añadiendo asterisco
		System.out.println("Iterando");
		Iterator<Integer> i=conjunto.iterator();
		
		while(i.hasNext()) {
			System.out.println("*"+i.next());
			System.out.println();
		}
		//Tamaño del conjunto,vacio,contiene un valor? Empty=vacio;
		
		System.out.println(conjunto.size());
		System.out.println(conjunto.isEmpty());
		System.out.println();
		

	}

}
