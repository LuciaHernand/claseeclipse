package barajaCompareTo;

public class Carta {
	int numero;
	String carta;
	
	public Carta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Carta(int numero, String carta) {
		super();
		this.numero = numero;
		this.carta = carta;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCarta() {
		return carta;
	}
	public void setCarta(String carta) {
		this.carta = carta;
	}
	
	
	@Override
	public String toString() {
		return "Carta ["+"carta="+numero + carta + "]";
	}
	

}
