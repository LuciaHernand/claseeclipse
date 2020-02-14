package EjemplosEscritura;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EscrSecStream {

	public static void main(String[] args) {
			String[] datos= {"Fila 1 del archivo\n","Fila 2 del archivo\n","Fila 3 del archivo\n"};
			  OutputStream stream = null;
			  byte[] b=null;
			  try {
			    stream = new FileOutputStream("Ficheros1/EscrituraSecStream.txt");
			    for (String fila : datos) {
			    	b=fila.getBytes();
			      stream.write(b, 0, fila.length());
			     // stream.write();
			    }
			  } catch (Exception e) {
			    // ...
			  } finally {
			    try {
					stream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  }
			}


	}


