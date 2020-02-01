package viviendasClasificacion;

public class Apartamento extends Vivienda {

	boolean estacional=false;
	
	int dias;
	
	estacional==dias>90;
	

	public Apartamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apartamento(boolean estacional, int dias) {
		super();
		this.estacional = estacional;
		this.dias = dias;
	}

	public Apartamento(String direccion, float precio, float m2) {
		super(direccion, precio, m2);
		// TODO Auto-generated constructor stub
	}

	public boolean isEstacional() {
		return estacional;
	}

	public void setEstacional(boolean estacional) {
		this.estacional = estacional;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}
	
	
}
