
public class Main {
	
	public static void main(String args[]) {
		Tree<Integer> t= new Tree<>();
		t.insertNode(7);
		t.insertNode(10);
		t.insertNode(9);
		t.insertNode(11);
		t.insertNode(8);
		t.preOrder();
		System.out.println();
		t.posOrder();		
		System.out.println();
		t.inOrder();
		System.out.println();
		System.out.println(t.buscarNodo(90));
	}

}
