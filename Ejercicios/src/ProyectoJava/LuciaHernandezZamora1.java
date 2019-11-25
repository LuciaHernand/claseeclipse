package ProyectoJava;

import java.util.Scanner;

public class LuciaHernandezZamora1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	
		
	    String numero;
	
		
		System.out.println("Introduce un número");
		
		numero=scan.next();
		
		
		 
		System.out.println(numero.substring(0,numero.length()-3)+"0"+"0"+"0");
		
		
		scan.close();
	}

}
