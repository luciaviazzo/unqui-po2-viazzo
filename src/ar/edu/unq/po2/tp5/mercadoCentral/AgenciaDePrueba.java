package ar.edu.unq.po2.tp5.mercadoCentral;

public class AgenciaDePrueba implements Agencia {
	
	//clase de prueba para testear registro de pago de facturas
	
	private boolean pago = false;

	@Override
	public void registrarPago(Factura factura) {
		pago = true;
		
	}
	
	public boolean estaPago() {
		return pago;
	}
}
