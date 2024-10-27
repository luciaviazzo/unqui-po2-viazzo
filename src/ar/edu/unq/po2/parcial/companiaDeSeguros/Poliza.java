package ar.edu.unq.po2.parcial.companiaDeSeguros;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Poliza {

	private BonificacionService bonificacion;
	private Fase estado;
	private List<Item> inventario;
	private List<GastoAdministrativo> gastosAdm;
	
	public Poliza(BonificacionService bonificacion) {
		this.bonificacion = bonificacion;
		this.inventario = new ArrayList<Item>();
		this.gastosAdm = new ArrayList<GastoAdministrativo>();
		}
	
	
	public List<GastoAdministrativo> getGastosAdministrativos() {
		return gastosAdm;
	}
	public List<Item> getInventario() {
		return this.inventario;
	}
	
	
	public double montoAsegurado() {
		return this.inventario.stream().mapToDouble(i -> i.valorDeItem()).sum();
	}
	
	public double precioAPagar() {
		return (montoAsegurado() * 0.075) + totalGastosAdm();
	}
	
	public double totalGastosAdm() {
		return this.gastosAdm.stream().mapToDouble(g -> g.getMonto()).sum();
	}

	public void agregarGastoAdm(GastoAdministrativo gastoAdm) {
		this.gastosAdm.add(gastoAdm);
	}
	public void eliminarGastoAdministrativo(GastoAdministrativo gastoAdm){
		this.gastosAdm.remove(gastoAdm);
	}
	
	public void agregarItem(Item item) {
		this.inventario.add(item);
	}
	
	public void setEstadoPoLiza(Fase estado) {
		this.estado = estado;
	}
	public Fase getEstadoPoliza() {
		return this.estado;
	}
	
	public void aplicarDescuento() {
		getEstadoPoliza().aplicarDescuento(this);
	}
	
	
	public void aplicarBonificacion(int codigo, String email) {
		if(bonificacion.codigoValido(codigo)) {
		aplicarDescuento();
		bonificacion.anularCodigo(codigo);
		bonificacion.notificarTitular(email, codigo);
		}
	}
	
	public GastoAdministrativo gastoAdministrativoMasAlto() {
		return this.getGastosAdministrativos().stream()
											  .max(Comparator.comparing(GastoAdministrativo::getMonto)).orElse(null);
}


	public void eliminarGA() {
		this.getGastosAdministrativos().clear();
	}

}
