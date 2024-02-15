
/*
 * Autores: Juan David Delgado Muñoz
 * Victor Manuel Velasquez Benavides
 */

public class Producto {

		// ATRIBUTOS
		int idProducto;
		String nombreProducto;
		double precio;
		int cantidad;
		
		
	public Producto() {
	}

	public Producto(int idProducto, String nombreProducto, double precio, int cantidad) {
		super();
		this.idProducto = idProducto; 
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	
	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

}
