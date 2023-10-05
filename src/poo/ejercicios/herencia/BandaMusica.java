package poo.ejercicios.herencia;

public class BandaMusica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     BandaMusica banda= new BandaMusica();
	 banda.empezarConcierto();
	}
	 
	private void empezarConcierto() {
		Guitarra guitarra1= new Guitarra("Guitarra", "cuerda", 6);
		GuitarraElectrica guitarraElec1= new GuitarraElectrica("Guitarra Electrica", "cuerda", 6, 60);
		Piano piano1= new Piano("Piano", "cuerda percutida", 6, "Clasico");
		Tambor tambor1=new Tambor("Tambor","Percusion", "piel");	
		Instrumento [] instrumentos= {guitarra1, guitarraElec1, piano1, tambor1};
	}
	
	private void afinarInstrumentos(Instrumento [] instrumentos) {
		
		for (Instrumento instrumento:instrumentos) {
			instrumento.afinar();
		}
	}
	
	private void tocarInstrumentos(Instrumento [] instrumentos ) {
		for (Instrumento instrumento:instrumentos) {
			if (instrumento instanceof Tambor) {
				Tambor t = (Tambor)instrumento;
				t.aporrear();
			//	((Tambor)instrumento).aporrear();      haciendo esto le estamos diciendo a java que es del tipo tambor
				
			}
			else {
			instrumento.tocar();}
				
		}
		
	}
	
}


	//El instanceof solo sirve para saber si esa variable es de tipo tambor
	
	
	
//main ()--> empezarConcierto() se crea un objeto de cada tipo
//	
//	afinarInstrumentos(), se le pasan todos los instrumentos en un único parámetro
//		+ se ponen todos los instrumentos a afinar
//		
//	tocarInstrumentos(), se le pasan todos los instrumentos en un único parámetro
//		+ se ponen todos los instrumentos a tocar excepto el tambor que se aporrea
			

