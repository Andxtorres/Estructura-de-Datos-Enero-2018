import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Grafo<T extends Comparable<T>> {
	private List<Vertice<T>> vertices;
	private Queue<Vertice<T>> verticesQueue;
	private Stack<Vertice<T>> verticesStack;
	public Grafo() {
		verticesQueue= new LinkedList<>();
		verticesStack= new Stack<>();
		vertices= new ArrayList<>();
	}
	
	public void addVertice(T elemento) {
		boolean found= false;
		for (Vertice<T> vertice2 : vertices) {
			if(vertice2.getElemento().compareTo(elemento)==0) {
				found=true;
			}
		}
		if(!found) {
			vertices.add(new Vertice<>(elemento));
		}
	}
	
	public void addArista(T elemento1, T elemento2) {
		Vertice<T> temp1=null;
		Vertice<T> temp2= null;
		for (Vertice<T> vertice : vertices) {
			if(vertice.getElemento().compareTo(elemento1)==0) {
				temp1= vertice;
			}
		}
		
		for (Vertice<T> vertice : vertices) {
			if(vertice.getElemento().compareTo(elemento2)==0) {
				temp2= vertice;
			}			
		}
		if(temp1!=null && temp2!=null) {
			Arista<T> a= new Arista<>(temp1, temp2);
			temp1.addArista(a);
			temp2.addArista(a);	
		}else{
			System.out.println("NO puedes añadir la arista porque no existe alguno de los vertices");
		}
	}
	
	public void reiniciarVisitas() {
		for (Vertice<T> vertice : vertices) {
			vertice.setVisitado(false);
		}
	}
	
	public void recorreEnAnchura() {
		if(vertices.get(0)==null) {
			System.out.println("Tu grafo esta vacío");
		}else {
			verticesStack.add(vertices.get(0));
			while(verticesStack.size()>0) {
				Vertice<T> verticeAExplorar= verticesStack.pop();
				if(verticeAExplorar.isVisitado()==false){
					System.out.println(verticeAExplorar.getElemento());
				}
				verticeAExplorar.setVisitado(true);
				List<Arista<T>> aristasAVisitar= verticeAExplorar.getAristas();
				for (Arista<T> arista : aristasAVisitar) {
					if(arista.getVertice1().isVisitado()==false) {
						verticesStack.push(arista.getVertice1());
					}
					if(arista.getVertice2().isVisitado()==false) {
						verticesStack.push(arista.getVertice2());
					}					
				}
			}
		}
		reiniciarVisitas();
	}
	public void recorreEnProfundidad() {
		if(vertices.get(0)==null) {
			System.out.println("Tu grafo esta vacío");
		}else {
			verticesQueue.add(vertices.get(0));
			while(verticesQueue.size()>0) {
				Vertice<T> verticeAExplorar= verticesQueue.poll();
				if(verticeAExplorar.isVisitado()==false){
					System.out.println(verticeAExplorar.getElemento());
				}
				verticeAExplorar.setVisitado(true);
				List<Arista<T>> aristasAVisitar= verticeAExplorar.getAristas();
				for (Arista<T> arista : aristasAVisitar) {
					if(arista.getVertice1().isVisitado()==false) {
						verticesQueue.add(arista.getVertice1());
					}
					if(arista.getVertice2().isVisitado()==false) {
						verticesQueue.add(arista.getVertice2());
					}					
				}
			}
		}
		reiniciarVisitas();
	}	
}
