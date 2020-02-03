package viviendasClasificacion;

public  class Vivienda implements Comparable<Vivienda>{
	protected String direccion;
	protected float precio;
	protected float m2;
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
	public int compareTo(Vivienda v) {
		int valorRetorno=0;
		if (((v instanceof Apartamento) &&!(this instanceof Apartamento)) ||((this instanceof Piso )&&(v instanceof Chalet))){
			if(this.precio<v.precio) {valorRetorno=1;}
		} else if( ((this instanceof Apartamento) && !(v instanceof Apartamento ))||((this instanceof Chalet )&&(v instanceof Piso))){
			if(this.precio>v.precio) {valorRetorno=-1;}
		}
		return valorRetorno;
	}
	@Override
	public String toString() {
		return "Vivienda [direccion=" + direccion + ", precio=" + precio + ", m2=" + m2 + "]\n";
	}


	

}
