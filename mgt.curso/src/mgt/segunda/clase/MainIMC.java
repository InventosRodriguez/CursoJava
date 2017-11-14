package mgt.segunda.clase;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

public class MainIMC {
	
	private final static Logger alvaro = Logger.getLogger("milog");
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("log4j.properties");
		
		// RECOGER DATOS:
		double peso = DameDatos.DamePeso();
		double altura = DameDatos.DameAltura();
		
		//System.out.println("El paso es: " + peso);
		//System.out.println("La altura es: " + altura);
		alvaro.debug("pa esto 4 horas");
		alvaro.error(".....");
		alvaro.warn("pa todo lo demás");
		alvaro.info("Visual C++");
		
		
		Persona p = new Persona(peso, altura);
		//System.out.println(p.getPeso());
		
		double imc = Calculo.CalculoIMC(p);
		
		TipoImc tipo = TipoImc.traduceIMC(imc);
		System.out.println("Tu imc es " + imc + "y estas " + tipo);

	}

}
