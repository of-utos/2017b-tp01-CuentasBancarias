package cuenta;

/**
 * Clase que administra el monto de una cuenta. <br>
 */
public class Cuenta {
	/**
	 * Monto de la cuenta. <br>
	 */
	private double monto;

	/**
	 * Crea una cuenta con su monto disponible. <br>
	 * 
	 * @param monto
	 *            Monto disponible. <br>
	 */
	public Cuenta(final double monto) {
		this.monto = monto;
	}

	/**
	 * Transfiere un monto de una cuenta a otra. <br>
	 * 
	 * @param monto
	 *            Monto a transferir. <br>
	 * @param cuentaDestino
	 *            Cuenta a la que transfiere. <br>
	 */
	public void transferirMontoHacia(final double monto, final Cuenta cuentaDestino) {
		cuentaDestino.asignarMonto(monto);
		this.monto -= monto;
	}

	/**
	 * Devuelve el monto disponible de la cuenta. <br>
	 * 
	 * @return Monto disponible en la cuenta. <br>
	 */
	public double verMontoDisponible() {
		return monto;
	}

	/**
	 * Asigna una nueva cantidad al monto. <br>
	 * 
	 * @param monto
	 *            Monto a asignar. <br>
	 */
	private void asignarMonto(final double monto) {
		this.monto += monto;
	}
}
