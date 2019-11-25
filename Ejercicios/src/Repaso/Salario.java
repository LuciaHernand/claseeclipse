package Repaso;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		float horasTrabajadas,salarioBruto = 0,horasExtra,impuestosTotal;
		float impuestos1,impuestos2,salarioFinal,sueldo22Impuestos,sueldo33Impuestos;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Introduce las horas trabajadas: ");
		
        horasTrabajadas=scan.nextFloat();
        
        if(horasTrabajadas<37.5) { salarioBruto=horasTrabajadas*18;
        System.out.println("El salario bruto correspondiente es de "+ salarioBruto+"€");
        }
        if (horasTrabajadas>37.5) {
        	horasExtra=(float) (horasTrabajadas-37.5);
        	salarioBruto=(float) ((horasExtra*28.8)+(37.5*18));
        System.out.println("Tu salario bruto total es: "+salarioBruto+"€\n\t Has trabajado "+horasExtra+" horas extra.");
         }
        
        
        if(salarioBruto<275) {System.out.println("Estas libre de impuestos");}
        
        if(salarioBruto>275 && salarioBruto<525) {sueldo22Impuestos=salarioBruto-275;
        	impuestos1=(float) (sueldo22Impuestos*0.22);
        	salarioFinal=salarioBruto-impuestos1;
        	
        	System.out.println("Tu salrio descontando los impuestos es: "+salarioFinal); }
        
        
        if(salarioBruto>=525) {sueldo22Impuestos=250;
        sueldo33Impuestos=salarioBruto-525;
        
        	impuestos1=(float) (sueldo22Impuestos*0.22);
        	impuestos2=(float) (sueldo33Impuestos*0.33);
        	impuestosTotal=impuestos1+impuestos2;
        	salarioFinal=salarioBruto-impuestosTotal;
        	System.out.println("Tu salario aplicando impuestos es de: "+salarioFinal);
        	
        	
        	
        }
        scan.close();
	}

}
