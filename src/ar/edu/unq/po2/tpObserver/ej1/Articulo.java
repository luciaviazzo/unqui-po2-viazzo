package ar.edu.unq.po2.tpObserver.ej1;

import java.util.List;

public class Articulo {

	private String titulo;
	private List<String> autores;
	private List<String> filiaciones; 
	private String tipo;
	private String lugarDePublicacion;
	private List<String> palabrasClaves;
	
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}
	
	public List<String> getAutores() {
		return autores;
	}
	
	public List<String> getFiliaciones() {
		return filiaciones;
	}

	public List<String> getPalabrasClaves() {
		return palabrasClaves;
	}
}
