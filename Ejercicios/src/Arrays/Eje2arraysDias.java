package Arrays;

import java.util.Scanner;

public class Eje2arraysDias {

	public static void main(String[] args) {
		String dimeElDia;
		
		Scanner scan=new Scanner(System.in);
		
		String []diasSemana={"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
		for(int j=0;j<8;j++) {
		
		System.out.println("¿Qué día dela semana es?");
		
		dimeElDia=scan.next().toLowerCase();
		
		for(int i=0;i<7;i++) {
			if(diasSemana[i].equals(dimeElDia)) {
				if(i<6) {System.out.println("Mañana será: "+diasSemana[i+1]);}
				else if(i==6) {i=0; System.out.println("Mañana será: "+diasSemana[i]);break;}
			}
		}}
		
		scan.close();
	

}}
