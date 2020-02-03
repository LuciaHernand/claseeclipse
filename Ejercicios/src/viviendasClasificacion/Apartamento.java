package viviendasClasificacion;

public class Apartamento extends Vivienda {

	private boolean estacional;
	
	public Apartamento(String direccion, float precio, float m2, boolean estacional) {
		super(direccion, precio, m2);
		this.estacional=estacional;
	}

	@Override
	public String toString() {
		return "Apartamento [direccion=" + direccion + ", precio=" + precio + ", m2=" + m2 + "estacional=" + estacional + "]\n";
	}
	
	

}
	
