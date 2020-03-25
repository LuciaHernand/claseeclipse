package modelo;

import java.util.Calendar;
import java.util.List;

public class Pelicula extends Ficcion{
	
	int duracion;

	@Override
	

	public int getDuracion() {
		return duracion;
	}


	@Override
	public String toString() {
		return super.toString()+"\tPelicula [duracion=" + duracion + "]";
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public Pelicula(Calendar fecha, String titulo, List<String> actores, int duracion) {
		super(fecha, titulo, actores);
		this.duracion = duracion;
	}



	

	public Pelicula(Calendar fecha, String titulo) {
		super(fecha, titulo);
		
	}

}
