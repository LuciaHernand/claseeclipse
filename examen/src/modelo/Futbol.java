package modelo;

public class Futbol extends Partido {
	String equipo1;
	String equipo2;
	String resultado;
	public Futbol(String equipo1, String equipo2, String resultado) {
		super();
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.resultado = resultado;
	}
	public Futbol() {
		super();
		
	}
	public String getEquipo1() {
		return equipo1;
	}
	public void setEquipo1(String equipo1) {
		this.equipo1 = equipo1;
	}
	public String getEquipo2() {
		return equipo2;
	}
	public void setEquipo2(String equipo2) {
		this.equipo2 = equipo2;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	@Override
	public String toString() {
		return "Futbol [equipo1=" + equipo1 + ", equipo2=" + equipo2 + ", resultado=" + resultado + "]";
	}
	

}
