package herenciaempleado;

public class empleado extends persona{
	String antiguedad;

	public empleado(String nombre, String apellido1, String apellido2, String antiguedad) {
		super(nombre, apellido1, apellido2);
		this.antiguedad = antiguedad;
	}

	public String getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(String antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "empleado [antiguedad=" + antiguedad + "]";
	}
	

}
