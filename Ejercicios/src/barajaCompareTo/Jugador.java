package barajaCompareTo;

import java.util.List;

public class Jugador {
	public String nombre;
	private List<Carta> cartas;
	
	
	
	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jugador(String nombre, List<Carta> cartas) {
		super();
		this.nombre = nombre;
		this.cartas = cartas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Carta> getCartas() {
		return cartas;
	}
	public void setCartas(List<Carta> cartas) {
		this.cartas = cartas;
	}
	
	public void anadirCarta(Carta c) {
		this.cartas.add(c);
	}
	

}
