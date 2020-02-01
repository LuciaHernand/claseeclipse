package interface1;

public class Persona {
	private int edad;
	private String nombre;
	private String grupo;
	
	
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Persona(int edad, String nombre, String grupo) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.grupo = grupo;
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	@Override
	public String toString() {
		return "Persona [edad=" + edad + ", nombre=" + nombre + ", grupo=" + grupo + "]";
	}
	

}
