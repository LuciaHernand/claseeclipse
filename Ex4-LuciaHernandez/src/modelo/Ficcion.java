package modelo;

import java.util.Calendar;
import java.util.List;

public class Ficcion extends Entrada{
	List<String> actores;

	public Ficcion(Calendar fecha, String titulo, List<String> actores) {
		super(fecha, titulo);
		this.actores = actores;
	}

	public Ficcion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ficcion(Calendar fecha, String titulo) {
		super(fecha, titulo);
		// TODO Auto-generated constructor stub
	}

	public List<String> getActores() {
		return actores;
	}

	public void setActores(List<String> actores) {
		this.actores = actores;
	}

	@Override
	public String toString() {
		return super.toString()+"\tFiccion [actores=" + actores + "]";
	}
	

}
