package poo.ejercicios.herencia;

public class Tambor extends Instrumento {
   private String material;
	
	public Tambor(String nombre, String tipo) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}
	
	public Tambor(String nombre, String tipo, String material) {
		super(nombre, tipo);
		// TODO Auto-generated constructor stub
	}
	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public void afinar() {
		  System.out.println("Afinando instrumento:" + this.getNombre());	  
			  
		  }
	
	public void aporrear() {
		  System.out.println("Aporreando" + this.getNombre());	  
			  
		  }

}
