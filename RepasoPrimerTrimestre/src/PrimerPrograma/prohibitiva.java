package PrimerPrograma;



public class prohibitiva extends SenialTrafico{

	String nombreArchivoImagen;
	String texto;
	 int alto,ancho;
	public String getNombreArchivoImagen() {
		return nombreArchivoImagen;
	}
	public void setNombreArchivoImagen(String nombreArchivoImagen) {
		this.nombreArchivoImagen = nombreArchivoImagen;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public prohibitiva() {
		super();
	}
	public void html() {
		System.out.println("<img src=\""+nombreArchivoImagen+"\""+", alt=\""+texto+"\", heith="+alto+"\""+",width="+ancho+"\""+">");
	}

}
