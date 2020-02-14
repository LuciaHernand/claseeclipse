package EjemplosEscritura;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LectEscPeqChar {
	static List<String> fileLista;
	static Charset charset = Charset.forName("UTF-8");;

	public static void escritura() {
		Path salida = Paths.get("Ficheros1/LectEscrPeqChar.txt");
		try {

			// Escribimos una vez un archivo entero de caracteres utilizando java.nio
			Files.write(salida, fileLista, charset);
		} catch (IOException io) {
			System.err.println(io);
		}
	}

	public static void lectura() {
		Path entrada = Paths.get("Ficheros1/Nuevo.txt");
		// Lista de cadenas para leer las lineas

		try {

			// Leemos de una vez un archivo entero de caracteres utilizando java.nio
			fileLista = Files.readAllLines(entrada);

		} catch (IOException io) {
			System.err.println(io);
		}
	}

	public static void main(String[] args) {
	
		lectura();
		escritura();
	}

}