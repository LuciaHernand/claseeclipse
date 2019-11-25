package While;

public class elWhile {

	public static void main(String[] args) {
		int numero=7;
		int contador=1;
		
		
		while (contador<=20) {
			System.out.println(numero+ "*" + contador + "= " + (numero*contador));
			contador++;
			numero= numero*2;
		}

	}

}