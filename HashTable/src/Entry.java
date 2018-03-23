
public class Entry<K,V> {
	private K key;
	private V value;
	private Entry<K,V> siguiente;
	
	public Entry(K key, V value) {
		this.key=key;
		this.value=value;
	}
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public Entry<K, V> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Entry<K, V> siguiente) {
		this.siguiente = siguiente;
	}
	public void insertarAlFinal(K key,V value) {
		Entry<K,V> newEntry=new Entry<K, V>(key, value);
		Entry<K,V> temp= this;
		while(temp.getSiguiente()!=null) {
			temp=temp.getSiguiente();
		}
		temp.setSiguiente(newEntry);
	}
	public String toString() {
		String resultado="";
		resultado=resultado+" "+value.toString()+",";
		Entry<K,V> temp= siguiente;
		while(temp!=null) {
			resultado=resultado+" "+temp.getValue().toString()+",";
			temp=temp.getSiguiente();
		}
		return resultado;
	}
	
	
}
