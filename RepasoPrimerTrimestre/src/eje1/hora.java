package eje1;

public class hora {		
	private int hora;
    private int minutos;
    private int segundos;
    private int formato=24;
    
    
    
	public hora() {
		super();
	}
	
	public int transformarHora(int formato) {
	this.formato=formato;
	if(formato==24) {hora=hora+12;}
	if (formato==12) {
	hora=hora-formato;}
		
	return hora;
	} 



	public int getFormato() {
		return formato;
	}



	public void setFormato(int formato) {
		this.formato = formato;
	}



	public hora(int hora, int minutos, int segundos) {
		super();
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}



	public int getHora() {
		return hora;
	}



	public void setHora(int hora) {
		this.hora = hora;
	}



	public int getMinutos() {
		return minutos;
	}



	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}



	public int getSegundos() {
		return segundos;
	}



	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}



	@Override
	public String toString() {
		return "hora [hora=" + hora + ":" + minutos + ":" + segundos + "]";
	}
	
	

	

}

