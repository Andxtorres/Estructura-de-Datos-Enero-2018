
public class Ordenamiento<T extends Comparable<T>>{
	
	public LinkedList<T> bubble(LinkedList<T> aOrdenar) {
		for(int i=0;i<aOrdenar.contarElementos()-1;i++) {
			boolean swapped=false;
			for(int j=0;j<aOrdenar.contarElementos()-1;j++) {
				if(aOrdenar.encontrarElementoEn(j).compareTo(aOrdenar.encontrarElementoEn(j+1))>0) {
					aOrdenar.intercambiar(j, j+1);
					swapped=true;
				}
			}
			if(swapped==false) {
				break;
			}
		}
		return aOrdenar;
	}
	
	public LinkedList<T> selectionSort(LinkedList<T> list){
		for(int i=0;i<list.contarElementos()-1;i++) {
			int smallest=i;
			for(int j=i+1;j<list.contarElementos();j++) {
				if(list.encontrarElementoEn(j).compareTo(list.encontrarElementoEn(smallest))<0) {
					smallest=j;
				}
			}
			list.intercambiar(i, smallest);
		}
		return list;
	}

	public LinkedList<T> insertionSort(LinkedList<T> list){
		int i=1;
		while(i<list.contarElementos()) {
			int j=i;
			while(j>0&&(list.encontrarElementoEn(j-1).compareTo(list.encontrarElementoEn(j))>0)) {
				list.intercambiar(j, j-1);
				j--;
			}
			i++;
		}
		return list;
	}
	
	public LinkedList<T> quickSort(LinkedList<T> list){
		return quickSortRec(list,0,list.contarElementos()-1);
	}
	public LinkedList<T> quickSortRec(LinkedList<T> list,int izquierda,int derecha){
		int pivote=(izquierda+derecha)/2;
		int i= izquierda;
		int j=derecha;
		while(i<j) {
			while(list.encontrarElementoEn(i).compareTo(list.encontrarElementoEn(pivote))<0) {
				i++;
			}
			while(list.encontrarElementoEn(j).compareTo(list.encontrarElementoEn(pivote))>0) {
				j--;
			}
			if(i<=j) {
				if(i!=j) {
					list.intercambiar(i, j);
				}
				i++;
				j--;
			}
			
		}
		if(izquierda<j) {
			quickSortRec(list,izquierda,j);
		}
		if(i<derecha) {
			quickSortRec(list,i,derecha);
		}
		return list;
	}
	
	public LinkedList<T> mergeSort(LinkedList<T> lista){
		lista.setInicio(mergeSortRec(lista.getInicio()));
		return lista; 
	}
	
	public Nodo<T> mergeSortRec(Nodo<T> inicio){
		Nodo<T> inicioAnterior= inicio;
		int mid= getTamanioDesdeNodo(inicio)/2;
		imprimir(inicio);
		System.out.println("Mid: "+mid);
		if(inicio.getSiguiente()==null) {
			return inicio;
		}
		while(mid-1>0) {
			inicioAnterior=inicioAnterior.getSiguiente();
			mid--;
		}
		Nodo<T> nuevoInicio= inicioAnterior.getSiguiente();
		inicioAnterior.setSiguiente(null);
		inicioAnterior=inicio;
		Nodo<T> temp1=mergeSortRec(inicioAnterior);
		Nodo<T> temp2= mergeSortRec(nuevoInicio);
		imprimir(temp1);
		imprimir(temp2);
		return merge(temp1,temp2);
	} 
	
	public Nodo<T> merge(Nodo<T> a, Nodo<T> b){
		Nodo<T> resultado=null;


		if(a==null) {
			return b;
		}
		if(b==null) {
			return a;
		}
		System.out.println("A: "+a.getElemento());
		System.out.println("B: "+b.getElemento());		
		if(a.getElemento().compareTo(b.getElemento())>0) {
			resultado=b;
			resultado.setSiguiente(merge(a,b.getSiguiente()));
		}
		if(a.getElemento().compareTo(b.getElemento())<0){
			resultado=a;
			resultado.setSiguiente(merge(a.getSiguiente(),b));
		}
		System.out.println("");
		return resultado;
	}
	
	public int getTamanioDesdeNodo(Nodo<T> nodo) {
		int tamanio= 0;
		Nodo<T> temp=nodo;
		while(temp!=null) {
			tamanio++;
			temp= temp.getSiguiente();
		}
		return tamanio;
	}
	
	
	public void imprimir(Nodo<T> inicio) {

		int contador=0;
		Nodo<T> temp= inicio;
		while(temp!=null) {
			
			System.out.print("["+contador+".- "+temp.getElemento().toString()+"]-->");
			contador++;
			temp= temp.getSiguiente();
		}
		
		System.out.println();
	}

}
