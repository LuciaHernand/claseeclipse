package Pintados;

public class Rombo {

	public static void main(String[] args) {
		
		
		int num4=0;
		int num2=4;
		for(int i=0;i<=5;i++){
      	  int num = 0;
             while(num<=num2){
                 System.out.print(" ");
                 num++;
             }
        num2=num2-1;
        int num3=0;
        
        while(num3<=num4) {
        	System.out.print("* ");
        	num3++;
        }
        num4++;
      	System.out.println("");}
		int num5=0;
		int num7=4;
		for(int j=0;j<=6;j++) {
			int num1=0;
			while(num1<=num5) {
				System.out.print(" ");
			num1++;}num5++;
			
			int num6=0;
			while (num7>=num6) {System.out.print("* ");
			num6++;}num7=num7-1;
			
			System.out.println("");}
		

	}

}
