package ar.edu.unq.po2.tp6.clienteMail;

import java.util.ArrayList;
import java.util.List;

public class ServidorPop implements IServidor{

	
	@Override
	public void conectar(String nombreUsuario, String passusuario) {
		// TODO Auto-generated method stub
		
	}

	
	public List<Correo> recibirNuevos(String nobre, String pass) {
		List<Correo> retorno = new ArrayList<Correo>();
		return retorno;
	}
	
	/*
	public void enviar(Correo correo) {
		
	}*/
}
