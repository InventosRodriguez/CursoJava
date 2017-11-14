package mgt.primera.clase;

/**
 * PROGRAMA PARA PRACTICAR POP
 * @author a706973
 *
 */


public class PracticaPOP {

	private static int numero_personas;

	private int edad; // se inicializa a 0
	private String nombre; // se inicializa a null

	// Constructor principal:
	public PracticaPOP() {

	}
	
	// Constructor:
	public PracticaPOP(int pase_edad, String pase_nombre) {
		super();
		
		System.out.println("SegundaClase:");
		
		System.out.println(pase_edad);
		System.out.println(pase_nombre);
		
		this.edad = pase_edad;
		this.nombre = pase_nombre;
		numero_personas = numero_personas + 1;
		
		System.out.println(this.edad);
		System.out.println(this.nombre);
		System.out.println(numero_personas);
		System.out.println("-----------------");
	}
	
	// Metodo:
	public void Mostrar() {
		System.out.println("Mostrar:");
		System.out.println(this.edad);
		System.out.println(this.nombre);
		System.out.println(numero_personas);
		System.out.println("-----------------");
	}
	

	
	public static void main(String[] args) {
		
		System.out.println("Comienzo2");
		System.out.println("---------");
		
		PracticaPOP Alvaro = new PracticaPOP(33,"Alvaro");
		Alvaro.Mostrar();
		
		PracticaPOP Tania = new PracticaPOP(36,"Tania");
		Tania.Mostrar();
		
		PracticaPOP obj_persona = new PracticaPOP();
		
		System.out.println("OBJETO PERSONA TIENE:");
		System.out.println(obj_persona.edad);
		System.out.println(obj_persona.nombre);

	}
	
}
