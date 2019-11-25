package herenciaempleado;

public class becario extends persona {
	String tiempMaxBeca;

	public becario(String nombre, String apellido1, String apellido2,String tiempMaxBeca) {
		super(nombre, apellido1, apellido2);
		this.tiempMaxBeca=tiempMaxBeca;
	}

	public String getTiempMaxBeca() {
		return tiempMaxBeca;
	}

	public void setTiempMaxBeca(String tiempMaxBeca) {
		this.tiempMaxBeca = tiempMaxBeca;
	}

	@Override
	public String toString() {
		return "becario [tiempMaxBeca=" + tiempMaxBeca + "]";
	}
	
	

}
