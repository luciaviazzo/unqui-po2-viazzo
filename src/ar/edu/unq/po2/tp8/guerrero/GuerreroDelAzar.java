package ar.edu.unq.po2.tp8.guerrero;

public class GuerreroDelAzar implements IGuerrero{
	
	
	private int puntosAtaque;
	private int puntosVida;
	private IMoneda moneda;
	
	
	public GuerreroDelAzar(int puntosAtaque, int puntosVida, IMoneda moneda) {
		this.puntosAtaque = puntosAtaque;
		this.puntosVida = puntosVida;
		this.moneda = moneda;
	}
	
	
	public int getPuntosVida() {
			return puntosVida;
	}

	
	@Override
	public void atacar(IGuerrero otroGuerrero) {
		if(moneda.esCara()) {
			otroGuerrero.descontarVida(this.puntosAtaque);
		} 
		if(moneda.esCruz()) {
			this.descontarVida(this.puntosAtaque);
		}
	}

	
	@Override
	public void descontarVida(int puntos) {
		puntosVida = puntosVida - puntos;
	}

}
