package LectFicheros;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LectSecuenciaBuffer {

	public static void main(String[] args) {
		Path file= Paths.get("Ficheros/Ejemplo1.txt");
		Charset charset = StandardCharsets.UTF_8;
		BufferedReader iBuffer=null;
		
		try{
			
			iBuffer = Files.newBufferedReader(file, charset);	
			int c = 0;
			/*
			 * while ((c =iBuffer.read()) != -1) { System.out.print((char)c); }
			 */
			//Lectura por líneas 
			  String line = null;
			  while ((line = iBuffer.readLine()) != null) {
			  System.out.println(line); }
			 
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}finally {
			
            if (iBuffer != null) {
            	try {
					iBuffer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}}
		}
	}

}
