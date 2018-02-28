
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
	
	
	
	
	
	
	

}
