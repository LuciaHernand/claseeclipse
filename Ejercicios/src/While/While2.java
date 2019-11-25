package While;

public class While2 {
	
	public static void multiplicacion(int numero1, int numero2) {
		while (numero1<=10) {
			System.out.println(numero2 + "*" + numero1 + "= " + (numero1*numero2));
			numero1++;
			}
	}
	
	public static void main(String[] args) {
		int numero1=1;
		int numero2=1;
		
		while (numero2<=10) {
			multiplicacion(numero1, numero2);
			System.out.println("\t\t");
			numero2++;
			
		}
	}
}


