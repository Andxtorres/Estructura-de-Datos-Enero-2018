
public class NoRecursion {
	
	public static double consecutivos(double numero) {
		double resultado=0;
		for(int i=0;i<=numero;i++) {
			resultado=resultado+i;
		}
		return resultado;
	}
	
	public static double fibonacci(double numero) {
		if(numero<=1) {
			return numero;
		}
		double resultado=1;
		double prevResultado=1;
		for(int i=2;i<numero;i++) {
			double temp=resultado;
			resultado=resultado+prevResultado;
			prevResultado=temp;
		}
		return resultado;
	}
	
}
