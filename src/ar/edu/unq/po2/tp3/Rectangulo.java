package ar.edu.unq.po2.tp3;

public class Rectangulo extends Cuadrado{
	
	private int ancho;
	
	public Rectangulo(int alto, Punto puntoInferiorIzquierdo, int ancho) {
		super(alto, puntoInferiorIzquierdo);
		this.ancho = ancho;
	}

	
	public int getAncho() {
		return ancho;
	}

	@Override
	public Punto puntoInferiorDerecho() {
		return this.getPuntoInferiorIzquierdo().sumarXeY(this.getAncho(), 0);
	}
	
	@Override
	public int area() {
		return (this.getAlto() * this.getAncho());
	}
	
	@Override
	public int perimetro() {
		return ((2 * this.getAlto()) + (2 * this.getAncho()));
	}
}
