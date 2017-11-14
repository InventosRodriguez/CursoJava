package mgt.quinta.clase;

public class Cerveza {
	private String nombre; //el sin, el con o el con limon
	private int cantidad; //cantidad de cerveza que se ha vendido
	private float precio; //precio de la cerveza

	public Cerveza(String nombre, int cantidad, float precio) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public Cerveza() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Cerveza [nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	
	
	
}
