package Arrays;
import clasesEspeciales.Random;
import java.util.Arrays;



public class tresEnRaya {

	public static void main(String[] args) {
		Random ran=new Random();
		
		char ficha = 0;
		int contadorX=0;
		int contador0=0;
		char [][] array=new char[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				for(int x=0;x<9;x++) {
					int y=(int)(Math.random()*3);
		
					if(y==0) {contadorX++; ficha='x';}
					else if (y==1){contador0++; ficha='o';}
					else if(y==2) {ficha=' ';}
				
				}
				
				array[i][j]=ficha;
				
				
				
				
			}
		
			
			
			
		}	
		System.out.println(Arrays.toString(array[0]));
			System.out.println(Arrays.toString(array[1]));
			System.out.println(Arrays.toString(array[2]));

	}

}
