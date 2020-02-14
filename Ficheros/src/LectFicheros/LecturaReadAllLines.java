package LectFicheros;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LecturaReadAllLines {
	public static void escribirPantalla(List<String> listaStrings) {
		System.out.println("Primera Línea:"+ listaStrings.get(0));
		for (String s: listaStrings) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
				//Instanciamos el ficehro de entrada
				Path entrada = Paths.get("OtraFicheros/Ejemplo1.txt");			
				
				//Del fichero que leamos, nos devolverá una lista de Strings, estando en cada String una línea
				List<String> fileLista;
				Charset charset=StandardCharsets.UTF_8; //tipo de caracteres que se leen
				try {
					
					fileLista = Files.readAllLines(entrada, charset);
				
					escribirPantalla(fileLista);
					
				} catch (IOException io) {
					System.err.println(io.toString());
				}

	}

}
