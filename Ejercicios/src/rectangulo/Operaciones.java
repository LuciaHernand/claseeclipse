package rectangulo;

public class Operaciones {		
	 float Lado1;
	 float Lado2;
	
	
	public Operaciones() {
	
	 	}
	public Operaciones(float lado1,float lado2) {
		Lado1=lado1;
		Lado2=lado2;
		
 	}

	public float calcularArea() {
		return Lado1*Lado2;
	}
	public float calcularPerimetro() {
		return Lado1+Lado1+Lado2+Lado2;
	}
	public void esCuadrado(){
		if (Lado1==Lado2){
			System.out.println("Es cuadrado.");}
		else {System.out.println("Es un rectángulo.");}
		}
	
public static void pintarCuadrado(float Lado1,float Lado2) {
		
	for(int j=1;j<=Lado2;j++) {
		int numero1=1;
		int numero2=1;
		while (numero1<=Lado1) {
			System.out.print("*\t");
			numero1++;
		}
		System.out.println("\n");
		System.out.println();
	
		numero1=1 ;
	}
		
	
	}

public float getLado1() {
	return Lado1;
}

public void setLado1(float lado1) {
	Lado1 = lado1;
}

public float getLado2() {
	return Lado2;
}

public void setLado2(float lado2) {
	Lado2 = lado2;
}

@Override
public String toString() {
	return "Operaciones [Lado1=" + Lado1 + ", Lado2=" + Lado2 + "]";
}


}