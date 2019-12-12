package dia12de12;

import java.util.Arrays;
import java.util.Random;

public class Temperatuas {

	public static void main(String[] args) {
		//12 meses,, 4 provincias cambiar el numero por nombre
		Random ran=new Random();
		int sumatorio1=0;
		int sumatorio2=0;
		int sumatorio3=0;
		int sumatorio4=0;
		int mes1=0;
		int mes2=0;
		int mes3=0;
		int mes4=0;
		int mes5=0;
		int mes6=0;
		int mes7=0;
		int mes8=0;
		int mes9=0;
		int mes10=0;
		int mes11=0;
		int mes12=0;
		
		int [][] mesesarray=new int [4][12];
		for(int j=0;j<4;j++) {
		for(int i=0;i<12;i++) {
			
			int temperaturas= (int)(ran.nextDouble()*(20-40+1)+40);
			
			mesesarray[j][i]=temperaturas;
			if(j==0) {
				sumatorio1=sumatorio1+mesesarray[0][i];
			}
			if(j==1) {
				sumatorio2=sumatorio2+mesesarray[1][i];
			}
			if(j==2) {
				sumatorio3=sumatorio3+mesesarray[2][i];
			}
			if(j==3) {
				sumatorio4=sumatorio4+mesesarray[3][i];
			}
			if(i==0) {
				mes1=mes1+mesesarray[j][0];
			}
			if(i==1) {
				mes2=mes2+mesesarray[j][1];			}
			if(i==2) {
				mes3=mes3+mesesarray[j][2];			}
			if(i==3) {
				mes4=mes4+mesesarray[j][3];			}
			if(i==4) {
				mes5=mes5+mesesarray[j][4];			}
			if(i==5) {
				mes6=mes6+mesesarray[j][5];			}
			if(i==6) {
				mes7=mes7+mesesarray[j][6];			}
			if(i==7) {
				mes8=mes8+mesesarray[j][7];			}
			if(i==8) {
				mes9=mes9+mesesarray[j][8];			}
			if(i==9) {
				mes10=mes10+mesesarray[j][9];
			}
			if(i==10) {
				mes11=mes11+mesesarray[j][10];			}
			if(i==11) {
				mes12=mes12+mesesarray[j][11];			}
			
			
			
		}}
		System.out.println("Cuenca: "+Arrays.toString(mesesarray[0]));
		System.out.println("Valencia: "+Arrays.toString(mesesarray[1]));
		System.out.println("Madrid: "+Arrays.toString(mesesarray[2]));
		System.out.println("Barcelona: "+Arrays.toString(mesesarray[3]));
		
		System.out.println("\nCalculemos las medias por ciudades\n");
		
		System.out.println("Cuenca: \t"+sumatorio1/12+"\tgrados");
		System.out.println("Valencia:\t"+sumatorio2/12+"\tgrados");
		System.out.println("Madrid: \t"+sumatorio3/12+"\tgrados");
		System.out.println("Barcelona:\t"+sumatorio4/12+"\tgrados\n");
		
		System.out.println("Calculemos la media por meses\n");
		System.out.println("Enero:  \t"+mes1/4+"\tgrados");
		System.out.println("Febrero:  \t"+mes2/4+"\tgrados");
		System.out.println("Marzo:  \t"+mes3/4+"\tgrados");
		System.out.println("Abril:  \t"+mes4/4+"\tgrados");
		System.out.println("Mayo:   \t"+mes5/4+"\tgrados");
		System.out.println("Junio:  \t"+mes6/4+"\tgrados");
		System.out.println("Julio:  \t"+mes7/4+"\tgrados");
		System.out.println("Agosto: \t"+mes8/4+"\tgrados");
		System.out.println("Septiembre: \t"+mes9/4+"\tgrados");
		System.out.println("Octubre: \t"+mes10/4+"\tgrados");
		System.out.println("Noviembre: \t"+mes11/4+"\tgrados");
		System.out.println("Diciembre: \t"+mes12/4+"\tgrados");
		
		
		
		
	}

}
