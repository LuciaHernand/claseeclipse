package control;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


import modelo.Tenis;

public class IndezExamen {
	public static String ganador(String uno,String dos,String tres,String jugador1,String jugador2){
		String ganador = null;
		
		int jug1=0;
		int jug2=0;
		jug1= uno.charAt(0)+dos.charAt(0)+tres.charAt(0);
		jug2= uno.charAt(2)+dos.charAt(2)+tres.charAt(2);
		if (jug1>jug2) ganador=jugador1;
		else ganador=jugador2;
		
		return ganador;
		
	}
		
		public static void PartidosTenis(List<String> x ,List<Tenis> partidos) {
	
		
				for(String k: x) {
			
		String[]atributos=	k.split(";");
		
		partidos.add(new Tenis(atributos[0],atributos[1],ganador(atributos[2],atributos[3],atributos[4],atributos[0],atributos[1]),atributos[2]+","+atributos[3]+","+atributos[4]));
		
		
		}
			
		}
	

	public static void main(String[] args) {
		Path archivo= Paths.get("files/Libro1.csv");
		BufferedReader iBuffer= null;
		BufferedWriter oBuffer=null;
		Charset charset =StandardCharsets.UTF_8;
		List<String> primera=new ArrayList<String>();
		List<Tenis> partidos= new ArrayList<Tenis>();
		Calendar fecha = Calendar.getInstance();
		
		
		try {
			int n=0;
			String linea="";
			iBuffer=Files.newBufferedReader(archivo,charset);
			
			while((n=iBuffer.read())!=-1) {
				if(n=='\n') {
					
				primera.add(linea);
				linea="";
				
				} else linea+=(char)n;
				
				
			}
			
			primera.remove(0);
			PartidosTenis(primera,partidos);
			System.out.println(partidos);
			System.out.println(fecha.getTime());
			fecha.set(2023,4, 12);
			System.out.println(fecha.getTime());
			System.out.println(3%2);
			
		} catch (Exception e) {
			
		}

	}

}
