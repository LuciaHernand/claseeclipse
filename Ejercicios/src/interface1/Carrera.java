package interface1;

public class Carrera implements Comparacion {

	
	
	public static String getTramo(int edad){
		String tramo = null;
		
		if (edad<18) tramo="infantil";
		else if (edad>18 && edad<21) tramo="junior";
		else if (edad>21) tramo="senior";
	return tramo;	
	}

	@Override
	public void comparo(Persona p1, Persona p2) {
		// TODO Auto-generated method stub
		
	}}
