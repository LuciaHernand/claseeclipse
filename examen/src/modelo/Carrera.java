package modelo;

import java.util.Calendar;

public class Carrera implements Comparable<Carrera> {
	
	String nombre;
	Calendar fecha;
	String lugar;
	
	public Carrera() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carrera(String nombre, Calendar fecha, String lugar) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	@Override
	public String toString() {
		return "Carrera [nombre=" + nombre + ", fecha=" + fecha.get(Calendar.DAY_OF_MONTH) + "/" + fecha.get(Calendar.MONTH) + "/" + fecha.get(Calendar.YEAR) + ", lugar=" + lugar + "]";
	}

	@Override
	public int compareTo(Carrera carrera) {
		int valorRetorno = 0; 
		
		//Por tipo de carrera
		if ((this instanceof Populares) && !(carrera instanceof DeCoches)) {
			valorRetorno = -1;
		}
		if (!(this instanceof Populares) && (carrera instanceof DeCoches)) {
			valorRetorno = 1;
		}
		
		//Por fecha
		if ((this instanceof Populares) && !(carrera instanceof DeCoches)) {
			if (this.getFecha().compareTo(carrera.getFecha()) == -1) {
				valorRetorno = -1;
			}
			if (this.getFecha().compareTo(carrera.getFecha()) == 1) {
				valorRetorno = 1;
			}
		}
		if (!(this instanceof Populares) && (carrera instanceof DeCoches)) {
			if (this.getFecha().compareTo(carrera.getFecha()) == -1) {
				valorRetorno = -1;
			}
			if (this.getFecha().compareTo(carrera.getFecha()) == 1) {
				valorRetorno = 1;
			}
		}
		
		return valorRetorno;
	}
	
	

}
