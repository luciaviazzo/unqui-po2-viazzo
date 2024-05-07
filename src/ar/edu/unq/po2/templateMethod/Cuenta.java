package ar.edu.unq.po2.templateMethod;

import java.util.List;

public abstract class Cuenta {
	
	private List<Movimiento> movimientos;
	private double saldo;
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//Final para que ninguna subclase la pueda modificar (sobreescribir). Es mi template method
	public final void extraer(double monto) {
		double comision = this.calcularComision(monto);
		if (this.haySaldoSuficiente(monto, comision)) {
			this.actualizarSaldo(monto, comision);
			this.registrarMovimiento(new Movimiento("Extraccion", this.getSaldo(), monto));
		}
		if (monto > 100) informar(); //HOOK
	}
	
	
	protected void informar() { //HOOK
		
	};

	
	public abstract double calcularComision(double monto);
	
	
	public boolean haySaldoSuficiente(double monto, double comision) {
		return this.getSaldo() > (monto + comision);
	}
	
	
	public void actualizarSaldo(double monto, double comision) {
		this.setSaldo(this.getSaldo() - (monto - comision));
	}
	
	
	public void registrarMovimiento(Movimiento movimiento) {
		movimientos.add(movimiento);
	}
	
	//4-Y si quisiera modificar la descripción que se imprime en cada caso?
	//public abstract void getDescripcion();
	//Cada clase lo sobreescribe
	
	//5-Y si quisiera incorporar la posibilidad de que ciertas cuentas informen al BancoCentral de cada operación que supere los
	//10.000? Por defecto las cuentas no informan.
	//Lo resulvo con un metodo HOOK 

}


//1. Quiero enviar un mail a la gerencia ante cada extracción que supere los 50.000
//a. Donde tengo que modificar? 
//Solo la superclase 

//2. Aparece un nuevo tipo de cuenta?
//a. Tengo que copiar y pegar código?
//No, hereda de la superclase e implementa solo los metodo abstractos

//3. Quiero eliminar un nuevo tipo de cuenta
//a. Tengo que modificar código existente?
//Nada, puedo elminarlo o modificarlo sin que afecte al resto de mi programa

