package ar.edu.unq.po2.tp6.clienteMail;

import java.util.ArrayList;

public class ClienteMail {
	
	private ServidorPop servidor;
	private String nombreUsuario;
	private String passUsuario;
	private ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	
	
	public ClienteMail(ServidorPop servidor, String nombreUsuario, String passUsuario){
		this.servidor = servidor;
		this.nombreUsuario = nombreUsuario;
		this.passUsuario = passUsuario;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectar();
	}
	
	
	//Manda un mensaje a Servidor, que verifica que el usuario sea valido y establece la conexion
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passUsuario);
	}
	
	
	//Borra el correo dado de la lista de inbox y lo agrega a la lista de borrados
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.add(correo);
	}
	
	
	//Devuelve la cantidad de correos de la lista de borrados
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	
	//Devuelve la cantidad de correos de la lista de inbpx
	public int contarInbox(){
		return this.inbox.size();
	}
	
	
	//Elimina el correo dado de la lista de borrados
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	
	//Le manda un mensaje al serivdor 
	//El servidor le responde con una lista de los corres nuevos
	//Los alamcena en la lista de inbox
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passUsuario);
	}
	
	
	//Crea un nuevo correo, y lo envia a traves del servidor
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		/*this.servidor.enviar(correo);*/
	}
}
