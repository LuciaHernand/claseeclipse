package ClasesYObjetos;

public class Autor1 {
	
	public String Nombre;
	public String apellido1;
	public String apellido2;

	
	
	
	public Autor1() {
		
	}


	public Autor1(String Nombre, String apellido1, String apellido2) {
		
		super();
		
		this.Nombre=Nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		
		
		
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
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
		return "Autor1 [Nombre=" + Nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + "]";
	}


	






}