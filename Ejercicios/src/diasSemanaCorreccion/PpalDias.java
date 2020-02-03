package diasSemanaCorreccion;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class PpalDias {

	public static void main(String[] args) {
		DiasSemana d1=new DiasSemana("Jueves");
		DiasSemana d2=new DiasSemana("Martes");
		
		List<DiasSemana> listaDias=new ArrayList<DiasSemana>(Arrays.asList(d2,d1,new DiasSemana("Miércoles"),new DiasSemana("Lunes"), new DiasSemana("Domingo")));
		System.out.println(listaDias);
		Collections.sort(listaDias);
		System.out.println(listaDias);
	}
}
