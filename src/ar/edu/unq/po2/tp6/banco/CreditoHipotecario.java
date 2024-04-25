package ar.edu.unq.po2.tp6.banco;

public class CreditoHipotecario extends SolicitudCredito{

	public CreditoHipotecario(Cliente solicitante, double monto, int plazoEnMeses) {
		super(solicitante, monto, plazoEnMeses);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esAceptable() {
		// TODO Auto-generated method stub
		return false;
	}

}
