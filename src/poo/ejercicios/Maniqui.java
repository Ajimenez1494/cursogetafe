package poo.ejercicios;

public class Maniqui {
	 private long id;
     private Vestido vestido1;
     private Pantalon pantalon1;
     private Camisa camisa1;
	
     
     public Maniqui(long id) {
		super();
		this.id = id;
	}


	public long getId() {
		return id;
	}


	public Maniqui(long id,  Pantalon pantalon1, Camisa camisa1) {
		super();
		this.id = id;
		this.pantalon1 = pantalon1;
		this.camisa1 = camisa1;
	}


	public Maniqui(long id, Vestido vestido1) {
		super();
		this.id = id;
		this.vestido1 = vestido1;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Vestido getVestido1() {
		return vestido1;
	}


	public void setVestido1(Vestido vestido1) {
		this.vestido1 = vestido1;
	}


	public Pantalon getPantalon1() {
		return pantalon1;
	}


	public void setPantalon1(Pantalon pantalon1) {
		this.pantalon1 = pantalon1;
	}


	public Camisa getCamisa1() {
		return camisa1;
	}


	public void setCamisa1(Camisa camisa1) {
		this.camisa1 = camisa1;
	}


	 public void vestir (Pantalon pantalon, Camisa camisa) {
		desvestir();
		this.pantalon1 = pantalon;
		this.camisa1 = camisa;
	}
        public void vestir (Vestido vestido) {
		desvestir();
		this.vestido1 = vestido1;
		

	}



	public void desvestir () {

		this.vestido1 = null;
		this.pantalon1 = null;
		this.camisa1 = null;
	}
     
     
     //metodo vestir y metodo desvestir
}
