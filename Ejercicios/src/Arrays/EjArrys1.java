package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EjArrys1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int[] miPrimerArray=new int[3];
		
		miPrimerArray[0]=31;
		miPrimerArray[1]=28;
		miPrimerArray[2]=31;
		System.out.println(Arrays.toString(miPrimerArray));
		System.out.println(miPrimerArray[0]);
		String[] miSegundoArray=new String [2];
		
		miSegundoArray[0]="Sevilla";
		miSegundoArray[1]="Madrid";
		System.out.println(Arrays.toString(miSegundoArray));

		
		//otra forma de hacer arrays
		
		int []miTercerArray= {45,1,26,4,53};
		
		System.out.println(Arrays.toString(miTercerArray));
		
		String []miCuartoArray= {"lunes","martes","","jueves","viernes"};
		
		miCuartoArray[2]=scan.next();
				
				
		System.out.println(Arrays.deepToString(miCuartoArray));
	
		
		scan.close();
	}

	
}
