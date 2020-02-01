package compareTo;

import java.util.Arrays;

public class Ppal {

	public static void main(String[] args) {
		
		Vehiculo v1=new Vehiculo("BMW",20);
		Vehiculo v2=new Vehiculo("audi",3900);
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

		
	}

}

