package interfaces.compareto;

public class Vehiculo1 implements Comparable{

	String marca;
	int cilindrada;
	
	
	public Vehiculo1() {
		super();
	}
	public Vehiculo1(String marca, int cilindrada) {
		super();
		this.marca = marca;
		this.cilindrada = cilindrada;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	
	@Override
	public String toString() {
		return getClass()+" [marca=" + marca + ", cilindrada=" + cilindrada +  "]";
	}
	@Override
	public int compareTo(Object vehi) {
		Vehiculo1 v1= (Vehiculo1)vehi;
		int resultado=0;
		if(v1 instanceof Taxi) {resultado=-1;}
		else {resultado=1;}
		
		
		
		return resultado;
	}
	
}
