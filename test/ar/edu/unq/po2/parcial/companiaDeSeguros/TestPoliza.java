package ar.edu.unq.po2.parcial.companiaDeSeguros;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestPoliza {
	
	private Poliza poliza;
	private BonificacionService bon;
	private Vigente vigente;
	private GastoAdministrativo ga;
	private Item item;
	

	@BeforeEach
	void setUp() throws Exception {
		
		bon = mock(BonificacionService.class);
		vigente = mock(Vigente.class);
		ga = mock(GastoAdministrativo.class);
		//item = mock(Item.class);
		
		poliza = new Poliza(bon);
		
		poliza.agregarGastoAdm(ga);
		poliza.agregarItem(item);
	}

	@Test
	void test() {
		
		poliza.setEstadoPoLiza(vigente);
		
		when(bon.codigoValido(123)).thenReturn(true);
		
		assertEquals(poliza.getGastosAdministrativos().size(), 1);
		
		poliza.aplicarBonificacion(123, "mail");
		
		assertEquals(poliza.getGastosAdministrativos().size(), 0);
		
	}

}
