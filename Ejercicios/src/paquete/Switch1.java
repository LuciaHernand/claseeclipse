package paquete;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		
	int num;
	
	Scanner scan=new Scanner(System.in);	
	System.out.println("Introduce el n�mero del dia de la semana");
	
		num=scan.nextInt();
		
	switch(num) {
	    case 1: System.out.println("El d�a es Lunes");break;
	    case 2: System.out.println("El dia es Martes");break;
	    case 3: System.out.println("El dia es Miercoles");break;
	    case 4: System.out.println("El dia es Jueves");break;
	    case 5: System.out.println("El dia es Viernes");break;
	    case 6: System.out.println("El dia es Sabado");break;
	    case 7: System.out.println("El dia es Domingo");break;
	    
	    default:System.out.println("No existe ese dia dentro de la semana");	
		
	}
	
	//introducir mes y que nos de la temporada
	
	String mes;
	
	System.out.println("Introduce un mes");
	
	mes=scan.next();
	
	switch (mes) {
	case "diciembre":
	case "enero": 
	case "febrero":System.out.println("Su mes corresponde a la estaci�n de invierno");break;
	case "marzo":
	case "abril":
	case "mayo":System.out.println("Su mes corresponde a la estaci�n de primavera");break;
	case "junio":
	case "julio":
	case "agosto":System.out.println("Su mes corresponde a la estaci�n de verano");break;
	case "septiembre":
	case "octubre":
	case "noviembre":System.out.println("Su mes corresponde a la estaci�n de oto�o");break;
	default: System.out.println("No introdujo bien el mes");
	}
	
	//primaria
	
	int curso;
	
	System.out.println("Introduce tu curso");
	
	curso=scan.nextInt();
	
	switch (curso) {
	case 1: 
	case 2:System.out.println("Estas cusando primer ciclo de primaria");break;
	case 3:
	case 4:System.out.println("Estas cursando segundo cilo de primaria");break;
	case 5:
	case 6:System.out.println("Estas cursando tercer ciclo de primaria");break;	}
	
	
	//REALIZAR UN MEN� UTILIZANDO SWITCH QUE NOS PREGUNTE LA OPERACI�N A REALIZAR CON DOS N�MEROS LE�DOS:
	//SUMA (�+), MULTIPLICACI�N (�*�), RESTA (�-�) Y DIVISI�N (�/�)
	
	
    float num1,num2,num3;
    String operacion = "";
    
    System.out.println("Introduce un n�mero: ");
	
    num1=scan.nextFloat();
    
    System.out.println("Introduce otro n�mero: ");
    
    num2=scan.nextFloat();
    
    System.out.println("Introduce el s�mbolo de la operaci�n que desees aplicar:");
    operacion=scan.next();
	
    switch (operacion) {
    
    case "/":{ num3=num1/num2;
        System.out.println("El resultado de dividir el valor 1 entre el valor 2 es igual a: "+num3);break;}
    case"*":{ num3=num1*num2; 
        System.out.println("El resultado de mulplicar el valor uno y el valor 2 es: "+num3);break;}
    case"+":{ num3=num1+num2;
        System.out.println("El resultado de sumar el valor uno y el valor 2 es: "+num3);break;}
    case"-":{num3=num1-num2;
        System.out.println("El resultado de mulplicar el valor uno y el valor 2 es: "+num3);break; }
    }
	
	scan.close();	

	}

}
