package ar.edu.unq.po2.tp3;

public class Cuadrado {
	
	private int alto;
	private Punto puntoInferiorIzquierdo;
	
	
	public Cuadrado(int alto, Punto puntoInferiorIzquierdo) {
		this.alto = alto;
		this.puntoInferiorIzquierdo = puntoInferiorIzquierdo;
	}
	
	
	public int getAlto() {
		return alto;
	}
	
	
	public Punto getPuntoInferiorIzquierdo() {
		return puntoInferiorIzquierdo;
	}
	
	public Punto puntoInferiorDerecho() {
		return this.getPuntoInferiorIzquierdo().sumarXeY(this.getAlto(), 0);
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
		return (this.getAlto() * this.getAlto());
	}
	
	public int perimetro() {
		return (4 * this.getAlto());
	}
}
