package Exception_1;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		
				Scanner scan=new Scanner(System.in);
				
				
			try {
				
				System.out.println("Escribe un numero");
			
			 int y=scan.nextInt();
			 
			}catch (Exception e){
				
				System.out.println("Valor no valido\nTipo de excepcion:"+e.toString()+".");
				
				
			}
			

	}

}
