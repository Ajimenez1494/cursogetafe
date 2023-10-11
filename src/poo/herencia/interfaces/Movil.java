package poo.herencia.interfaces;

public class Movil extends DispositivoElectronico {
    private String sistemaOperativo;
    
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public Movil(int id, double precio, String fabricante, String sistemaOperativo) {
		super(id, precio, fabricante);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void encender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		
	}

}
