package mgt.sexta.clase;

import java.util.Comparator;

public class ComparaPersonas implements Comparator<Persona>{

	@Override
	public int compare(Persona o1, Persona o2) { //se puede usar para comparar lo que quiera, porque recibe objetos tipo object, osease de cualquier tipo
		// TODO Auto-generated method stub
		
		return o1.getEdad()-o2.getEdad();
	}
	
}
