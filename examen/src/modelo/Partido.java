package modelo;

import java.util.Calendar;

public class Partido {
	Calendar fecha;
	String lugar;
	public Partido() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Partido(Calendar fecha, String lugar) {
		super();
		this.fecha = fecha;
		this.lugar = lugar;
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
		return "Tenis [fecha=" + fecha + ", lugar=" + lugar + "]";
	}
	
	

}
