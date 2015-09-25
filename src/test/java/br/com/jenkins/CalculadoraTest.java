package br.com.jenkins;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void somaDeDoisNumerosInteiros() {
		Calculadora calculadora = new Calculadora(1, 1);
		Assert.assertEquals(calculadora.soma(), 2, Double.MIN_VALUE);
	}

}