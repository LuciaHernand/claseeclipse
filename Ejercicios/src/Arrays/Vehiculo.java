package interfaces;

public class Vehiculo implements Comparable{
	
	String marca;
	int cilindrada;
	
	public Vehiculo() {}
	
	public Vehiculo(String marca,int cilindrada) {
		this.marca=marca;
		this.cilindrada=cilindrada;
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
		return "Vehiculo [marca=" + marca + ", cilindrada=" + cilindrada + "]";
	}
	@Override
	public int compareTo(Object vehi) {
		Vehiculo v1= (Vehiculo)vehi;
		int resultado=0;
		
		if(this.cilindrada<v1.cilindrada) {
			resultado--;
		}else {
			resultado++;
		}
		
		return resultado;
	}
	
	
	

}
