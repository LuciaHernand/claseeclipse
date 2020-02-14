package dia02Diciembre;

import java.util.Arrays;
import java.util.Random;



public class eje1 {
	public static void variables() {
		
		 Random ran=new Random();
			
			
			int []var=new int [40];
			
			for(int i=0;i<40;i++) {
				
				int aleatorio=(int)(Math.random()*(60-10+1)+10);
				
				var[i]=aleatorio;
				
				
				
			}
			
	
		
		System.out.println("["+var[0]+", "+var[1]+", "+var[2]+", "+var[3]+", "+var[4]+", "+var[5]+", "+var[6]+", "+var[7]+", "+var[8]+", "+var[9]+"]");
		System.out.println("["+var[10]+", "+var[11]+", "+var[12]+", "+var[13]+", "+var[14]+", "+var[15]+", "+var[16]+", "+var[17]+", "+var[18]+", "+var[19]+"]");
		System.out.println("["+var[20]+", "+var[21]+", "+var[22]+", "+var[23]+", "+var[24]+", "+var[25]+", "+var[26]+", "+var[27]+", "+var[28]+", "+var[29]+"]");
		System.out.println("["+var[30]+", "+var[31]+", "+var[32]+", "+var[33]+", "+var[34]+", "+var[35]+", "+var[36]+", "+var[37]+", "+var[38]+", "+var[39]+"]");

	}

	public static void main(String[] args) {
		
	variables();

		
	}

}
