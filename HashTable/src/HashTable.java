
public class HashTable<K,V> {
	
	private Entry<K,V>[] table;
	
	public HashTable(int size) {
		table= new Entry[size];
	}
	
	public void insertarEntrada(K key,V value) {
		Entry<K,V> entry= new Entry<K,V>(key, value);
		int position= getHashPosition(key);
		if(table[position]!=null) {
			table[position].insertarAlFinal(key, value);
		}else {
			table[position]=entry;
		}
	}
	
	public void imprimeTabla() {
		for(int i=0;i<table.length;i++) {
			System.out.println("["+i+".- "+table[i]+"]");
		}
	}
	
	private int getHashPosition(K key) {
		return key.hashCode()%table.length;
	}
}
