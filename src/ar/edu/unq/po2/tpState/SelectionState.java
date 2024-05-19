package ar.edu.unq.po2.tpState;

public class SelectionState implements State{

	//Reproduce la cancion
	@Override
	public void play(Reproductor reproductor) {
		reproductor.playCancion();
	}

	@Override
	public void pause(Reproductor reproductor) {
		System.out.println("Esta en modo seleccion de canciones");
		
	}

	@Override
	public void stop(Reproductor reproductor) {
		// TODO Auto-generated method stub
		
	}

}
