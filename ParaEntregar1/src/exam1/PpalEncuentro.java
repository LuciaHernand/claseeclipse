package exam1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;



public class PpalEncuentro {
	public static void resultados(Encuentro e1, Encuentro e2, Encuentro e3, Encuentro e4,Encuentro e5 ){
		Random ran=new Random();
		int x;
		int y;
		String resultado1 = null;
		String resultado2 = null;
		x=ran.nextInt(4)+1;
		 y=ran.nextInt(4)+1;
			
			
		
		switch (x){
		case 1: resultado1="1";break;
		case 2:  resultado1="2";break;
		case 3:  resultado1="3";break;
		case 4: resultado1="X";break;
		
		
		}
		switch (y){
		case 1:  resultado2="1";break;
		case 2:  resultado2="2";break;
		case 3:  resultado2="3";break;
		case 4: resultado2="X";break;
		
		}
		
		
		
		
		//Encuentro 1
		e1.setResultadoFinal(resultado1+"|"+resultado2);
		System.out.println(e1.getResultadoFinal());
		//Encuentro 2
		x=ran.nextInt(4)+1;
		 y=ran.nextInt(4)+1;

			switch (x){
			case 1: resultado1="1";break;
			case 2:  resultado1="2";break;
			case 3:  resultado1="3";break;
			case 4: resultado1="X";break;
			
			
			}
			switch (y){
			case 1:  resultado2="1";break;
			case 2:  resultado2="2";break;
			case 3:  resultado2="3";break;
			case 4: resultado2="X";break;
			
			
			}
			e2.setResultadoFinal(resultado1+"|"+resultado2);
			System.out.println(e2.getResultadoFinal());
			//Encuentro 3
			x=ran.nextInt(4)+1;
			 y=ran.nextInt(4)+1;

				switch (x){
				case 1: resultado1="1";break;
				case 2:  resultado1="2";break;
				case 3:  resultado1="3";break;
				case 4: resultado1="X";break;				
				
				}
				switch (y){
				case 1:  resultado2="1";break;
				case 2:  resultado2="2";break;
				case 3:  resultado2="3";break;
				case 4: resultado2="X";break;
				
				
				}
				e3.setResultadoFinal(resultado1+"|"+resultado2);
				System.out.println(e3.getResultadoFinal());
				//Encuentro 4
				x=ran.nextInt(4)+1;
				 y=ran.nextInt(4)+1;

					switch (x){
					case 1: resultado1="1";break;
					case 2:  resultado1="2";break;
					case 3:  resultado1="3";break;
					case 4: resultado1="X";break;				
					
					}
					switch (y){
					case 1:  resultado2="1";break;
					case 2:  resultado2="2";break;
					case 3:  resultado2="3";break;
					case 4: resultado2="X";break;
					
					
					}
					
					e4.setResultadoFinal(resultado1+"|"+resultado2);
					System.out.println(e4.getResultadoFinal());
					
					//Encuentro 5
					 x=ran.nextInt(4)+1;
					 y=ran.nextInt(4)+1;

					 switch (x){
						case 1: resultado1="1";break;
						case 2:  resultado1="2";break;
						case 3:  resultado1="3";break;
						case 4: resultado1="X";break;				
						
						}
						switch (y){
						case 1:  resultado2="1";break;
						case 2:  resultado2="2";break;
						case 3:  resultado2="3";break;
						case 4: resultado2="X";break;
						
						
						}
						e5.setResultadoFinal(resultado1+"|"+resultado2);
						System.out.println(e5.getResultadoFinal());
		 
		
	}

	public static void main(String[] args) {
		
		Encuentro e1=new Encuentro();
		Encuentro e2=new Encuentro();
		Encuentro e3=new Encuentro();
		Encuentro e4=new Encuentro();
		Encuentro e5=new Encuentro();
		
		
		//Equipo1
		e1.setEquipo1("Madrid");	e2.setEquipo1("Barça");	e3.setEquipo1("Sevilla");	e4.setEquipo1("Malaga");	e5.setEquipo1("Español");
	
		//Equipo2
		e5.setEquipo2("Madrid");	e4.setEquipo2("Barça");	e2.setEquipo2("Sevilla");	e1.setEquipo2("Malaga");	e3.setEquipo2("Español");
		
		resultados(e1,e2,e3,e4,e5);
		
		ArrayList<Encuentro> jornada=new ArrayList<Encuentro>();
		jornada.add(new Encuentro(e1.getEquipo1(),e1.getEquipo2(),"",e1.getResultadoFinal()));
		jornada.add(new Encuentro(e2.getEquipo1(),e2.getEquipo2(),"",e2.getResultadoFinal()));
		jornada.add(new Encuentro(e3.getEquipo1(),e3.getEquipo2(),"",e3.getResultadoFinal()));
		jornada.add(new Encuentro(e4.getEquipo1(),e4.getEquipo2(),"",e4.getResultadoFinal()));
		jornada.add(new Encuentro(e5.getEquipo1(),e5.getEquipo2(),"",e5.getResultadoFinal()));

		
		
		System.out.println(e1.toString());
		Collections.sort(jornada);
		System.out.println(jornada);
	}

}
