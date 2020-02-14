package EjemplosEscritura;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class EscSecBuffer {

		public static void main(String[] args) {
			Path file= Paths.get("Ficheros1/EscrSecuencialBuffer.txt");
			Charset charset = StandardCharsets.UTF_8;
			String[] s= {"Fila 1 del archivo","Fila 2 del archivo","Fila 3 del archivo"};
			BufferedWriter writer =null;
			try {
				 writer = Files.newBufferedWriter(file, charset); 
				 writer.write("INICIO del archivo\n");
				for (int i = 0; i < s.length; i++) {
					writer.write(s[i], 0, s[i].length());
					
					if (i<s.length-1) writer.newLine();
				}
				
			   
			} catch (IOException x) {
			    System.err.format("IOException: %s%n", x);
			}finally {
				 try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

