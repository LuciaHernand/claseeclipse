package vista;


import java.util.List;
import java.util.Map;



public class Salida {
	// Variable linea nos va a permitir pintar una línea de * siempre que queramos
	
	
	
	public static void mostrarMapa(Map<String, Integer> mapaA) {
		mapaA.forEach((k,v)->{System.out.println("Apellido:"+k+ "   Número:"+v);});
		
	}
	
}
