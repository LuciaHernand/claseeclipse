package EjemplosEscritura;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;


public class EscrituraUnaVezBytes {
	
	public static void escritura() {
		Path salida = Paths.get("Ficheros1/EscrituraUnaVezBytes.txt");
		
		String s = "Esto es lo que escribo en el fichero, si tiene mas de una linea podemos \ntener saltos de linea\ny se ve que  lo interpreta correctamente ";
		
		try {
			byte[] b = s.getBytes();			
			Files.write(salida, b,StandardOpenOption.APPEND);

		} catch (IOException io) {
			System.err.println(io.getMessage());
		}
	}

	
	public static void main(String[] args) {

		escritura();
		

	}

}
