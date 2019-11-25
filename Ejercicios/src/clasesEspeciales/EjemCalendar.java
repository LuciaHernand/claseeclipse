package clasesEspeciales;

import java.util.Calendar;
import java.util.Scanner;

public class EjemCalendar {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	 
		Calendar dia=Calendar.getInstance();
		
	
		
		
		System.out.println(dia.getTime());
		System.out.println("Introduce el dia");
		dia.set(dia.DATE,scan.nextInt());
		System.out.println("Introduce el mes");
		dia.set(dia.MONTH,scan.nextInt());
		System.out.println("Introduce el año");
		dia.set(dia.YEAR, scan.nextInt());
		System.out.println(dia.getTime());
		
		for(int j=0;j<=2;j++) {
		dia.add(dia.MONTH,3);
			System.out.println(dia.getTime());
			
		}
			
	}

}
