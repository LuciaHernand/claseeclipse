package viviendasClasificacion;

public class Vivienda implements Comparable{
	String direccion;
	float precio;
	float m2;
	
	
	public Vivienda() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Vivienda(String direccion, float precio, float m2) {
		super();
		this.direccion = direccion;
		this.precio = precio;
		this.m2 = m2;
	}

	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public float getM2() {
		return m2;
	}
	public void setM2(float m2) {
		this.m2 = m2;
	}

	@Override
	public int compareTo(Object o) {
	int posicion=0;
		return posicion;
	}
	

}
