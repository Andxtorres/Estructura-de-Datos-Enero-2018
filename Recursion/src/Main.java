
public class Main {

	public static void main(String[] args) {
		System.out.println("El resultado de suma de enteros consecutivos es: "
				+NoRecursion.consecutivos(8));
		System.out.println("El resultado de suma de enteros consecutivos recursivo es: "
				+SiRecursion.consecutivos(8));		
		System.out.println("El resultado de fibonacci es: "
				+NoRecursion.fibonacci(45));
		System.out.println("El resultado de fibonacci recursivo es: "
				+SiRecursion.fibonacci(45));		
	}

}
