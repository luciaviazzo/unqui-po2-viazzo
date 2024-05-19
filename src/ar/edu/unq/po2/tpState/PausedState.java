package ar.edu.unq.po2.tpState;

public class PausedState implements State{

	@Override
	public void play(Reproductor reproductor) {
		System.out.println("No esta en modo seleccion de canciones");
	}

	@Override
	public void pause(Reproductor reproductor) {
		reproductor.playCancion();
		
	}

	@Override
	public void stop(Reproductor reproductor) {
		// TODO Auto-generated method stub
		
	}

}
