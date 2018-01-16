
public class MyGenericBox<T extends Imprimelo> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	public String printBoxContent() {
		return t.imprimelo();
	}
	

}
