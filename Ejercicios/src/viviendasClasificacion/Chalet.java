package viviendasClasificacion;

public class Chalet  extends Vivienda {

	int plantas;

	public Chalet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chalet(String direccion, float precio, float m2) {
		super(direccion, precio, m2);
		// TODO Auto-generated constructor stub
	}

	public Chalet(int plantas) {
		super();
		this.plantas = plantas;
	}

	public int getPlantas() {
		return plantas;
	}

	public void setPlantas(int plantas) {
		this.plantas = plantas;
	}
	
	
	
}
