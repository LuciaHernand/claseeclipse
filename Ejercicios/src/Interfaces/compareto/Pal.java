package interfaces.compareto;

import java.util.Arrays;

public class Pal {

	public static void main(String[] args) {
		Vehiculo1 v1=new Taxi("BMW",20);
		Vehiculo1 v2=new Taxi("Audi",3900);
		Vehiculo1 v3=new Autobus("Seat",550);
		Vehiculo1 v4=new Autobus("Renault",420);
		
		Vehiculo1 [] veh= {v1,v2,v3,v4};
		
		
		
		
		Arrays.sort(veh);
		
		
		for (Vehiculo1 i: veh) {
		System.out.println(i.toString());
		}
		System.out.println();
		Arrays.sort(veh);
		for (Vehiculo1 j: veh) {
			System.out.println(j.toString());
			}
	}

}
