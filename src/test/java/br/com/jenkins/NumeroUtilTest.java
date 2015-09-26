package br.com.jenkins;

import org.junit.Assert;
import org.junit.Test;

public class NumeroUtilTest {
	
	@Test
	public void deveSerPositivo() {
		Assert.assertTrue(NumeroUtil.isPositivo(4));
	}
	
	@Test
	public void naoDeveSerPositivo() {
		Assert.assertFalse(NumeroUtil.isPositivo(-1));
	}
	
	@Test
	public void zeroNaoDeveSerPositivo() {
		Assert.assertFalse(NumeroUtil.isPositivo(0));
	}
	
	@Test
	public void deveSerNegativo() {
		Assert.assertTrue(NumeroUtil.isNegativo(-1));
	}
	
	@Test
	public void naoDeveSerNegativo() {
		Assert.assertFalse(NumeroUtil.isNegativo(1));
	}
	
	@Test
	public void deveSerZero() {
		Assert.assertTrue(NumeroUtil.isZero(0));
	}
	
	@Test
	public void naoDeveSerZero() {
		Assert.assertFalse(NumeroUtil.isZero(1));
	}

}