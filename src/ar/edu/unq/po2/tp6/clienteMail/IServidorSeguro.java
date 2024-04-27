package ar.edu.unq.po2.tp6.clienteMail;

import java.util.List;

public interface IServidorSeguro extends IServidor{
	
	public float tazaDeTransferencia();

	public void resetear();
	
	public void realizarBackUp();
}
