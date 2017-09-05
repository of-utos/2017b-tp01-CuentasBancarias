package cuenta;

public class Cuenta {

	private double monto;

	public Cuenta(double monto) {
		this.monto = monto;
	}

	public void transferirMontoHacia(double monto, Cuenta cuentaDestino) {
		cuentaDestino.asignarMonto(monto);
		this.monto -= monto;
	}

	public double getMonto() {
		return monto;
	}

	private void asignarMonto(double monto) {
		this.monto += monto;
	}
}
