package herenciaempleado;

public class persona {
	String nombre;
	String apellido1;
	String apellido2;
	public persona(String nombre, String apellido1, String apellido2) {
		super();
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.nombre=nombre;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + "]";
	}
	
	

}
