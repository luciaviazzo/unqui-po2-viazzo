package ar.edu.unq.po2.parcial.promocionesDeCompras;

import java.time.LocalDate;

public class Fidelizado extends Periodo{
	
	private MailSender enviadorDeMails;

	@Override
	public double calcularDescuentos(double monto) {
		return 0;
	}

	@Override
	public void realizarCompra(Cliente cliente) {
		
		//Obtiene la fecha de ayer
		LocalDate ayer = LocalDate.now().minusDays(1);
		
		//Compara la fecha de la ultima compra con la fecha de ayer 
		if(cliente.getUltimaCompra().getFecha().equals(ayer)) {
			enviadorDeMails.enviarMail(cliente.getMail(), "Gracias por elegirnos", "Gracias por permanecer con nosotros");
		}
	}
}
