package util;

public class CurrencyConverter {
	
	public static final double IOF = 1.06;
	
	public static double cotacao;
	public static double dolar;
	public static double total;
	
	public static double calcula() {
		return total = dolar * IOF * cotacao;
	}

}
