package modelo;



public class Tenis extends Partido{

	String Jugador1;
	String Jugador2;
	String ganador;
	String resultado;
	public Tenis() {
		super();
		
	}
	public Tenis(String jugador1, String jugador2, String ganador, String resultado) {
		super();
		Jugador1 = jugador1;
		Jugador2 = jugador2;
		this.ganador = ganador;
		this.resultado = resultado;
	}
	public String getJugador1() {
		return Jugador1;
	}
	public void setJugador1(String jugador1) {
		Jugador1 = jugador1;
	}
	public String getJugador2() {
		return Jugador2;
	}
	public void setJugador2(String jugador2) {
		Jugador2 = jugador2;
	}
	public String getGanador() {
		return ganador;
	}
	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	@Override
	public String toString() {
		return "Tenis [Jugador1=" + Jugador1 + ", Jugador2=" + Jugador2 + ", ganador=" + ganador + ", resultado="
				+ resultado + "]\n";
	}
	

}
