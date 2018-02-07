
public class Main {
	public static void main(String args[]) {
		Stack<Integer> stackEnteros= new Stack<>();
		stackEnteros.push(3);
		stackEnteros.push(4);
		stackEnteros.push(5);
		stackEnteros.push(6);
		stackEnteros.push(7);
		stackEnteros.imprimir();
		System.out.println("Sancando elemento: "+stackEnteros.pop());
		stackEnteros.imprimir();
		System.out.println("Hacemos peek, elemento: "+stackEnteros.peek());
		stackEnteros.imprimir();
		Queue<Integer> queueEnteros= new Queue<>();
		queueEnteros.enqueue(3);
		queueEnteros.enqueue(4);
		queueEnteros.enqueue(5);
		queueEnteros.enqueue(6);
		queueEnteros.enqueue(7);
		queueEnteros.imprimir();
		System.out.println("Sancando elemento: "+queueEnteros.dequeue());
		queueEnteros.imprimir();
		
	}
}
