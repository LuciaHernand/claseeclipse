package LectFicheros;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectSecuencialStreams {
	
		public static void main(String[] args) {
			Path entrada = Paths.get("Ficheros/Ejemplo1.txt");
			InputStream iStream=null;
			List<String> texto=new ArrayList<String>();
			int c;
			String filas;
			try {
				
				iStream = Files.newInputStream(entrada);
				filas="";
				while ((c = iStream.read()) != -1) {
					//System.out.print((char)c);
					if (c=='\n') {
						texto.add(filas);
						filas="";
					}else filas+=(char)c;
					
				}
				//texto.add(filas.substring(1));
				//System.out.println(texto);
				
				for (String s:texto) {
					System.out.println(s);
				}
				
				
			} catch (IOException io) {
				System.out.println(io.toString());
			} finally {
				try {
					iStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

}
