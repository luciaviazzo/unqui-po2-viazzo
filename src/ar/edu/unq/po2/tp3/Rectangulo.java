package ar.edu.unq.po2.tp3;

public class Rectangulo {

	private int alto;
	private int ancho;
	private Punto puntoInferiorIzquierdo;
	
	
	public Rectangulo(int alto, int ancho, Punto puntoInferiorIzquierdo) {
		this.alto = alto;
		this.ancho = ancho;
		this.puntoInferiorIzquierdo = puntoInferiorIzquierdo;
	}
	
	
	public int getAlto() {
		return alto;
	}
	
	public int getAncho() {
		return ancho;
	}
	
	
	public Punto getPuntoInferiorIzquierdo() {
		return puntoInferiorIzquierdo;
	}
	
	public Punto puntoInferiorDerecho() {
		return this.getPuntoInferiorIzquierdo().sumarXeY(this.getAncho(), 0);
	}
	
	public Punto puntoSuperiorIzquierdo() {
		return this.getPuntoInferiorIzquierdo().sumarXeY(0, this.getAlto());
	}
	
	public Punto puntoSuperiorDerecho() {
		return this.puntoInferiorDerecho().sumarXeY(0, this.getAlto());
	}
	
	
	public void crear() {
		this.getPuntoInferiorIzquierdo();
		this.puntoInferiorDerecho();
		this.puntoSuperiorIzquierdo();
		this.puntoSuperiorDerecho();
	}	
	
	
	public int area() {
		return (this.getAlto() * this.getAncho());
	}
	
	public int perimetro() {
		return ((2 * this.getAlto()) + (2 * this.getAncho()));
	}
}
