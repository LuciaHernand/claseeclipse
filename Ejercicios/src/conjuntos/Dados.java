package conjuntos;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Dados {

	public static void main(String[] args) {
		//Queremos que salgan 3 valores que seran de 1 dado y que no se repitan.
		Random ran=new Random();
		
		Set<Integer> valoresDado=new HashSet<Integer>();
		//Hecho por mi, no siempre salen 3 valores, tiene fallos
		for(int i = 0;i<3;i++) {
		int y=(int)(Math.random()*6+1);
		
		valoresDado.add(y);
		
		}
		System.out.println(valoresDado);
	
	//Correccion de la profe
		Set<Integer> valoresDado1=new HashSet<Integer>();
	while(valoresDado1.size()<3) {
		valoresDado1.add(ran.nextInt(6)+1);
	}
	System.out.println(valoresDado1);
	
}
}
