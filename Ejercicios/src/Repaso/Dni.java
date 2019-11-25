package Repaso;

import java.util.Scanner;

public class Dni {
	
	

	public static void main(String[] args) {
		int numeroDni;
		int letra;
		
		Scanner scan=new  Scanner(System.in);	
		
		System.out.println("Introduce tu numero de dni");
 
		numeroDni=scan.nextInt();
		
		letra=numeroDni%23;
		
		switch (letra) {
		case 0:System.out.println("Te corresponde la letra: T");break;
		case 1:System.out.println("Te corresponde la letra: R");break;
		case 2:System.out.println("Te corresponde la letra: W");break;
		case 3:System.out.println("Te corresponde la letra: A");break;
		case 4:System.out.println("Te corresponde la letra: G");break;
		case 5:System.out.println("Te corresponde la letra: M");break;
		case 6:System.out.println("Te corresponde la letra: Y");break;
		case 7:System.out.println("Te corresponde la letra: F");break;
		case 8:System.out.println("Te corresponde la letra: P");break;
		case 9:System.out.println("Te corresponde la letra: D");break;
		case 10:System.out.println("Te corresponde la letra: X");break;
		case 11:System.out.println("Te corresponde la letra: B");break;
		case 12:System.out.println("Te corresponde la letra: N");break;
		case 13:System.out.println("Te corresponde la letra: J");break;
		case 14:System.out.println("Te corresponde la letra: Z");break;
		case 15:System.out.println("Te corresponde la letra: S");break;
		case 16:System.out.println("Te corresponde la letra: Q");break;
		case 17:System.out.println("Te corresponde la letra: V");break;
		case 18:System.out.println("Te corresponde la letra: H");break;
		case 19:System.out.println("Te corresponde la letra: L");break;
		case 20:System.out.println("Te corresponde la letra: C");break;
		case 21:System.out.println("Te corresponde la letra: K");break;
		case 22:System.out.println("Te corresponde la letra: E");break;
		
		}
		scan.close();
	}

}
