package ar.edu.unq.po2.parcial.companiaDeSeguros;

public interface BonificacionService {

	public boolean codigoValido(int codigo);
	public void anularCodigo(int codigo);
	public void notificarTitular(String email, int codigo);
}
