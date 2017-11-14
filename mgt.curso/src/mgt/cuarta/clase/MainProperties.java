package mgt.cuarta.clase;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class MainProperties {

	public static void main(String[] args) throws Throwable {
		Properties propiedades = new Properties(); //creo objeto propiedades
		propiedades.load(new FileReader("properties")); //cargo los datos del fichero informe en objeto propiedades
		
		String saludo = propiedades.getProperty("saludo"); //recupero el valor de la clave "saludo"
		System.out.println(saludo); //escribo en pantalla el valor
		
		String idioma = propiedades.getProperty("idioma");
		System.out.println(idioma);
		
		//si paso argumentos (boton derecho,run us, run configurations, argum)
		for (String s :args)
		{
			System.out.println(s);
		}
	}
	
}
