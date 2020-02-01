package ejeAbstract;

import java.util.Scanner;

public class Rectangulo extends FigurasGeometricas{
Scanner scan=new Scanner(System.in);
	@Override
	void dibujar() {
		
		for(int i=0;i<getLado();i++) {
			System.out.print("*");
		}
		
	}

}
