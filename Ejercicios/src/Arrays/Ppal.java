package interfaces;

import java.util.Arrays;

public class Ppal {

	public static void main(String[] args) {
		
		Vehiculo v1=new Vehiculo("BMW",2000);
		Vehiculo v2=new Vehiculo("audi",300);
		Vehiculo v3=new Vehiculo("Seat",550);
		Vehiculo v4=new Vehiculo("awiki",420);
		
		Vehiculo [] veh= {v1,v2,v3,v4};
		System.out.println("DESORDEN");
		
		for(Vehiculo v: veh) {
			System.out.println(v.toString());
		}
		
		Arrays.sort(veh);

		
		System.out.println("ORDEN");
		for(Vehiculo v: veh) {
			System.out.println(v.toString());
		}

		System.out.println(v1.compareTo(v2));
		System.out.println(v1.compareTo(v3));
		System.out.println(v1.compareTo(v4));
	}

}
