package Control;


import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;
import modelo.Entrada;
import modelo.Pelicula;
import modelo.Serie;

public class IndexModelo {
	
		
		
		
	

	public static void main(String[] args) {

		
		Path fichero= Paths.get("Ficheros/catalogo.csv");
		
		InputStream iBuffer=null;
		
		List<String> lineasFichero =new ArrayList<String>();
		List<Entrada> listaEntrada=new ArrayList<Entrada>();
		List<Pelicula> pelicula1=new ArrayList<Pelicula>();
		List<Serie> series=new ArrayList<Serie>();
		try {
			
			
			iBuffer=Files.newInputStream(fichero);
			int n;
			String linea = "";
			while((n=iBuffer.read())!=-1) {
				if(n=='\n') {
					
					lineasFichero.add(linea);
					
				linea="";
				
				
				} else linea+=(char)n;
				
					
			}
			lineasFichero.remove(0);
			for(String k:lineasFichero) {
				
				String [] atributos=k.split(";");
				
					String[] fecha=atributos[0].split("/");
						int año=Integer.parseInt( fecha[2]);
						int mes=Integer.parseInt(fecha[1])-1;
						int dia=Integer.parseInt(fecha[0]);
				listaEntrada.add(new Entrada(new GregorianCalendar(año,mes,dia),atributos[1]));
				
				
				if(atributos[2].equals("P")) {
					 String [] actores=atributos[3].split(",");
			atributos[6]=atributos[6].replace("\n","");
			
					
					 pelicula1.add(new Pelicula( new GregorianCalendar(año,mes,dia), atributos[1],
					  Arrays.asList(actores), Integer.parseInt(atributos[6])));
					 
				}
				else if(atributos[2].equals("D")) {
					
					
					
				}
				else if(atributos[2].equals("S")) {
					 String [] actores=atributos[3].split(",");
					
				series.add(new Serie(new GregorianCalendar(año,mes,dia),
						atributos[1], Arrays.asList(actores),Integer.parseInt(atributos[4])));
				}
				
			}
			
			
			  
			 
			 
			
			
			
			//System.out.println(listaEntrada);
			System.out.println(pelicula1);
			
			iBuffer.close();
		
			
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
