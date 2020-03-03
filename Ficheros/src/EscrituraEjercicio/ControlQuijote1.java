package EscrituraEjercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ControlQuijote1 {

	public static void main(String[] args) {
		Path quijote =Paths.get("Ficheros1/Quijote.txt");
		Path salida=Paths.get("OtraFicheros/puntoYAparteQuijote.txt");
		Charset charset= StandardCharsets.UTF_8;
		
		int n=0;
		String linea = ""; 
		
		List<String> lineas=new ArrayList<String>();
		List<String> escribir=new ArrayList<String>();
		
		
		try {
			BufferedReader iBuffer= Files.newBufferedReader(quijote);
			BufferedWriter outBuffered= Files.newBufferedWriter(salida,charset);
			
			
			
			while((n=iBuffer.read())!=-1) {
				if(n=='\n') {
			if(linea.contains(".")) {
				linea=linea.replace(".", ".\t:"+linea.length()+"\n");
				
				
				
				
				}
			/*else if (linea.contains("i")||linea.contains("I")) {
				linea=linea.replace("i", "y");
				linea=linea.replace("I", "Y");
				
				}*/
			else  {
				linea=linea.replace("\n", "\r\t:"+linea.length()+"\n");
				
				
			}
			outBuffered.write(linea);
			lineas.add(linea);
			
			linea="";
				
				}
			else linea+=(char)n;}
			System.out.println(escribir);
			outBuffered.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
