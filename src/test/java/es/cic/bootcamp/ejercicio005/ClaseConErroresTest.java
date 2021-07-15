package es.cic.bootcamp.ejercicio005;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClaseConErroresTest {

	private ClaseConErrores cut;
	
	@BeforeEach
	void setUp() throws Exception {
		this.cut = new ClaseConErrores();
	}

	@Test
	void testMetodo1() {
		cut.metodo1();
	}

	@Test
	void testMetodo2() throws IOException {
		
		try {
			cut.metodo2(false);
		} catch (MotorException e) {			
			e.printStackTrace();
			
		}
	}
	
	@Test
	void testMetodo2EncapsulandoElError() throws CocheException {
		try {
			cut.metodo2(false);
		} catch (MotorException | IOException e) {
			throw new CocheException("El coche no arranca", e);
		}
	}

}
