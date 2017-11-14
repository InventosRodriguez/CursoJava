package mgt.quinta.clase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		/**
		   -Instancio un List de tipo ArrayList que contiene las columnas de la clase cerveza
		   -El ArrayList no es sincronizado. Si un objeto es sincronizado, 
		    Java se va a encargar de que sólo un hilo va a poder acceder al mismo tiempo al objeto.
		    Si necesitamos acceso sincronizado, Vector es la mejor opción
		   -Si tenemos la necesidad de buscar y acceder a los elementos, lo mejor es usar un ArrayList
		   -Cuando la estructura está llena, el ArrayList crece al triple de su capacidad.
		 */
		List<Cerveza> listCervezas = new ArrayList<Cerveza>();
		
		// Instancio un List de tipo LinkedList que contiene las columnas de la clase cerveza
		// Si crear y borrar va a ser lo que predomine, lo mejor será usar una LinkedList
		//List<Cerveza> listCervezas = new LinkedList<Cerveza>();

		// Instancio 3 objetos con el contenido de la clase cerveza
		Cerveza brewdog = new Cerveza("BrewDog", 3, 1);
		Cerveza dougalls = new Cerveza("Dougalls", 5, 1);
		Cerveza kernel = new Cerveza("Kernel", 8, 1);
		
		// Añado los 3 objetos en el array. Creo 3 líneas vamos.
		listCervezas.add(brewdog);
		listCervezas.add(dougalls);
		listCervezas.add(kernel);

		System.out.println("-------- RECORREMOS CON FOR -----");
		//Una manera de recorrer el array		
		for (int i=0;i<listCervezas.size();i++) {
			System.out.println(listCervezas.get(i));
		}

		System.out.println("------ RECORREMOS CON FOR EACH --------");
		//Otra manera de recorrer el array
		for (Cerveza i : listCervezas) {
			System.out.println(i.toString());
		}
		
		System.out.println("-------RECORREMOS CON ITEATOR WHILE -----");
		//Otra manera de recorrer el array
		/**
		 * Iterator, sirve para recorrer una estructura y define los siguientes métodos:
		 * 		–boolean hasNext() //¿quedan elementos?
 		 *		–next() //dame el siguiente
		 *		–remove() //borra el actual
		 */
		

		Iterator<Cerveza> i_listCervezas = listCervezas.iterator();
		while (i_listCervezas.hasNext()) { 
			System.out.println(i_listCervezas.next());
		}
		
	}

}
