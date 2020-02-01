package arrayObje0512;

public class Autobus extends Vehiculo {
	
	int nPlazas;

	public Autobus(String matricula, String modelo, String potencia, int nPlazas,int carga) {
		super(matricula, modelo, potencia,carga);
		this.nPlazas = nPlazas;
	}







	public Autobus() {
		super();
	}







	public int getnPlazas() {
		return nPlazas;
	}

	public void setnPlazas(int nPlazas) {
		this.nPlazas = nPlazas;
	}

	@Override
	public String toString() {
		return "Autobus [nPlazas=" + nPlazas + ", matricula=" + matricula + ", modelo=" + modelo + ", potencia="
				+ potencia + ", carga=" + carga + "]";
	}

	
	

	
	

}
