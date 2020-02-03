package diasSemanaCorreccion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiasSemana implements Comparable<DiasSemana>{
	private String dias;

public DiasSemana(String dias) {
	super();
	this.dias = dias;
}

public String getDias() {
	return dias;
}

public void setDias(String dias) {
	this.dias = dias;
}

@Override
public String toString() {
	return "DiasSemana [dias=" + dias + "]";
}

@Override
public int compareTo(DiasSemana d) {
	
		List<String> ordenDias = new ArrayList<String>(
				Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"));
		int orden = 0;
		if (ordenDias.indexOf(this.getDias()) < ordenDias.indexOf(d.getDias())) {
			orden = -1;
		} else if (ordenDias.indexOf(this.getDias()) > ordenDias.indexOf(d.getDias())) {
			orden = 1;
		}
		
		return orden;


	
}






}
