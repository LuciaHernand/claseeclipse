package exam1;

import java.util.ArrayList;
import java.util.Collections;

public class Eje1 {

	public static void main(String[] args) {
	ArrayList<String> LigaDeBarrio=new ArrayList<String>();
	
	LigaDeBarrio.add("Madrid");
	LigaDeBarrio.add("Barcelona");
	LigaDeBarrio.add("Sevilla");
	LigaDeBarrio.add("Valencia");
	LigaDeBarrio.add("Español");
	LigaDeBarrio.add("Atletico de Madrid");
	LigaDeBarrio.add("Atletico de Bilbao");
	LigaDeBarrio.add("Malaga");
	LigaDeBarrio.add("Valladolid");
	LigaDeBarrio.add("Celta");

	
	System.out.println(LigaDeBarrio);
	
	Collections.shuffle(LigaDeBarrio);
	System.out.println(LigaDeBarrio);
	
	}

}
