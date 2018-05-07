
public class Main {

	public static void main(String[] args) {
		Grafo<String> g= new Grafo<>();
		g.addVertice("A");
		g.addVertice("B");
		g.addVertice("C");
		g.addVertice("D");
		g.addVertice("E");
		g.addVertice("F");
		g.addVertice("G");
		g.addArista("A", "B");
		g.addArista("A", "C");
		g.addArista("A", "D");
		g.addArista("B", "E");
		g.addArista("E", "G");
		g.addArista("G", "F");
		g.addArista("C", "F");
		g.recorreEnAnchura();
	}

}
