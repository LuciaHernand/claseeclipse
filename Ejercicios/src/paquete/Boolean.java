package paquete;

import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {

		boolean comparar=false;
		int x,t,h;
		String estacion;
		
		
		Scanner scan=new Scanner(System.in);
		//comprador "y"
		
		System.out.println("Introduce un número mayor que 15 y menor que 34");
		
		x=scan.nextInt();
		
	    comparar= x<34 &&  x>15;
	    
	    System.out.println(comparar);
	    
	
	    
	    //comparador && <= 
	    
	    System.out.println("Introduce un numero mayor o igual a -1 y menor que 100");
	    
	    x=scan.nextInt();
	    
	    comparar=x<100 &&  x>=-1;
	    
		System.out.println(comparar);
		
		//||
		
		System.out.println("Introduce un numero menor que 34 y mayor que 15 o menor que 70 y mayor que 50");
		
		x=scan.nextInt();
		
		comparar= (x<34 && x>15)||(x<70 && x>50);
		
		System.out.println(comparar);
		
		// numero par y menor que 1000
		
		System.out.println("Introduce un numero par y menor que 1000");
		
		x=scan.nextInt();
		
	    comparar= (x%2==0  &&  x<1000);
	    
	    System.out.println(comparar);
		
	    //mayor que 5 o menor igual que 27
		
		System.out.println("Introduce un número mayor que 5 o menor o igual a 27");
		
		x=scan.nextInt();
		
		comparar= x>5 || x<=27;
		
		System.out.println(comparar);
		
		//mayor que 5 y menor o igual que 27
		
		System.out.println("Introduce un número mayor que 5 y menor o igual a 27");
		
		x=scan.nextInt();
		
		comparar= x>5 || x<=27;
		
		System.out.println(comparar);
		
		//=a 25 o menor o igual a 27 o menor que 7 y mayor que 3
		
		System.out.println("Introduce un número [25] o (-∞,27] o (3,7)");
		
		x=scan.nextInt();
		
		comparar=(( x==25 || x<=27) || (x>3 && x<7));
		
		System.out.println(comparar);
		
		
	    //otoño
	    System.out.println("¿En que estacion estamos?");
		
	    estacion=scan.next();
	    
	    System.out.println("Cuantos ºC hay");
		
	    t=scan.nextInt();
		
	    System.out.println("Indica cuanta humedad hay");
	    
	    h=scan.nextInt();
	    
	    comparar= (t<15 && h>25);
	    
	    System.out.println("Es " + comparar + " que es " + estacion );
	    
	  
	     // edad
	    	
	    boolean  esDeCiclo=false;
	    
	    System.out.println("¿Es de ciclo?");
	    
	    esDeCiclo=scan.nextBoolean();
	    
	    System.out.println("¿Cuántos años tiene?");
	    
	    x=scan.nextInt();
	    
	    comparar=x<16 && (!esDeCiclo);
	    
	    
	    System.out.println("tiene menos de 16 años y esDeCiclo es false: "+comparar);
	    
	    
	    //cond ternario
	    
	    System.out.println("Introduce un numero entre 15 y 34");
		
	    x=scan.nextInt();
	    
		String demo=(x>15 && x<34)?"cierto":"falso";
		
		System.out.println(demo);
		
		System.out.println((x>15 && x<34)?"cierto":"falso");
		
		
		
		
		
		scan.close();
		
		
		
	
	
		
		
		
		
	}
}
