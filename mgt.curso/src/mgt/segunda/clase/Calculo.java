package mgt.segunda.clase;

import java.util.logging.Logger;

public class Calculo {
	private final static Logger log = Logger.getLogger("alvaro");
	
	public static double CalculoIMC(Persona p) {
		double imc = 0;

		imc = (p.getPeso() / (p.getAltura() * p.getAltura()));
		//System.out.println(imc);
		log.info("El imc es: " + imc);
				
		return imc;
	}
}
