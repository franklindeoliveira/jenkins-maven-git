package br.com.jenkins;

import org.junit.Assert;
import org.junit.Test;

public class NumeroUtilTest {
	
	@Test
	public void deveSerPar() {
		Assert.assertEquals(NumeroUtil.isPar(4), true);
	}

}