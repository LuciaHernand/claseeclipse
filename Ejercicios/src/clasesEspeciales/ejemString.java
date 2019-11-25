package clasesEspeciales;

public class ejemString {

	public static void main(String[] args) {
		String frase1="Hola que tal, hola que tal";
		String frase2=" Muy bien y tú";
		
		System.out.println(frase1.length()+":"+frase1);
		System.out.println(frase1.replace('o','u'));
		System.out.println(frase1.concat( frase2));
		System.out.println(frase1+frase2);
		if(frase1.isEmpty()) {
			System.out.println("La frase está vacia");
		}else System.out.println(frase1.length()+": "+frase1);
		frase1=frase1.replace('q', 'Q');
		System.out.println(frase1.replace(" ",""));
		System.out.println(frase1);
		System.out.println(frase1.indexOf('a'));
		System.out.println(frase1.compareTo(frase2));
		
	}

}
