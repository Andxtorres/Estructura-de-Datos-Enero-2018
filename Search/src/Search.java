public class Search <T extends Comparable<T>>{
	
	
	public int linearSearch(T[] array,T lookingFor) {
		int contador=1;
		for(int i=0;i<array.length;i++) {
			System.out.println("Paso: "+contador++);
			if(lookingFor.compareTo(array[i])==0) {
				return i;
			}
		}
		return -1;
	}
	
	public int binarySearch(T[] array,T lookingFor) {
		int contador=1;
		int start=0;
		int end=array.length-1;
		while(start<=end){
			System.out.println("Paso: "+contador++);
			int mid=(start+end)/2;
			if(array[mid].compareTo(lookingFor)==0) {
				return mid;
			}else if(array[mid].compareTo(lookingFor)<0) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}

}
