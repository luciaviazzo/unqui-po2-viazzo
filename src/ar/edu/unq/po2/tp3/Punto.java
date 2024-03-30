package ar.edu.unq.po2.tp3;

public class Punto {
	
	private int x;
	private int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public int getY() {
		return y;
	}
	
	public void setXY(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	//Suma otro punto y retorna un nuevo punto 
	public Punto sumarOtroPunto(Punto p) {
		Punto nuevoPunto = new Punto(x, y);
		nuevoPunto.setX(this.getX() + p.getX());
		nuevoPunto.setY(this.getY() + p.getY());
		return nuevoPunto;
	}
}
