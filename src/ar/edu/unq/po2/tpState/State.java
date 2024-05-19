package ar.edu.unq.po2.tpState;

public interface State {

	public void play(Reproductor reproductor);
	
	public void pause(Reproductor reproductor);

	public void stop(Reproductor reproductor);

}
