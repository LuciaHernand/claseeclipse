package tercero;

import java.util.Random;
import java.util.Scanner;

public class cartas  {
	public static void main(String[] args) {
	int adivina;
	
	Scanner scan=new Scanner(System.in);
	//baraja
	for(int picas=1;picas<=12;picas++) {
	
		System.out.println(picas+"picas");
		
		
	}
	for(int corazones=1;corazones<=12;corazones++) {
		System.out.println(corazones+"corazones");
	}
	for(int trebol=1;trebol<=12;trebol++) {
		System.out.println(trebol+"trebol");
	}
	for(int cocos=1;cocos<=12;cocos++) {
		System.out.println(cocos+"cocos");
	}
	
	Random rand=new Random();
	
	int carta =(int) (Math.random()*12);
	carta=rand.nextInt(12);
	System.out.println("Adivina el numero de la carta");
	
	
	
	for(int i=0;i<=3;i++) {
		adivina=scan.nextInt();
	if(carta==adivina) {System.out.println("Has acertado");}
	if(carta!=adivina) {System.out.println("Intentalo de nuevo");}
	}
	scan.close();

}
	
}


