package Repaso;

import java.util.Scanner;

public class Menu {
	public static int opcion1(int inicial) {
		 
		 int mas100;
		 
		 mas100=inicial+100;
		 
		 return mas100;
		
	}
	public static int opcion2(int inicial) {
		 
		 int por2;
		 
		 por2=inicial*2;
		 
		 return por2;
		
	}
	public static int opcion3(int inicial) {
		 
		 int entre2;
		 
		 entre2=inicial/2;
		 
		 return entre2;
		
	}
	
	public static void main(String[] args) {
		
		int inicial=10;
	 int opcion;
	 
	 Scanner scan=new Scanner(System.in);
	 do {
		 System.out.println("Variable 10");
	 System.out.println("Escoge una opción:");
	 System.out.println("\t1:Incremento de variable en 100.");
	 System.out.println("\t2:Duplica la variable.");
	 System.out.println("\t3:Se divide por 2.");
	 System.out.println("\t0:Se abandona el programa.");
	
	  opcion=scan.nextInt();
	  
	  switch (opcion) {
	  
	  case 1:System.out.println(opcion1(inicial));break;
	  case 2:System.out.println(opcion2(inicial));break;
	  case 3:System.out.println(opcion3(inicial));break;
	  case 0:System.exit(0);break;
	}
	if(opcion>4)System.out.println("Introduce un caracter válido.");
	 }while(opcion!=0);
	
	
	
	
	
	
	scan.close();
	}

}
