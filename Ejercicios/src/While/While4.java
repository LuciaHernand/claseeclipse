package While;
import java.util.Scanner;
public class While4 {
	

	

		public static void main(String[] args) {
			String palabra;
			int contador=0;
			
			Scanner scan= new Scanner(System.in);
			System.out.println("Escribe una palabra");
			palabra= scan.next();
			contador= palabra.length()-1; 
//con esto sabemos la longitud de la palabra y como despues de una palabra hay siempre un \n se resta 1
			while (contador>=0) {
				System.out.print(palabra.charAt(contador));
				contador--;
				
				
			}
			scan.close();
		}

}
