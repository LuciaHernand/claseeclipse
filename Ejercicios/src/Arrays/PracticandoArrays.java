package Arrays;

import java.util.Arrays;
import java.util.Random;

public class PracticandoArrays {

	public static void main(String[] args) {
		Random ran=new Random();
		int numero;
		
		int[]numeros=new int[8];
		
	 for(int i=0;i<8;i++) {
		 numeros[i]=ran.nextInt(8);
	 }
		
		System.out.println(Arrays.toString(numeros));
		
		numero=numeros[2];
		numeros[4]=numero;
		System.out.println(Arrays.toString(numeros));
		System.out.println(numeros[4]);
		
		if(numeros[4]<numeros[2]) System.out.println("El número de la posición 2 es mayor que el de la posición 4");
		else if (numeros[4]>numeros[2])System.out.println("El numero de la posicion 4 es mayor que el de la posicion 2");
		
		String [] palabras=new String[4];
		//a
		
		palabras[0]="Hola";
		palabras[1]="hola";
		palabras[2]="HoLa";
		palabras[3]="HOla";
		
		
		palabras[1]=
		
		palabras[3]=palabras[3].toLowerCase();
		
		System.out.println(Arrays.toString(palabras));
		if( palabras[1].toLowerCase()==palabras[3].toLowerCase()) System.out.println("Las palbras de la posicion 2 y 4 son iguales");
		
		
		
		
		
	}

}
