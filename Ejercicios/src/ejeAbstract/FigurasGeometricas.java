package ejeAbstract;

abstract class FigurasGeometricas {
	private int lado;
	abstract void dibujar();
	public FigurasGeometricas() {
		this.lado=10;
	}
	public int getLado() {return lado;
		
	}
	public void setLado(int lado) {
		this.lado=lado;
	}

}
