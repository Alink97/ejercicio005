package es.cic.bootcamp.ejercicio005;

public class MotorException extends Exception {

	private int potencia;
	
	public MotorException() {
		super();
	}

	public MotorException(String message, Throwable cause, int potencia) {
		super(message, cause);
		this.potencia = potencia;
	}

	public MotorException(String message, int potencia) {
		super(message);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

}
