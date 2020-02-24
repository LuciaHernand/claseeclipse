package CentrosInformatica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
	Path archivo= Paths.get("Ficheros1/CentrosFpInformatica.csv");
	List<String> centros = new ArrayList<String>();
	Charset charset = StandardCharsets.UTF_8;
	int n;
	InputStream iBuffer=null;
	BufferedWriter outBuffer=null;
	
	try {
		iBuffer=Files.newInputStream(archivo);
	String linea=null;
	
		while((n=iBuffer.read())!=-1) {
			if(n=='\n') {
				
			centros.add(linea);
			linea="";
			
			} else linea+=(char)n;
			
			
		}
	centros.remove(0);
		System.out.println(centros);
		
		
	} catch (Exception e) {
		System.err.println(e);
	}

	}

}
