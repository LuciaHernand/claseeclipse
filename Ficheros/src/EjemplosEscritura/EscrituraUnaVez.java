package EjemplosEscritura;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EscrituraUnaVez {
	//Escritura en un fichero de una vez, con una lista de Strings
		public static void main(String[] args) {
				
			Path salida = Paths.get("Ficheros/EscrituraUnaVez.txt");		
			
			List<String> fileLista=new ArrayList<>(Arrays.asList("Linea3","Linea7","Linea6"));
			Charset charset=StandardCharsets.UTF_8;
			try {
				
				Files.write(salida, fileLista,charset);
			} catch (IOException io) {
				System.err.println(io);
			}
		}
	}



