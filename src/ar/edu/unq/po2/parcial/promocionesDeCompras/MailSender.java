package ar.edu.unq.po2.parcial.promocionesDeCompras;

public interface MailSender {

	public void enviarMail(String mailDestinatario, String titulo, String cuerpo);
}
