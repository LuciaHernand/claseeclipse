package clasesEspeciales;

import java.util.Scanner;

public class Random {
	
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		Random random=new Random();
		
		 int num2;
	int numero = (int) (Math.random()*10);		
		 for(int i=0;i<=3;i++) {
			 System.out.println("Adivina un numero entre 1 y 10");
			 num2=scan.nextInt();
			 
			 if(numero==num2) {System.out.println("Has ganado.");
			 }
			 else System.out.println("Has perdido");
			
			 
		 }System.out.println(numero);
		 
		
		
		
		
		  
		scan.close();
	
		
		
	}

	

	

	
	}


