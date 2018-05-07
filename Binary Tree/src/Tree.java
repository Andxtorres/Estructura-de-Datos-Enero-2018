
public class Tree<T extends Comparable<T>> {
	
	private Node<T> root;

	public Node<T> getRoot() {
		return root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}
	
	public void insertNode(T elemento){
		Node<T> newNode= new Node<>(elemento);
		root=insertNodeRec(root, newNode);
	}
	
	private Node<T> insertNodeRec(Node<T> parent, Node<T> newNode){
		if(parent==null) {
			return newNode;
		}else if(newNode.getElement().compareTo(parent.getElement())>0) {
			parent.setRight(insertNodeRec(parent.getRight(),newNode));
		}else if(newNode.getElement().compareTo(parent.getElement())<0) {
			parent.setLeft(insertNodeRec(parent.getLeft(),newNode));
		}
		return parent;
	}
	
	public void preOrder() {
		preOrderRec(root);
	}
	
	private void preOrderRec(Node<T> node) {
		if(node!=null){
			System.out.print(node.getElement().toString()+",");
			preOrderRec(node.getLeft());
			preOrderRec(node.getRight());
		}
		
	}
	public void posOrder() {
		posOrderRec(root);
	}
	
	private void posOrderRec(Node<T> node) {
		if(node!=null){
			posOrderRec(node.getLeft());
			posOrderRec(node.getRight());

			System.out.print(node.getElement().toString()+",");
		}
		
	}
	public void inOrder() {
		inOrderRec(root);
	}
	
	private void inOrderRec(Node<T> node) {
		if(node!=null){
			inOrderRec(node.getLeft());

			System.out.print(node.getElement().toString()+",");
			inOrderRec(node.getRight());

		}
		
	}	
	
	public Node<T> buscarNodo(T lookingFor){
		return buscarNodoRec(root, lookingFor);
	}
	
	private Node<T> buscarNodoRec(Node<T> node,T lookingFor){
		if(node==null) {
			return null;
		}
		if(lookingFor.compareTo(node.getElement())==0) {
			return node;
		}else if(lookingFor.compareTo(node.getElement())>0) {
			return buscarNodoRec(node.getRight(),lookingFor);
		}else {
			return buscarNodoRec(node.getLeft(),lookingFor);
		}
	}

}
