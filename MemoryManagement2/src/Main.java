
public class Main {

	public static void main(String[] args) {
		Animal a1= new Animal("Dog");
		Animal a2= new Animal("Cat");
		Animal a3= new Animal("Cow");
		tricky(a1,a2,a3);
		System.out.println("Animals are: "+a1.name+" "+a2.name+" "+a3.name);
	}
	public static void tricky(Animal a1, Animal a2,Animal a3) {
		Animal temp1= a1;
		a1=a3;
		a2=a1;
		a3= temp1;
		a3.name="Bird";
		a2.name="Lion";
		temp1.name="Tiger";
	}

}
