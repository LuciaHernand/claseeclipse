package vista;


import java.util.List;
import java.util.Map;

import modelo.Alumno;


public class Salida {
	// Variable linea nos va a permitir pintar una línea de * siempre que queramos
	
	public static void mostrarAlumnos(List<Alumno> listaA) {
		for (Alumno a:listaA) {
			System.out.println(a.toString());
		}
		
	}
	
	public static void mostrarMapa(Map<String, Integer> mapaA) {
		mapaA.forEach((k,v)->{System.out.println("Apellido:"+k+ "   Número:"+v);});
		
	}
	
}
