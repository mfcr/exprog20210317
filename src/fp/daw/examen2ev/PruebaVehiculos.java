package fp.daw.examen2ev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PruebaVehiculos {


	public static void main(String[] args) {
		//Creamos un vehículo de cada tipo:
		Coches coche=new Coches("L-5656-AZ",5);
		Microbuses micro=new Microbuses("2321 BGF",22);
		Furgonetas furgo=new Furgonetas("3456-rtf",3.5);
		Camiones camion=new Camiones("B-0000-A",20);
		//Los insertamos en un array de objetos de tipo Vehiculos que servira de contenedor polimórfico
		ArrayList<Vehiculos> vehiculos=new ArrayList<Vehiculos>(Arrays.asList(coche,micro,furgo,camion));
		//Recorremos el Array de Vehículos y pedimos al usuario un numero de dias de alquiler
		// para mostrar el coste.
		Scanner teclado=new Scanner(System.in);
		for (Vehiculos v:vehiculos) {
			System.out.println("Mostrando el vehículo:  "+v.toString());
			System.out.println("Introduzca el número de dias del alquiler: ");
			try {
				int dias=teclado.nextInt();
				System.out.println("El alquiler solicitado del vehiculo por "+dias+" dias asciende a "+v.getPrecioAlquiler(dias));
				System.out.println();
				System.out.println();
			} catch(Exception e) { 
				System.out.println("Error al introducir los datos, continuamos con el siguinet vehiculo."); 
				System.out.println();
			}
		}
		teclado.close();
		
		
	}

}
