package CentrosInformatica;

import java.io.BufferedWriter;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class main2 {

	public static void main(String[] args) {

	//paths archivos que vamos a utilizar
		Path archivo= Paths.get("Ficheros1/CentrosFpInformatica.csv");
		Path SanFer =Paths.get("Ficheros1/SanFer.txt");
		Path Coslada= Paths.get("Ficheros1/Coslada.txt");
		Path Torrejon =Paths.get("Ficheros1/Torrejon.txt");
		Path General = Paths.get("Ficheros1/general.txt");
		
		//Listas que vamos a utilizar
		List<String> centros = new ArrayList<String>();
		List<String> centrosCoslada= new ArrayList<String>();
		List<String> centrosSanFer= new ArrayList<String>();
		List<String> centrosTorrejon= new ArrayList<String>();
		//tipo de charset
		Charset charset = StandardCharsets.ISO_8859_1;
		
		int n;
		//para lectura
		InputStream iBuffer=null;
		
		// para añadir el writer 
		
		BufferedWriter textCoslada=null;
		BufferedWriter textSanFer=null;
		BufferedWriter textTorrejon=null;
		BufferedWriter textGeneral=null;
		//Arrays
		String atributosCoslada[] = null;
		String atributosSanFer[]=null;
		String atributosTorrejon[]=null;

		try {
			//lectura de archivo
			iBuffer=Files.newInputStream(archivo);
		String linea=null;
		
			while((n=iBuffer.read())!=-1) {
				if(n=='\n') {
					//contains, para separar en las listas
					if(linea.contains("Coslada")|| linea.contains("28820")|| linea.contains("28821")|| linea.contains("28822")|| linea.contains("28823")) {
					
						
						centrosCoslada.add(linea);
						
					}
					else if(linea.contains("San Fernando de Henares")|| linea.contains("28830")) {
							
							centrosSanFer.add(linea);
							
						
					}
					else if(linea.contains("Torrejón de Ardoz")|| linea.contains("28850")|| linea.contains("28851")) {
						
						centrosTorrejon.add(linea);
						
					
				}	
					
				centros.add(linea);
				linea="";
				
				} //añadir linea
				else linea+=(char)n;
				
		
			
			}
			
			//Añadir con el bufferwriter al archivo de texto
			textGeneral=Files.newBufferedWriter(General, charset);
			
		
			for(String j: centrosCoslada) {
				
				//split separa segun lo que le digas
			atributosCoslada=j.split(";");
			//archivo en el que escribimos
			 //textCoslada = Files.newBufferedWriter(Coslada, charset); 
			 //entradas de texto
			// textCoslada.write("Coslada:\n\n");
			 textGeneral.write("Coslada:\n\n");
	
				//textCoslada.write("\t-"+atributosCoslada[2]+", "+atributosCoslada[3]+", "+atributosCoslada[5]+", Calle: "+atributosCoslada[6]+"\n");
				textGeneral.write("\t-"+atributosCoslada[2]+", "+atributosCoslada[3]+", "+atributosCoslada[5]+", Calle: "+atributosCoslada[6]+"\n");
			}//cerrar entradas de texto
			//textCoslada.close();
		
			textGeneral.write("\nSan Fernando de Henares:\n\n");
			for(String j: centrosSanFer) {
				atributosSanFer=j.split(";");
				
				//textSanFer = Files.newBufferedWriter(SanFer, charset);
				//textSanFer.write("San Fernando de Henares:\n\n");
				
				
				//textSanFer.write("\t-"+atributosSanFer[2]+","+atributosSanFer[3]+","+atributosSanFer[5]+", Calle: "+atributosSanFer[6]+"\n");
				textGeneral.write("\t-"+atributosSanFer[2]+","+atributosSanFer[3]+","+atributosSanFer[5]+", Calle: "+atributosSanFer[6]+"\n");
				
				
				}
				//textSanFer.close();
				textGeneral.write("\nTorrejón de Ardoz:\n\n");
				for(String j: centrosTorrejon) {
					atributosTorrejon=j.split(";");
					
					//textTorrejon = Files.newBufferedWriter(Torrejon, charset);
					
					//textTorrejon.write("Torrejón de Ardoz:\n\n");
					
					
					//textTorrejon.write("\t-"+atributosTorrejon[2]+", "+atributosTorrejon[3]+", "+atributosTorrejon[5]+", Calle: "+atributosTorrejon[6]+"\n");
					textGeneral.write("\t-"+atributosTorrejon[2]+", "+atributosTorrejon[3]+", "+atributosTorrejon[5]+", Calle: "+atributosTorrejon[6]+"\n");
					
					
					}
				//textTorrejon.close();
				textGeneral.close();
				
						
						
		centros.remove(0);
		
			
			
			
			
			
		
	
			
			
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
