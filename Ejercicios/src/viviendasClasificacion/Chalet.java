package viviendasClasificacion;

public class Chalet  extends Vivienda {
	private int plantas;
	public Chalet(String direccion, float precio, float m2, int plantas) {
		super(direccion, precio, m2);
		this.plantas=plantas;
	}
	@Override
	public String toString() {
		return "Chalet [direccion=" + direccion + ", precio=" + precio + ", m2=" + m2 + "plantas=" + plantas + "]\n";
	}
	
	
	
}
