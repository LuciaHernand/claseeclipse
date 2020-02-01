package arrayList1;

import java.util.ArrayList;

public class Enteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> varColeccionEnteros=new ArrayList<Integer>();
		
		varColeccionEnteros.add(15);
		
		
		ArrayList<Character> vocales=new ArrayList<Character>();
		
		vocales.add('a');
		vocales.add('e');
		vocales.add('i');
		vocales.add('o');
		vocales.add('u');
		
		for(char s:vocales) {System.out.println(s);}
		
		ArrayList<Persona> lista=new ArrayList<Persona>();
		
		lista.add(new Persona("Laura",14));
		lista.add(new Persona("Francisco",20));
		lista.add(new Persona("Pepe",23));
		lista.add(new Persona("Julio",65));
		for(Persona c:lista) {
			System.out.println(c);
		}
		System.out.println();
		lista.remove(lista.get(0));
		for(Persona c:lista) {
		System.out.println(c);}
		
		System.out.println();
		
	
		System.out.println(lista.contains("Julio"));
	}

}
