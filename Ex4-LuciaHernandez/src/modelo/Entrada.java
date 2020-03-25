package modelo;

import java.util.Calendar;

public class Entrada {
	Calendar fecha;
	String titulo;
	public Entrada(Calendar fecha, String titulo) {
		super();
		this.fecha = fecha;
		this.titulo = titulo;
	}
	public Entrada() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calendar getFecha() {
		return fecha;
	}
	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	@Override
	public String toString() {
		return "Entrada [fecha=" + fecha.getTime() + ", titulo=" + titulo + "]\n";
	}
	public int getDuracion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
