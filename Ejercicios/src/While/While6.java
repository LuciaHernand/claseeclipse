package While;

import java.util.Scanner;

public class While6 {
    public static int darLaVuelta (int num){
    	int alReves=0;
    	while ((num)!=0) {
    		alReves=alReves+num%10;
    		num=num/10;
    	}
    	return alReves;
    }
	public static void main(String[] args) {
		int num,alReves;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Introduce un número");
	num=scan.nextInt();
	 alReves=darLaVuelta(num);
	 
	 
	 System.out.println("El numero al reves es: "+alReves);
	

	
		
		
		
		
		scan.close();
	}

}
