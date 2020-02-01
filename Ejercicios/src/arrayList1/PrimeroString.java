package arrayList1;

import java.util.ArrayList;

public class PrimeroString {

	public static void main(String[] args) {

		ArrayList<String> varColeccionString=new ArrayList<String>();
		//Añadiendo <String> ya no tenemos que hacer el downcasting como object y luego forzarlo a String
		varColeccionString.add("Pepe");
		varColeccionString.add("Juan");
		varColeccionString.add("Maria");
		varColeccionString.add("Berto");
		
		System.out.println("Al principio "+varColeccionString.size());
		for(String s:varColeccionString) {
			System.out.println(s);
			
		}
		
		/*otra forma de recorrer el array
		 *for(int i=0;i<3;i++){
		 * System.out.println(varColeccionString.get(i));}
		 */
		
		varColeccionString.remove("Pepe");
		System.out.println("Una vez quitado "+varColeccionString.size());
		for(String s:varColeccionString) {
			System.out.println(s);
		}
		
		
	}

}
