package test;

import static org.junit.Assert.*;

import org.junit.Test;

import cuenta.Cuenta;

public class TestCuenta {

	@Test
	public void test() {
		Cuenta cuentaOrigen = new Cuenta(1000);
		Cuenta cuentaDestino = new Cuenta(0);

		cuentaOrigen.transferirMontoHacia(1000, cuentaDestino);

		double saldoActualDestino = cuentaDestino.verMontoDisponible();
		double saldoActualOrigen = cuentaOrigen.verMontoDisponible();

		// COMPRUEBO QUE SE HAYA ACREDITADO EL SALDO.
		assertEquals(1000, saldoActualDestino, 0);

		// COMPRUEBO QUE LA TRANSFERENCIA SEA COHERENTE ENTRE AMBAS PARTES.
		assertEquals(saldoActualOrigen + 1000, saldoActualDestino, 0);

		cuentaOrigen.transferirMontoHacia(10, cuentaDestino);
		saldoActualOrigen = cuentaOrigen.verMontoDisponible();
		
		// COMPRUEBO QUE SI EL SALDO A TRANSFERIR NO FUE MAYOR QUE EL
		// DISPONIBLE, IMPIDIENDO QUE SE ENCUENTRE EN NUMEROS NEGATIVOS.
		assertTrue(saldoActualOrigen >= 0);
	}	
}