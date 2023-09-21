package poo.ejercicios;

public class CentroComercial {
     public static void main (String [] args) {
    	 Direccion dir1=new Direccion("N1",2,28945);
    	 Direccion dir2=new Direccion("N2",3,28946);
    	 
    	 Tienda tienda1=new Tienda("Tienda1",1,"Alimentacion",dir1 );
    	 Tienda tienda2=new Tienda("Tienda1",1,"Electronica",dir2 );
    	 Tienda tienda3=new Tienda("Tienda1",1,"Alimentacion",dir1 );
    	 
    	 //tienda1.getDireccion().getcodPostal();
     }
}
