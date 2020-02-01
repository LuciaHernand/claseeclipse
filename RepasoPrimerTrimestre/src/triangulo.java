import java.util.Scanner;

public class triangulo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
        int num2 = 0;
        int numeroPiramide=1;
        int numFilas;
        int hi;
      
        System.out.println("Introduce el numero de filas");
        numFilas=scan.nextInt();
        
        
        for(int i=0;i<=numFilas;i++){
           int num = 0;
           while(num<=num2){
               System.out.print(numeroPiramide+" ");
               numeroPiramide++;
               num++;
           }
           num2++;
           System.out.println("");}
        
        System.out.println("\n\n\n");
        
	
        System.out.println("Introduce el numero en que que pararemos");
        hi=scan.nextInt();
        

       
	}}


