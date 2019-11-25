package ClasesYObjetos;

public class Libro1 {
	
	public String Titulo;
	public String feedicion;
	public int nPaginas;
    public String libro;

	public Libro1(String titulo,String feEdicion,int nPaginas) {
	
	  super();
	  this.Titulo=titulo;
	  this.feedicion=feEdicion;
	  this.nPaginas=nPaginas;
	  
	  libro="Titulo:"+titulo+ "\nEdicion:"+feEdicion+"\nTamaño:"+nPaginas;
		
	}

	public Libro1() {
		// TODO Auto-generated constructor stub
	}

	public String getLibro() {
		return libro;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getFeedicion() {
		return feedicion;
	}

	public void setFeedicion(String feedicion) {
		this.feedicion = feedicion;
	}

	public int getnPaginas() {
		return nPaginas;
	}

	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}

	@Override
	public String toString() {
		return "Titulo:" + Titulo + "\nEdicion:" + feedicion + "\nTamaño:" + nPaginas + " paginas";
	}

	public void setLibro(String libro) {
		Titulo = libro;
	}

	


}
