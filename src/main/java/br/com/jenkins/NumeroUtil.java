package br.com.jenkins;

abstract class NumeroUtil {
	
	public static boolean isPositivo(Integer numero) {
		if (isZero(numero)) return false;
		return numero > 0;
	}
	
	public static boolean isNegativo(Integer numero) {
		return !isPositivo(numero);
	}
	
	public static boolean isZero(Integer numero) {
		return numero == 0;
	}

}