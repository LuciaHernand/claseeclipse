package PrimerPrograma;

public class informativa extends SenialTrafico {
	String texto;

	public informativa() {
		super();

	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public void Cuadrado(){
		int num1=30;
		int num2=0;
		int num3=0;
		int num4=30;
		
		while(num1>1) {
			
			System.out.print("*");
			num1--;	
		}
		while(num2>=0) {
			System.out.println();
			System.out.println("*                            *");
			num2--;
		}
		while(num3==0) {
			System.out.println("*"+num+" "+texto+"*");
			System.out.print("");
	num3--;	
	}
while(num4>1) {
			
			System.out.print("*");
			num4--;	
		}
	System.out.println();
}
	}
