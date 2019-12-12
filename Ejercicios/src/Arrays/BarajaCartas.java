package Arrays;

import java.util.Arrays;
import java.util.Random;


public class BarajaCartas {
	public static void cartasAlAzar (int []barajar) {
		Random ran=new Random();
	
		for(int i=0;i<2;i++) {
			
			
	int	numero=(int)(Math.random()*6);
	
	
	
			System.out.print(barajar[numero]+"\t");
			
			
			
		}
	
		
		}
		public static void totalBaraja (int[] baraja) {
			for(int cartas=0;cartas<6;cartas++) {
			System.out.println("Carta nº:"+baraja[cartas]);
		
			
			}
			
		}
		
		
	public static void barajar(int []baraja) {
		Random ran=new Random();
		int numero1;
		
		for(int j=0;j<6;j++) {
			numero1=ran.nextInt(6);
			
			
			baraja[j]=numero1;
			
		}
		
		
	}

	public static void main(String[] args) {
		int []baraja= {1,2,3,4,5,6};
		
		totalBaraja(baraja);
		System.out.println("Sacaré dos cartas al azar");
		cartasAlAzar(baraja);
		barajar(baraja);
		System.out.println(Arrays.toString(baraja));
		
		
	}



}
