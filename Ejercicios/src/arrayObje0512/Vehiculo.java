package arrayObje0512;

public class Vehiculo {
String matricula;
String modelo;
String potencia;
int carga;


public Vehiculo(String matricula, String modelo, String potencia,int carga) {
	super();
	this.matricula = matricula;
	this.modelo = modelo;
	this.potencia = potencia;
	this.carga=carga;
	}


public Vehiculo() {
	super();
}


@Override
public String toString() {
	return "Vehiculo1 [matricula=" + matricula + ", modelo=" + modelo + ", potencia=" + potencia + ", carga=" + carga
			+ "]";
}


public String getMatricula() {
	return matricula;
}
public void setMatricula(String matricula) {
	this.matricula = matricula;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getPotencia() {
	return potencia;
}
public void setPotencia(String potencia) {
	this.potencia = potencia;
}
public int getCarga() {
	return carga;
}

public void setCarga(int carga) {
	this.carga = carga;
}


}
