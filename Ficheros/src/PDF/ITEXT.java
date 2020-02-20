package PDF;

import java.io.FileOutputStream;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;



public class ITEXT {
	public static void main(String[]args) {
		
		try {
			//Crear documento
			Document documento= new Document();
			
			//Creamos el output stream
			FileOutputStream ficheroPdf =new FileOutputStream("Ficheros1/ficheroPdf.pdf");
			
			//Asociamos el documento al OutputStream e indicamos  que el espaciadp entre lineas sera de 20. esta llamada debe hacerse antes de abrir
			
			PdfWriter.getInstance(documento,ficheroPdf).setInitialLeading(20);
			
			documento.open();
			documento.add(new Paragraph("Este es el primer parrafo: vacio."));
			documento.add(new Paragraph("Este es el segundo parrafo",
					FontFactory.getFont("arial",21,Font.ITALIC,BaseColor.CYAN)));
			
			//AÑADIMOS UNA IMAGEN 
			Image foto=Image.getInstance("Ficheros1/índice.png");
			
				foto.scaleToFit(100,50);
				foto.setAlignment(Chunk.ALIGN_CENTER);
				documento.add(foto);
				
			//añadimos una tabla
				
				PdfPTable tabla=new PdfPTable(3);
				
				for(int i=0;i<15;i++) {
					tabla.addCell("Celda "+i);
				}
				documento.add(tabla);
				
			documento.close();
			
			
			
			
			
			
			
				
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
