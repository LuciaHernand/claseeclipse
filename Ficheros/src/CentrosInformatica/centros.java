package CentrosInformatica;

public class centros {
	//Provincia;Localidad;Denominación genérica;Denominación específica;Código;Naturaleza;Domicilio;C. Postal;Teléfono
	
	String Provincia;
	String Localidad;
	String DenGenerica;
	String DenEspecifica;
	String    Codigo;
	String Naturaleza;
	String Domicilio;
	String     CPostal;
	String    NumTelf;
	public centros(String provincia, String localidad, String denGenerica, String denEspecifica, String codigo,
			String naturaleza, String domicilio, String cPostal, String numTelf) {
		super();
		Provincia = provincia;
		Localidad = localidad;
		DenGenerica = denGenerica;
		DenEspecifica = denEspecifica;
		Codigo = codigo;
		Naturaleza = naturaleza;
		Domicilio = domicilio;
		CPostal = cPostal;
		NumTelf = numTelf;
	}
	public String getProvincia() {
		return Provincia;
	}
	public void setProvincia(String provincia) {
		Provincia = provincia;
	}
	public String getLocalidad() {
		return Localidad;
	}
	public void setLocalidad(String localidad) {
		Localidad = localidad;
	}
	public String getDenGenerica() {
		return DenGenerica;
	}
	public void setDenGenerica(String denGenerica) {
		DenGenerica = denGenerica;
	}
	public String getDenEspecifica() {
		return DenEspecifica;
	}
	public void setDenEspecifica(String denEspecifica) {
		DenEspecifica = denEspecifica;
	}
	public String getCodigo() {
		 return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	public String getNaturaleza() {
		return Naturaleza;
	}
	public void setNaturaleza(String naturaleza) {
		Naturaleza = naturaleza;
	}
	public String getDomicilio() {
		return Domicilio;
	}
	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}
	public String getCPostal() {
		return CPostal;
	}
	public void setCPostal(String cPostal) {
		CPostal = cPostal;
	}
	public String getNumTelf() {
		return NumTelf;
	}
	public void setNumTelf(String numTelf) {
		NumTelf = numTelf;
	}
	@Override
	public String toString() {
		return "centros [Provincia=" + Provincia + ", Localidad=" + Localidad + ", DenGenerica=" + DenGenerica
				+ ", DenEspecifica=" + DenEspecifica + ", Codigo=" + Codigo + ", Naturaleza=" + Naturaleza
				+ ", Domicilio=" + Domicilio + ", CPostal=" + CPostal + ", NumTelf=" + NumTelf + "]";
	}
	
	
}
