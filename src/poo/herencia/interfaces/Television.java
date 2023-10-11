package poo.herencia.interfaces;

public class Television extends DispositivoElectronico {
    private int hdmi;
    
    
	public int getHdmi() {
		return hdmi;
	}


	public void setHdmi(int hdmi) {
		this.hdmi = hdmi;
	}


	public Television(int id, double precio, String fabricante, int hdmi) {
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
