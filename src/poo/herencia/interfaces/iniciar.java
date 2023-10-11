package poo.herencia.interfaces;

public class iniciar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
     Coche coche= new Coche(1, "145456M", "Ford", 3);
     Moto moto= new Moto(2, "123453H", "Suzuki",2);
     Movil movil= new Movil(3, 200, "Xiaomi" , "Android");
     Television tv= new Television(4, 400, "Samsung", 3);
     
     Usuario usuario= new Usuario(movil, moto, coche, tv);
    //encenderCosas(movil);
    
		
	}
	
	
	private void encenderCosas(SistemaEncendido aparato ) {
		
		aparato.encender();
	}

}
//- Un objeto de cada tipo
//- Un usuario al que le asignamos esos objetos
//- llamamos al método encender con cada uno de los objetos del usuario 
//- encender() --> Solo se le pasa un parámetro, no puede ser el objeto usuario	
