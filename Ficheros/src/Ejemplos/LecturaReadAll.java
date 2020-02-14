package Ejemplos;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LecturaReadAll {
	public static void escribirPorPantalla(List<String> ListaStrings) {
		
		System.out.println("Primera Linea: "+ListaStrings.get(0));
		for(String s: ListaStrings) {
			System.out.println(s);
		}
		
	}

	public static void main(String[] args) {
		
		//Instanciamos el fichero de entrada
		
		Path entrada= Paths.get("Ficheros1/Ejemplo1");
		
		//Del fichero que leamos nos devolvera una lista de strings
		
		List<String> fileLista;
		Charset charset= StandardCharsets.UTF_8;//Tipo de caracteres.
		
		
		try {
			fileLista=Files.readAllLines(entrada,charset);
			escribirPorPantalla(fileLista);
		}
		catch(IOException io){
			System.err.println(io.toString());
			
		}
	}

}
