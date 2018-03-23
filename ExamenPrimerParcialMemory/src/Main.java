
public class Main {
	
	public static void main(String args[]) {
		Videojuego v1= new Videojuego("FIFA");
		Videojuego v2= new Videojuego("HALO");
		tricky(v1,v2);
		System.out.println(v1.nombre+" "+v2.nombre);
		
	}
	
	public static void tricky(Videojuego videoJ1, Videojuego videoJ2) {
		videoJ1.nombre="LoL";
		videoJ2.nombre="WoW";
		Videojuego temp= videoJ1;
		temp.nombre="God of war";
		videoJ1.nombre="Madden";
		videoJ2=temp;
		temp=videoJ1;
	}
	
}
