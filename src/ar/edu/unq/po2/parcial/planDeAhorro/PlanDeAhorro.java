package ar.edu.unq.po2.parcial.planDeAhorro;

public class PlanDeAhorro {

	private Cliente titular;
	private String marca;
	private String modelo;
	private int cuotasTotales;
	private int cuotasPagadas;
	private String cbu;
	private Fase fase;
	private Retribucion retribucion;
	
	
	public PlanDeAhorro(Cliente titular, String marca, String modelo, int cuotsTotales, Retribucion retribucion) {
		this.titular = titular;
		this.marca = marca;
		this.modelo = modelo;
		this.cuotasTotales = cuotasTotales;
		this.cuotasPagadas = 0;
		this.cbu = this.titular.getCBU();
		this.fase = new Creado();
		this.retribucion = retribucion;
	}
	
	
	//FASES
	public void pagarCuota() {
		fase.pagarCuota(this);
	}
	
	public void settearRetribucion(Retribucion retirbucion) {
		fase.setRetribucion(this, retribucion);
	}
	
	public void ejecutarRetribucion() {
		fase.ejecutarRetribucion(this, retribucion);
	}
	
	
	//Suma una cuota a las cuotasPagadas
	public void registrarCuota() {
		this.cuotasPagadas = cuotasPagadas + 1;
	}
	
	//Inidica si se pago la ultima cuota
	public boolean esUltimaCuota() {
		return (this.cuotasPagadas == this.cuotasTotales);
	}
	
	//Devuelve la cantidad de cuotas penidntes
	public int getcuotasPendientes() {
		return this.cuotasTotales - this.cuotasPagadas;
	}
	
	
	//SETTERS	
	public void setFase(Fase fase) {
		this.fase = fase;
	}
	
	public void setRetribucion(Retribucion retribucion) {
		this.retribucion = retribucion;
	}
	
	
	//GETTERS
	public Fase getFase() {
		return fase;
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
