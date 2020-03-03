package CentrosInformatica;



import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class mainConClases {

	public static void main(String[] args) {
		
		Path csvCentros= Paths.get("Ficheros1/CentrosFpInformatica.csv");
		Path General = Paths.get("Ficheros1/general.txt");
		
		Charset charset =StandardCharsets.ISO_8859_1;
		
		InputStream iBuffer=null;
		
		BufferedWriter textGeneral=null;
		
		List<String> lineasFichero= new ArrayList<String>();
		List<String> centros= new ArrayList<String>();
		
		
		
		try {
			int n;
			iBuffer=Files.newInputStream(csvCentros);
			String linea=null;
			List<centros> listaCentros = new ArrayList<centros>();
			while ((n = iBuffer.read()) != -1) {
				if(n=='\n') {
				
				lineasFichero.add(linea);
				if(linea.contains("Coslada")||linea.contains("San Fernando de Henares")||linea.contains("Torrejón de Ardoz")) {
					
					centros.add(linea);
				}
				
				linea="";
				
				
				}else linea+=(char)n;
			}	
			for (String k : centros) {
				
				String atributos[]=k.split(";");
					
					listaCentros.add(new centros(atributos[0], atributos[1], atributos[2], atributos[3], atributos[4], atributos[5],atributos[6],atributos[7],atributos[8]));
					
			}
			
			textGeneral=Files.newBufferedWriter(General, charset);
	
			textGeneral.write("Coslada:\n");
			textGeneral.write("\t-"+listaCentros.get(0).getDenEspecifica()+", "+listaCentros.get(0).getDenGenerica()+", "+listaCentros.get(0).getNaturaleza()+", "+listaCentros.get(0).getDomicilio()+"\n");
			textGeneral.write("San Fernando de Henares:\n");
			textGeneral.write("\t-"+listaCentros.get(1).getDenEspecifica()+", "+listaCentros.get(1).getDenGenerica()+", "+listaCentros.get(1).getNaturaleza()+", "+listaCentros.get(1).getDomicilio()+"\n");
			textGeneral.write("\t-"+listaCentros.get(2).getDenEspecifica()+", "+listaCentros.get(2).getDenGenerica()+", "+listaCentros.get(2).getNaturaleza()+", "+listaCentros.get(2).getDomicilio()+"\n");
			textGeneral.write("Torrejón de Ardoz:\n");
			textGeneral.write("\t-"+listaCentros.get(3).getDenEspecifica()+", "+listaCentros.get(3).getDenGenerica()+", "+listaCentros.get(3).getNaturaleza()+", "+listaCentros.get(3).getDomicilio()+"\n");
			textGeneral.write("\t-"+listaCentros.get(4).getDenEspecifica()+", "+listaCentros.get(4).getDenGenerica()+", "+listaCentros.get(4).getNaturaleza()+", "+listaCentros.get(4).getDomicilio()+"\n");
			textGeneral.write("\t-"+listaCentros.get(5).getDenEspecifica()+", "+listaCentros.get(5).getDenGenerica()+", "+listaCentros.get(5).getNaturaleza()+", "+listaCentros.get(5).getDomicilio()+"\n");
			
				System.out.println(listaCentros);
			textGeneral.close();
		}catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		
		}
		

	}

}
