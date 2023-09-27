package poo.ejercicios;


public class Escaparate {
     public static void main (String [] args) {
    	 
    	 
    	 Boton boton1 = new Boton(1,"cuadrado","negro", 10);
 		 Boton boton2 = new Boton(2,"cuadrado","negro", 12);
 		 Boton boton3 = new Boton(3,"redondo","negro", 12);

 		 Boton[] botonesCamisa = {boton1,boton2};
 		
 		
 		Pantalon pantalon1 = new Pantalon(1,"negro", "M", 29, boton3);
 		Vestido vestido1=new Vestido(1,"rojo","M",26);
 		Camisa camisa1=new Camisa(1,"blanco", "M", 25,botonesCamisa);
    	
 		Maniqui maniqui1 = new Maniqui(0);
		maniqui1.vestir(pantalon1,camisa1);
		
		Maniqui maniqui2 = new Maniqui(1,vestido1);
		
		
		Escaparate escaparate = new Escaparate ();
		escaparate.mostrarEscaparate(maniqui1, maniqui2);
	}
	
	    public void mostrarEscaparate (Maniqui...maniquis) {
		for (Maniqui maniqui : maniquis) {
			
			System.out.println("El maniqui tiene el id" + maniqui.getId() );
			if (maniqui.getCamisa1() != null) {
			System.out.println(maniqui.getCamisa1().getPrecio() );
			System.out.println(maniqui.getPantalon1().getPrecio());
			System.out.println("El maniqui tiene el id" + maniqui.getId() );

			System.out.println(maniqui.getVestido1().getPrecio());

		}}
    	}
    	public void mostrarPrecio(Maniqui...maniquis) {
    		
    	}
    		
     }

	
		
	
     
      

