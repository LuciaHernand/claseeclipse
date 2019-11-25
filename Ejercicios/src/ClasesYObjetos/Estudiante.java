package ClasesYObjetos;

public class Estudiante {
	
	public String apellido;
	public int curso;
	public String ciclo;
	
	

public Estudiante(String apellido,int curso, String ciclo) {
	super();
	this.apellido=apellido;
	this.curso=curso;
	this.ciclo=ciclo;
}

public void Escribir() {
	System.out.println(apellido+" "+curso+" "+ciclo);
}
public void Dato(String dato) {
	
}

}
