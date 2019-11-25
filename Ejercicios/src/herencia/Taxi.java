package herencia;

public class Taxi extends Vehiculo{
	String nLicencia;
	int carga;
	
	public Taxi (String matricula,String modelo,String potencia,String nLicencia,int carga) {
		super(matricula,modelo,potencia,carga);
		this.nLicencia=nLicencia;
		
	}

	public String getnLicencia() {
		return nLicencia;
	}

	public void setnLicencia(String nLicencia) {
		this.nLicencia = nLicencia;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	@Override
	public String toString() {
		return "Taxi [nLicencia=" + nLicencia + ", carga=" + carga + ", matricula=" + matricula + ", modelo=" + modelo
				+ ", potencia=" + potencia + "]";
	}
	

}
