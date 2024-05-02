package ar.edu.unq.po2.tp9.ayudandoAlSoberano;

public class CuentaCorriente extends CuentaBancaria{

	private int descubierto;
	
	
	public CuentaCorriente(String titular, int descubierto){
		 super(titular);
		 this.descubierto=descubierto;
	}
	
	
	public int getDescubierto(){
		 return this.descubierto;
	}
	
	
	@Override
	public void extraer(int monto) {
		if(this.getSaldo()+this.getDescubierto()>=monto){
			this.setSaldo(this.getSaldo()-monto);
			this.agregarMovimientos("Extraccion");
		}
	}

}
