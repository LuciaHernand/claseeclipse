package herencia;

public class AVANZA extends Autobus {

	boolean banio;
	
	

	public AVANZA(String matricula, String modelo, String potencia, int nPlazas, int carga) {
		super(matricula, modelo, potencia, nPlazas, carga);
		// TODO Auto-generated constructor stub
	}



	public AVANZA() {
		super();
	}



	public boolean isBanio() {
		return banio;
	}



	public void setBanio(boolean banio) {
		this.banio = banio;
	}



	@Override
	public String toString() {
		return "AVANZA [banio=" + banio + ", nPlazas=" + nPlazas + ", matricula=" + matricula + ", modelo=" + modelo
				+ ", potencia=" + potencia + ", carga=" + carga + "]";
	}
	
	
	
	

}
