package mgt.sexta.clase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MainMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		    �HashMap <Clave, Valor>
		    	Los elementos no tienen un orden espec�fico
			�TreeMap<Clave, Valor>
				La caracter�stica del TreeMap, es que ordena por si solo la colecci�n, por la clave dada.
				Al mantener la colecci�n ordenada, el el borrado y la inserci�n son algo m�s costosos
			�LinkedHashMap<Clave, Valor>
				Igual que HashMap ,pero a la hora de recorrer -iterar- sobre un LinkedHashMap, el orden de inserci�n es respetado
			
			-Ninguna de estas clases, permiten la inserci�n Clave duplicada. Si el nuevo objeto presenta una clave existente, el nuevo objeto reemplaza al viejo
			-Y el acceso es no sincronizado (varios hilos pueden acceder a �l simult�neamente)
			
			Los m�todos m�s empleados son
			�Valor put (Clave, Valor)
			�Valor get (Clave)
			�Valor remove(Clave)
			�void clear()
			�boolean containsValue (Value)
		 */
		
		/**
		 * Clase Collections
		 �Sort (Colection) //nos devuelve una colecci�n ordenada por �su orden natural�
		 �Shuffle(Colection) //nos devuelve la colecci�n ordenada aleatoriamente
		 */
		
		// Creamos el hashmap usando la clase persona para que coja esos campos.
		HashMap<String, Persona> hm_persona = new HashMap<String, Persona>();
		
		// Creamos 3 objetos con informaci�nd e tipo Persona
		Persona alvaro = new Persona("12416972-P", "Alvaro", 32);
		Persona tania  = new Persona("22222222-P", "Tania", 34);
		Persona edu    = new Persona("33333333-P", "Edu", 38);
		
		// Metemos los 3 objetos en el mapa
		hm_persona.put(alvaro.getNif(), alvaro);
		hm_persona.put(tania.getNif(), tania);
		hm_persona.put(edu.getNif(), edu);

		// Mostramos el mapa
		System.out.println(hm_persona.get(alvaro.getNif()));
		System.out.println(hm_persona.get(tania.getNif()));
		System.out.println(hm_persona.get(edu.getNif()));
		
		//Meto el mapa en un arrayList para poderlo recorre mejor
		ArrayList<Persona> al_mapa = new ArrayList<>(hm_persona.values());
		
		for (int i=0; i<al_mapa.size(); i++){

			System.out.println(al_mapa.get(i));
		}
		
		/**
		 *****************************************************
		 A PARTIR DE AQUI EXPLICAMOS LA ORDENACI�N Y COMPARACI�N
		 */
		
		if ((alvaro.compareTo(tania)) > 0) //puedo invocarlo
		{
			System.out.println("P1 es mayor");
		} else {
			System.out.println("P2 es mayor");
		}
		
		//voy a por el orden total
		ComparaPersonas cp = new ComparaPersonas(); //creo el objeto cp de la clase ComparaPersonas
		Collections.sort(al_mapa, cp); //le paso la lista y el criterio que est� en la clase ComparaPersonas, as� que tengo que crear un objeto de ComparaPersonas "cp"
		System.out.println("Mostrando lista personas ordenadas por orden total");
		
		for (Persona per : al_mapa)
		{
			System.out.println(per); //ahora saldr�n ordenados por edad porque collections.sort llama a mi metodo compareto para saber el orden
		}
		
	}

}
