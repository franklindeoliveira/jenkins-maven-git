package br.com.jenkins;

public class NumeroUtil {
	
	public static boolean isMenorQueZero(Integer numero) {
		return numero < 0;
	}
	
	public static boolean isMaiorQueZero(Integer numero) {
		return numero > 0;
	}
	
	public static boolean isZero(Integer numero) {
		return numero == 0;
	}

}