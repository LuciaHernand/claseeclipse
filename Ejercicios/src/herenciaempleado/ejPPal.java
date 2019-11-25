package herenciaempleado;



public class ejPPal {

	public static void main(String[] args) {
		persona varP1=new persona("Pablo","Rueda","Jimenez") ;
		
		System.out.println(varP1.toString());
		empleado varE1=new empleado("Pablo","Rueda","Jimenez","2 años");
		
		System.out.println(varE1.getNombre()+" "+varE1.getApellido1()+" "+varE1.getApellido2()+" " +varE1.getAntiguedad());
		persona varP2=new persona("Maria","Fernandez","Palechor");
		
		System.out.println(varP2.toString());
		
		becario varB1=new becario("Maria","Fernandez","Palechor","2 meses");
		
		System.out.println(varB1.getNombre()+" "+varB1.getApellido1()+" "+varB1.getApellido2()+" " +varB1.getTiempMaxBeca());
		
		varE1.setAntiguedad("3 años");
		
		System.out.println(varE1.getNombre()+" "+varE1.getApellido1()+" "+varE1.getApellido2()+" " +varE1.getAntiguedad());

	}

}
