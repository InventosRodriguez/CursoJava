package mgt.tercera.clase;

public class Cerveza {
	private int cantidad;
	private String tipo;
	private float precio;
	
	public Cerveza() {
	}
	
	public Cerveza(int cantidad, String tipo, float precio) {
		super();
		this.cantidad = cantidad;
		this.tipo = tipo;
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Cerveza [cantidad=" + cantidad + ", tipo=" + tipo + ", precio=" + precio + "]";
	}




	
	
	
}
