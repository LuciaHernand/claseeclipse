package modelo;

import java.util.Calendar;
import java.util.List;

public class Serie  extends Ficcion{

	int temporadas;

	@Override
	public String toString() {
		return super.toString()+"\tSerie [temporadas=" + temporadas + "]";
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public Serie(Calendar fecha, String titulo, List<String> actores, int temporadas) {
		super(fecha, titulo, actores);
		this.temporadas = temporadas;
	}


	public Serie(Calendar fecha, String titulo) {
		super(fecha, titulo);
		
	}

	

	
	
}
