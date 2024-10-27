package ar.edu.unq.po2.parcial.planDeAhorro;

public class PlanDeAhorro {

	private Cliente titular;
	private String marca;
	private String modelo;
	private int cuotas;
	private String cbu;
	private Estado estado;
	private Retribucion retribucion;
	
	public PlanDeAhorro(Cliente titular, String marca, String modelo, int cuotas, String cbu, Retribucion retribucion) {
		this.titular = titular;
		this.marca = marca;
		this.modelo = modelo;
		this.cuotas = cuotas;
		this.cbu = cbu;
		this.estado = new Creado();
		this.retribucion = retribucion;
	}
	
	public int getCuotas() {
		return cuotas;
	}
	
	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void elegirRetribucion(Retribucion retribucion) {
		estado.settearRetribucion(this, retribucion);
	}

	public void pagarCuota() {
		estado.pagarCuota(this);
	}
	
	public void descontarCuota() {
		cuotas -= 1;
	}

	public void setRetribucion(Retribucion retribucion) {
		this.retribucion = retribucion;
	}
	
	public void ejecutarRetribucion() {
		estado.ejecutarRetribucion(this, retribucion);
	}

	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}

	public String getCBU() {
		return cbu;
	}
}
