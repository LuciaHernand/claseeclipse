package domino;

import java.util.Random;

public class ejercicio2 {
	public static void main(String[] args) {
		
		int i;
		int j;
		
		for ( j=0;j<=6;j++) {
			
		for ( i=0;i<=6;i++){
			
			System.out.println(j+"|"+i);
			
		}
		System.out.println();
			
		}
		
		Random ran=new Random();
		
		int numero =(int) (Math.random()*6);
		numero=ran.nextInt(6);
		int numero2= (int) (Math.random()*6);
		numero2=ran.nextInt(6);
		System.out.println(numero+"|"+numero2);
		
		int numero3 =(int) (Math.random()*6);
		numero3=ran.nextInt(6);
		int numero4= (int) (Math.random()*6);
		numero4=ran.nextInt(6);
		System.out.println(numero3+"|"+numero4);
		
		int numero5 =(int) (Math.random()*6);
		numero5=ran.nextInt(6);
		int numero6= (int) (Math.random()*6);
		numero2=ran.nextInt(6);
		System.out.println(numero5+"|"+numero6);
		
		
		
	}

}
