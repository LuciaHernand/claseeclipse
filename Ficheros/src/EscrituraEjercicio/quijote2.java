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

public class quijote2 {

	

		public static void main(String[] args) {
			Path fileIn = Paths.get("Ficheros1/Quijote.txt");
			Path fileOut = Paths.get("Ficheros1/Quijote2.txt");
			Path fileOut2 = Paths.get("Ficheros1/Quijote3.txt");
			Charset charset = StandardCharsets.UTF_8;
			BufferedReader iBuffer = null;
			BufferedWriter oBuffer = null;
			BufferedWriter oBuffer2 = null;
			List<String> texto = new ArrayList<String>();

			try {
				
				iBuffer = Files.newBufferedReader(fileIn, charset);
				oBuffer=Files.newBufferedWriter(fileOut, charset);
				oBuffer2=Files.newBufferedWriter(fileOut2, charset);
				
				String line = null;
				while ((line = iBuffer.readLine()) != null) {
					if (line.contains(".")) {
						line=line.replace(".", ".\n");
					}
					oBuffer.write(line + "\t: "+ line.length()+ "\n");
				}
				int c = 0; int num = 0; String line2 = "";
				while ((c =iBuffer.read()) != -1) {
					if (line2.length() == 60) {
						line2+="\n";
					texto.add(line2);
					
						line2="";
					} else if ( (c!='\n') && (c!='\r') ){
						line2+=(char)c;
					}
					//oBuffer2.write(line2);
					oBuffer2.write(line2);
					
				}
				
			} catch (IOException e1) {
				System.err.format("IOException: %s%n", e1);
			} finally {

				if ((iBuffer != null) && (oBuffer != null)&& (oBuffer2!=null)) {
					try {
						iBuffer.close();
						oBuffer.close();
						oBuffer2.close();
					} catch (IOException e2) {
						e2.printStackTrace();
					}
				//	EscrituraF.escribirFichero("'Ficheros1/Quijote3.txt'", texto);
					
				}
			}

		}

	}

