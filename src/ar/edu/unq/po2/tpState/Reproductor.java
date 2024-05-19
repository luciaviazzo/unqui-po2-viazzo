package ar.edu.unq.po2.tpState;

public class Reproductor {

	private State estado;
	private Cancion cancion;
	
	public void setState(State estado) {
		this.estado = estado;
	}
	
	public void play() {
		estado.play(this);
	}
	
	public void pause() {
		estado.pause(this);
	}
	
	public void stop() {
		estado.stop(this);
	}
	
	//Reproduce la cancion y cambia a estado reproduciendo
	public void playCancion() {
		cancion.play();
		this.setState(new PlayingState());
	}
	
	
	//Pause la cancion y cambia a estado pausado
	public void pauseCancion() {
		cancion.pause();
		this.setState(new PausedState());
	}
}
