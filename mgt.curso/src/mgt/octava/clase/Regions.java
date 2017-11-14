package mgt.octava.clase;

public class Regions {

	private String nombre;
	private int id;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID = " + this.id + " Nombre = " + this.nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Regions(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
	}
	
	
	
}
