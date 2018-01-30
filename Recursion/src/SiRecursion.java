
public class SiRecursion {
	
	
	public static double consecutivos(double numero) {
		if(numero==1) {
			return 1;
		}else {
			return numero+consecutivos(numero-1);
		}
		
	}
	public static double fibonacci(double numero) {
		if(numero<=1) {
			return numero;
		}else {
			return fibonacci(numero-1)+fibonacci(numero-2);
		}
		
	}
	
	
}
