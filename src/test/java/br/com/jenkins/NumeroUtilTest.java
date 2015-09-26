package br.com.jenkins;

import org.junit.Assert;
import org.junit.Test;

public class NumeroUtilTest {
	
	@Test
	public void deveSerMaiorQueZero() {
		Assert.assertTrue(NumeroUtil.isMaiorQueZero(1));
	}
	
	@Test
	public void naoDeveSerMaiorQueZero() {
		Assert.assertFalse(NumeroUtil.isMaiorQueZero(-1));
	}
	
	@Test
	public void deveSerMenorQueZero() {
		Assert.assertTrue(NumeroUtil.isMenorQueZero(-1));
	}
	
	@Test
	public void naoDeveSerMenorQueZero() {
		Assert.assertFalse(NumeroUtil.isMenorQueZero(1));
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