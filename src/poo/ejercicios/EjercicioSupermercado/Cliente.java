package poo.ejercicios.EjercicioSupermercado;

public class Cliente {
  private int id;
  private String nombre;
  private Producto carritoCompra [];
  private boolean vip;
  
  
  
  
public Cliente(int id, String nombre,  boolean vip) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.carritoCompra = new Producto [5];
	this.vip = vip;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Producto[] getCarritoCompra() {
	return carritoCompra;
}
public void setCarritoCompra(Producto[] carritoCompra) {
	this.carritoCompra = carritoCompra;
}

public boolean isVip() {
	return vip;
}
public void setVip(boolean vip) {
	this.vip = vip;
}
//Crear metodo añadir productos
    public void añadirProductos(Producto producto){
	for (int i=0; i<this.carritoCompra.length; i++ )
	this.carritoCompra[i] = producto;
	
	
}
// metodo 	cada cliente tiene que pagar el importe de la compra


}
