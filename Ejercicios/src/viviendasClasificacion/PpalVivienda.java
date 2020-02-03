package viviendasClasificacion;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;



public class PpalVivienda {
	
			
			public static void totalizar(List<Vivienda>listaViviendas) {
				List<Integer> listaCont=new ArrayList<Integer>(Arrays.asList(0,0,0));
				List<String> listaTipos=new ArrayList<String>(Arrays.asList("Apartamento","Chalet","Piso"));
				Map<String ,Integer> conteo=new HashMap<String,Integer>();
				for (Vivienda v:listaViviendas) {
					String m=v.getClass().toString();
					m=m.substring(m.lastIndexOf(".")+1);
					if (conteo.containsKey(m)) {
						conteo.put(m,conteo.get(m)+1);
					}else conteo.put(m, 1);
					}
				
				System.out.println("Total Viviendas:\t"+ listaViviendas.size());
				for (String s: conteo.keySet()) {
					System.out.println("\tTotal "+s+":"+conteo.get(s));
				}
				
				
			}
	
	

		public static void main(String[] args) {
			List <Vivienda>listaViviendas=new ArrayList<Vivienda>();
			listaViviendas.add(new Apartamento("calleUno",100*(float)Math.random()*10,50,true) );
			listaViviendas.add(new Piso("CalleDos",2*(float)Math.random()*10,40,3,'A'));
			listaViviendas.add(new Chalet("CalleTres",3*(float)Math.random()*10,60,2));
			int numViviendas=0;
			System.out.println(listaViviendas);
			System.out.println();
			Collections.sort(listaViviendas);
			System.out.println(listaViviendas);
			totalizar(listaViviendas);
			
		
			
			
		}
		
		
		
	}


