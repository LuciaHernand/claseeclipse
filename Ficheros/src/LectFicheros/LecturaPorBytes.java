package LectFicheros;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class LecturaPorBytes {
	static byte[] texto;
	
	public static void lectura() {

		Path entrada = Paths.get("OtraFicheros/Ejemplo1.txt");

		try {
			texto = Files.readAllBytes(entrada);

		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
	}

	public static void escribirFichero() {
		for (byte i : texto) {
			System.out.print((char) i);
		}
	}

	public static void main(String[] args) {

		lectura();
		escribirFichero();

	}

}
