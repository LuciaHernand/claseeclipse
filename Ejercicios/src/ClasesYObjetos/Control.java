package ClasesYObjetos;

public class Control {

	public static void main(String[] args) {
		Persona p1=new Persona("Leticia",12);
		
		Persona p2=new Persona("Kevin",19);
		p1.Cumpleaños();
		p1.ConApellido("Moreno");
		p1.Escribir();
		
		
		p2.Escribir();

	}

}
