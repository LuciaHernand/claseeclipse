package viviendasClasificacion;

public class Piso extends Vivienda  {
	private int planta;
	 private char letra;
	 public Piso(String direccion, float precio, float m2, int planta, char letra) {
			super(direccion, precio, m2);
			this.planta=planta;
			this.letra=letra;
		}
	@Override
	public String toString() {
		return "Piso [direccion=" + direccion + "planta=" + planta + ", letra=" + letra+ ", precio=" + precio + ", m2=" + m2 + "]\n";
	}
	

}
