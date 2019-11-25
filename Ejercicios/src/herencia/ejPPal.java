package herencia;

import java.util.Scanner;

public class ejPPal {
	public static void main (String[]args) {
		Scanner Scan=new Scanner(System.in);
		
		Vehiculo varV1=new Vehiculo("1520DBR","renault","100cv",520);
		System.out.println(varV1.toString());
		Taxi varT1=new Taxi("1520DBR","renault","100cv","Licencia1",109);
		System.out.println(varT1.getMatricula()+" "+varT1.getPotencia()+" "+varT1.getnLicencia());
		Vehiculo varV2=new Vehiculo("1314TYV","Ford","200cv",521);
		Autobus varA1=new Autobus("1314TYV","Ford","200cv",50,752);
		System.out.println(varV2.toString());
		System.out.println(varA1.getMatricula()+" "+varA1.getModelo()+" "+varA1.getPotencia()+" "+varA1.getnPlazas());
		Vehiculo varV3=new Vehiculo("1527DBR","scania","200cv",520);
		System.out.println(varV3.toString());
		AVANZA a1=new AVANZA("1527DBR","scania","200cv",20,520);
		
		
		Autobus varA2=new Autobus("1587DBR","scania","300cv",20,245);
		System.out.println(varA2.toString());
		EMT e1=new EMT("1587DBR","scania","300cv",20,245);
		e1.setnLinea(86);
	
		System.out.println("¿Tiene baño?");
		a1.setBanio(Scan.nextBoolean());

		
		System.out.println(a1.toString());
		System.out.println(e1.toString());
		Scan.close();
	}

}

