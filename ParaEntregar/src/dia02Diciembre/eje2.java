package dia02Diciembre;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class eje2 {
public static void variables() {
	Random ran=new Random();
	int contadorBlanco=0;
	int contadorNegro=0;
	char [] var=new char[6];
	
	
	for(int i=0;i<6;i++) {
	
	int numero1=ran.nextInt(2);
	
	
	for(int j=0;j<6;j++) {
		
		
	
	if(numero1==0||contadorNegro==3){
		var[i]='B';contadorBlanco++;}
	
	if( numero1==1||contadorBlanco==3) {
		var[i]='N';
		contadorNegro++;
	}
             }
	}
	 
	
	System.out.println(Arrays.toString(var));
	Scanner scan=new Scanner(System.in);
	int	i=0;
	int	contador=0;
	for(int k=0;k<6;k++) {
	
	
		char []adiv=new char[6];
		System.out.println("Introduce B o N");
		adiv[k]=scan.next().toUpperCase().charAt(0);
		
		if(adiv[k]==var[i]) {contador++;
		System.out.println("Has obtenido 1 punto: "+contador);
		if(contador==6) {System.out.println("Has ganado");}
		}
		else  System.out.println("Has fallado");
		i++;

		
	}
}

	
	
	

	public static void main(String[] args) {
	
variables();

	}

}
