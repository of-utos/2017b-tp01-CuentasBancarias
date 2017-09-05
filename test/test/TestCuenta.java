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

		double saldoActual = cuentaDestino.monto;

		assertEquals(1000, saldoActual, 0);
	}

}
