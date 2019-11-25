package ClasesYObjetos;
public class Persona {
	
	public String nombre;
	public int edad;

public Persona(String nombre, int edad) {
	super();
	this.nombre=nombre;
	this.edad=edad;}
public void ConApellido(String apellido) {
	nombre=nombre+" "+apellido;
}

public void Cumpleaños() {
	edad++;
}
	
	public void Escribir() {
		
		System.out.println(nombre +"  "+ edad);
	}

}