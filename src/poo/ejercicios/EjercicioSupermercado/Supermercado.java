package poo.ejercicios.EjercicioSupermercado;

public class Supermercado {
	private String nombre;
	private Cajera cajeras[];

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cajera[] getCajeras() {
		return cajeras;
	}

	public void setCajeras(Cajera[] cajeras) {
		this.cajeras = cajeras;
	}

	public Supermercado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		Supermercado supermercado = new Supermercado("Mercadona");
		supermercado.abrirSupermercado();
		// Desde el main llamar abrir supermercado aunque no haga nada

	}

	public void abrirSupermercado() {
		// el metodo abrirSupermercado crea todos los objetos
		// Crear 3 clientes
		Cliente cliente1 = new Cliente(1, "Cliente 1", true);
		Cliente cliente2 = new Cliente(2, "Cliente 2", false);
		Cliente cliente3 = new Cliente(3, "Cliente 3", true);
		// Crear 2 cajeras
		Cajera cajera1 = new Cajera(1, "Cajera1");
		Cajera cajera2 = new Cajera(2, "Cajera2");
		this.cajeras = new Cajera[] { cajera1, cajera2 };
		// crear productos
		Producto producto1 = new Producto(1, "Lejia", 2, "Limpieza");
		Producto producto2 = new Producto(2, "Espaguetis", 1.2, "Pasta");
		Producto producto3 = new Producto(3, "Arroz Basmati", 1.5, "Arroz");
		Producto producto4 = new Producto(4, "Yogures", 6, "Lacteos");
		Producto producto5 = new Producto(5, "Huevos", 4, "Huevos");
		
		cliente1.añadirProductos(producto1);
		cliente1.añadirProductos(producto3);
		for (Producto carritoCliente1 : cliente1.getCarritoCompra()) {
		
		System.out.println(carritoCliente1.getNombre());}

	}

}
