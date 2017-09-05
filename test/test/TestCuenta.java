package test;

import static org.junit.Assert.*;

import org.junit.Test;

import cuenta.Cuenta;

public class TestCuenta {

	@Test
	public void test() {
		Cuenta cuentaOrigen = new Cuenta();
		Cuenta cuentaDestino = new Cuenta();

		cuentaOrigen.transferirMontoHacia(1000, cuentaDestino);

		double saldoActualDestino = cuentaDestino.monto;
		double saldoActualOrigen = cuentaDestino.monto;
		
		// COMPRUEBO QUE SE HAYA ACREDITADO EL SALDO.
		assertEquals(1000, saldoActualDestino, 0);
		
		// COMPRUEBO QUE LA TRANSFERENCIA SEA COHERENTE ENTRE AMBAS PARTES.
		assertEquals(saldoActualOrigen + 1000, saldoActualDestino - 1000, 0);
	}
}