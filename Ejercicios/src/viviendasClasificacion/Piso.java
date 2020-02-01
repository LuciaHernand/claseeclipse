package viviendasClasificacion;

public class Piso extends Vivienda  {
	int planta;
	char letra;
	
	public Piso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Piso(String direccion, float precio, float m2) {
		super(direccion, precio, m2);
		// TODO Auto-generated constructor stub
	}
	public Piso(int planta, char letra) {
		super();
		this.planta = planta;
		this.letra = letra;
	}
	public int getPlanta() {
		return planta;
	}
	public void setPlanta(int planta) {
		this.planta = planta;
	}
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
	

}
