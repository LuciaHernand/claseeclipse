package modelo;

import java.util.Calendar;
import java.util.List;

public class Populares extends Carrera {
	
	public List<String> modalidades;
	String lugarSalida;
	
	public Populares() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Populares(String nombre, Calendar fecha, String lugar, List<String> modalidades, String lugarSalida) {
		super(nombre, fecha, lugar);
		this.modalidades = modalidades;
		this.lugarSalida = lugarSalida;
	}

	public List<String> getModalidades() {
		return modalidades;
	}

	public void setModalidades(List<String> modalidades) {
		this.modalidades = modalidades;
	}

	public String getLugarSalida() {
		return lugarSalida;
	}

	public void setLugarSalida(String lugarSalida) {
		this.lugarSalida = lugarSalida;
	}

	@Override
	public String toString() {
		return "Populares [modalidades=" + modalidades + ", lugarSalida=" + lugarSalida + ", nombre=" + nombre
				+ ", fecha=" + fecha.get(Calendar.DAY_OF_MONTH) + "/" + fecha.get(Calendar.MONTH) + "/" + fecha.get(Calendar.YEAR) +  ", lugar=" + lugar + "]";
	}

	
	
	

}
