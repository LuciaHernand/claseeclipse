package arrayList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AsList {

	public static void main(String[] args) {
		//Creacion de un arrayLista partir de un array ya creado
		ArrayList<String> diasSemana=new ArrayList<String>(Arrays.asList("Lunes","Martes","Miercoles","Jueves","Viernes"));
		diasSemana.add("Sabado");
		diasSemana.add("Domingo");

			System.out.println(diasSemana);

			for(String i:diasSemana) {
	System.out.println(i);
}
				System.out.println();
				Collections.sort(diasSemana);

System.out.println("\n\tOrdenado alfabeticamente");
for(String j: diasSemana) {System.out.println(j);}



	}

}
