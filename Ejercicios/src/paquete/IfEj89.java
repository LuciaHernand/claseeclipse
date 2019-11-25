package paquete;

import java.util.Scanner;

public class IfEj89 {

	public static void main(String[] args) {
		
		//REALIZAR UN PROGRAMA QUE LEA UN MES Y NOS DIGA CUÁNTOS DÍAS TIENE 
		
		Scanner scan=new Scanner(System.in);
		
		
		String mes;
		
		System.out.println("Introduce un mes");
		
		
		mes=scan.next();
		
		if (mes.toLowerCase().equals("enero")) {System.out.println("Tiene 30 dias");}
		
		
	    
		else if(mes.toLowerCase().equals("febrero")) { System.out.println("Tiene 28 dias");
		
		}
		
		else if(mes.toLowerCase().equals("marzo")) {System.out.println("Tiene 31 dias ");
		
		}
	    
		else if(mes.toLowerCase().equals("abril")) {System.out.println("Tiene 30 dias");
		
		}
		
		else if(mes.toLowerCase().equals("mayo")) {System.out.println("Tiene 31 dias");
		}
		
		else if (mes.toLowerCase().equals("junio")) {System.out.println("Tiene 30 dias");
		}
		
		else if (mes.toLowerCase().equals("julio")) {System.out.println("Tiene 31 dias");
		}
		
		else if (mes.toLowerCase().equals("agosto")) {System.out.println("Tiene 31 dias");
		}
		
		else if(mes.toLowerCase().equals("septiembre")) { System.out.println("Tiene 30 dias");
		}
		
		else if(mes.toLowerCase().equals("octubre")) {System.out.println("Tiene 31 dias");
		}
		
		else if(mes.toLowerCase().equals("noviembre")) {System.out.println("Tiene 30 dias");}
		
		else if (mes.toLowerCase().equals("diciembre")){System.out.println("Tiene 31 dias");
		}
		
		
		
		//ej 9
	
		
		String diaSemana;
		
		System.out.println("Dime un dia de la semana");
		
        diaSemana=scan.next().toLowerCase().substring(0, 2);
		
		if (diaSemana.equals("lu")) {
			System.out.println("El día anterior es Domingo y el posterior es Martes");
		} else if (diaSemana.equals("ma")) {
			System.out.println("El día anterior es Lunes y el posterior es Miércoles");
		} else if (diaSemana.equals("mi")) {
			System.out.println("El día anterior es Martes y el posterior es Jueves");
		} else if (diaSemana.equals("ju"))
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		

	}

}
