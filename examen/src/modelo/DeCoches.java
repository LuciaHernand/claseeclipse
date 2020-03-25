package modelo;

import java.util.Calendar;

public class DeCoches extends Carrera {
	
	String record;
	String ganador;
	
	public DeCoches() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeCoches(String nombre, Calendar fecha, String lugar, String record, String ganador) {
		super(nombre, fecha, lugar);
		this.record = record;
		this.ganador = ganador;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}

	public String getGanador() {
		return ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
	}

	@Override
	public String toString() {
		return "DeCoches [record=" + record + ", ganador=" + ganador + ", nombre=" + nombre + ", fecha=" + fecha.get(Calendar.DAY_OF_MONTH) + "/" + fecha.get(Calendar.MONTH) + "/" + fecha.get(Calendar.YEAR) +  ", lugar=" + lugar + "]";
	}
	
	
	

}
