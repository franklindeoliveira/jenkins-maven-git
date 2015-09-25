package br.com.jenkins;

public class Calculadora {
	
	private Integer numero1;
	private Integer numero2;
	
	public Calculadora(Integer numero1, Integer numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public Integer soma() {
		return numero1 + numero2;
	}

}