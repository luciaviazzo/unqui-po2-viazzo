package ar.edu.unq.po2.parcial.empresaDeViajes;

import java.time.LocalDate;

public class AdapterOpInternational implements IOperator{
	
	private IOpInternational opInternational;

	@Override
	public float taxes(String aeroportName, LocalDate date) {
		return this.opInternational.currentTax(date, aeroportName);
	}
}
