package EscrituraEjercicio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class EscrituraF {
	public static void escribirFichero(String fichero, List<String> contenido) {
		//Escritura en un fichero de una vez, con una lista de Strings
		
			Path salida = Paths.get(fichero);		
			
		
			Charset charset=StandardCharsets.UTF_8;
			try {
				
				Files.write(salida, contenido,charset);
			} catch (IOException io) {
				System.err.println(io);
			}
		}
	
}
