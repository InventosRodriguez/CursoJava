package mgt.sexta.clase;

public class Persona implements Comparable<Persona>{
	private String nif;
	private String nombre;
	private int edad;
	
	
	@Override
	public String toString() {
		return "Persona [nif=" + nif + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	/**
	 * @param nif
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nif, String nombre, int edad) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.edad = edad;
	}
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		System.out.println("Llamando a comparar" + " " + this);
		int entero_comp = 0;
		
		entero_comp = this.edad - o.edad; //al restarlo, si this.edad es >, devuelve positivo, si es = da 0, si es > da un negativo
											//esto vale por que son datos integer
		
//		if (this.edad >	o.edad) entero_comp = 1;
//		else if (this.edad == o.edad) entero_comp = 0;
//		else entero_comp = -1;
			
		return entero_comp;
	}
	
	
}
