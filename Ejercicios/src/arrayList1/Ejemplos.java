package arrayList1;

import java.util.ArrayList;

public class Ejemplos {

	public static void main(String[] args) {
		ArrayList<String> varArray=new ArrayList<String>();
		Integer varI=new Integer(45);
		varI.intValue();
		Float varF=new Float(45.25F);
		System.out.println(varI+"\t"+varF);
		
		String s="464093";
		int x=varI.parseInt(s);
		
		System.out.println(x);
		
		
		float y=Float.valueOf(s);
		System.out.println(y);
	}

}
