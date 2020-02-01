package ExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Pattern;


public class dia16dic2019 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		

	String dosPalabrasEspacio;
	String dosPalabras;
	String palabraComenzandoMayuscula;
	String unaPalabrayAtbb;
	String unaPalabraCondosletras;
	
	
	System.out.println("Introduce tu correo electrónico");
	String correoElec;

	
	String patron="(?i)[a-z](2,)[@]{1}(gmail|hotmail)[.]{1}(com|net|es)";
	correoElec=scan.next();
		
	
	System.out.println(Pattern.matches(patron, correoElec)); 
	

	}

}
