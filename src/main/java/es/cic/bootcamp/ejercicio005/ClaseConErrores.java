package es.cic.bootcamp.ejercicio005;

import java.io.IOException;

public class ClaseConErrores {
	
	public void metodo1() {
		throw new NoImplementadoException("Esto es un error");
	}
	
	public int metodo2(boolean procesa) throws MotorException, IOException {
		if(procesa) {
			throw new MotorException("Esto lanza un error de motor", 5);
		} else {
			throw new IOException("Esto lanza un error de tipo IO");
		}
	}
}
