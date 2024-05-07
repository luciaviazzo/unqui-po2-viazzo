package ar.edu.unq.po2.tp6.banco;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTestCase {
	
	private Banco banco; //SUT
	private Cliente cliente; //DOC
	private SolicitudCredito solicitud; //DOC
    private List<Cliente> clientes;
    private List<SolicitudCredito> solicitudes;

	
	@BeforeEach
	void setUp() {
		clientes = new ArrayList<>();
        solicitudes = new ArrayList<>();
        banco = new Banco(clientes, solicitudes);
        solicitud = mock(SolicitudCredito.class);
        
        banco.addSolicitud(solicitud);
	}
	

	@Test
	void bancoReciveSolicitudDeClienteAceptableDesembolsa$100() {
		
		when(solicitud.esAceptable()).thenReturn(true);
		when(solicitud.getMonto()).thenReturn((double) 100);
		
		assertEquals(banco.calcularMontoTotalDesembolsable(), 100);
	}
	
	
	@Test
	void bancoReciveSolicitudDeClienteNoAceptableDesembolsa$0() {
		
		when(solicitud.esAceptable()).thenReturn(false);
		//when(solicitud.getMonto()).thenReturn((double) 100);
		
		assertEquals(banco.calcularMontoTotalDesembolsable(), 0);
	}

}
