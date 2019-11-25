package herencia;

public class EMT  extends Autobus{
int nLinea;



public EMT(String matricula, String modelo, String potencia, int nPlazas, int carga) {
	super(matricula, modelo, potencia, nPlazas, carga);
	// TODO Auto-generated constructor stub
}

public EMT() {
	super();
}

public int getnLinea() {
	return nLinea;
}

public void setnLinea(int nLinea) {
	this.nLinea = nLinea;
}

@Override
public String toString() {
	return "EMT [nLinea=" + nLinea + ", nPlazas=" + nPlazas + ", matricula=" + matricula + ", modelo=" + modelo
			+ ", potencia=" + potencia + ", carga=" + carga + "]";
}



}
