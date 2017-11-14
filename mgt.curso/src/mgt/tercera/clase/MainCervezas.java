package mgt.tercera.clase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Recojo el numero de cervezas que quieren de BrewDog, Dougalls y Kernel
 * Las meto en un array
 * Muestro el array
 * Grabamos el array en un fichero
 * 
 * @author Alvarito
 *
 */

public class MainCervezas {
	public static final int CONT_TIPO = 3; 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creas un objeto array. Tendrá los campos del constructor Cerveza, y el occurs que has definido como constante.
		Cerveza[] cervezas = new Cerveza[CONT_TIPO];
		
		// Creas un objeto para instanciar a la clase DameCerveza
		DameCerveza dc = new DameCerveza();
		
		//Recorres el array cervezas
		for (int i = 0; i < cervezas.length; i++) {
			
			switch (i) {  
				
			case 0:
				// Pides las cervezas que quieres de bredog
				int can_BrewDog = dc.DameCantidad("BrewDog");
				System.out.println("He pedido " + can_BrewDog + " de BrewDog");
				
				// Creas un objeto de tipo Cerveza con la información de BrewDog
				Cerveza BrewDog = new Cerveza(can_BrewDog, "BrewDog", 1);
				
				// Guardas esa línea que contiene la información de brewdog en en array.
				cervezas[i] = BrewDog;
				
				break;
		
			case 1:
				int can_Dougalls = dc.DameCantidad("Dougalls");
				System.out.println("He pedido " + can_Dougalls + " de Dougalls");
				Cerveza Dougalls = new Cerveza(can_Dougalls, "Dougalls", 2);
				cervezas[i] = Dougalls;
				break;
		
			case 2:
				int can_Kernel = dc.DameCantidad("Kernel");
				System.out.println("He pedido " + can_Kernel + " de Kernel");
				Cerveza Kernel = new Cerveza(can_Kernel, "Kernel", 3);
				cervezas[i] = Kernel;
				break;
				
			}
		
		}
		
		//MUESTRO EL ARRAY
		for (int i = 0; i < cervezas.length; i++) {
			//Muestras cada línea del array mediante el toString para que lo convierta a String. Sino lo que hace es mostrar el espacio de memoria con nombre chungo.
			System.out.println(cervezas[i].toString());
		}
		
		GuardarEnFichero.MeterEnCaja(cervezas, "caja");

		
	}

}
