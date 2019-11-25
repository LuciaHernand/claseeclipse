package tercero;

import java.util.Random;
import java.util.Scanner;

public class cartas  {
public static void barajaFrancesa(){
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
	
	
}
public static void barajaEspañola(){
	for(int oros=1;oros<=12;oros++) {
		
		System.out.println(oros+"oros");
		
		
	}
	for(int copas=1;copas<=12;copas++) {
		System.out.println(copas+"copas");
	}
	for(int espadas=1;espadas<=12;espadas++) {
		System.out.println(espadas+"espadas");
	}
	for(int bastos=1;bastos<=12;bastos++) {
		System.out.println(bastos+"bastos");
	}
	
	
}
	public static void main(String[] args) {
	int adivina;
	int paloAdiv = 0;
	int selecciona;
	Scanner scan=new Scanner(System.in);
	System.out.println("Selecciona baraja:\n1:Francesa.\n2:Española.");
	selecciona=scan.nextInt();
	
	switch(selecciona) {
	case 1: barajaFrancesa();break;
	case 2:barajaEspañola();break;
	}

	Random rand=new Random();
	
	int carta =(int) (Math.random()*12);
	carta=rand.nextInt(12);
	int palo=(int)(Math.random()*4);
	
	palo=rand.nextInt(4);
	
	switch(selecciona) {
	case 1:
		for(int i=0;i<=3;i++) {System.out.println("Adivina el numero");
		adivina=scan.nextInt();
	
		System.out.println("Adivina el palo");
	
		System.out.println("1:picas\t2:corazones\t3:treboles\t4:cocos");
		paloAdiv=scan.nextInt();
		if(carta==adivina||palo==paloAdiv) {System.out.println("Has acertado");}
		if(carta!=adivina) {System.out.println("Intentalo de nuevo");}
		
	}
		
		break;
	case 2: 
		for(int i=0;i<=3;i++) {System.out.println("Adivina el numero");
		adivina=scan.nextInt();
	
		System.out.println("Adivina el palo");
	
		System.out.println("1:oros\t2:copas\t3:espadas\t4:bastos");
		paloAdiv=scan.nextInt();
		if(carta==adivina||palo==paloAdiv) {System.out.println("Has acertado");}
		if(carta!=adivina) {System.out.println("Intentalo de nuevo");}
		
	}
		break;
	}
	System.out.println(carta+" "+palo);

	
	
	
	scan.close();

}
	
}


