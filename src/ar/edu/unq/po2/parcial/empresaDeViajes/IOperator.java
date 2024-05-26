package ar.edu.unq.po2.parcial.empresaDeViajes;

import java.time.LocalDate;

public interface IOperator {

	public float taxes(String aeroportName, LocalDate date);
}
