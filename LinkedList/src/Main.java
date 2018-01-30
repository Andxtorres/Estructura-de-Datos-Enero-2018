
public class Main {

	public static void main(String[] args) {
		ListaLigada<Integer> listaEnteros= new ListaLigada<>();
		listaEnteros.insertaAlFinal(2);
		listaEnteros.insertaAlFinal(3);
		listaEnteros.insertaAlFinal(4);
		listaEnteros.insertaAlFinal(5);
		listaEnteros.imprimir();
		listaEnteros.insertaAlFinal(6);
		listaEnteros.imprimir();
		ListaLigada<Comida> listaComida= new ListaLigada<>();
		listaComida.insertaAlFinal(new Comida("Arroz",30));
		listaComida.insertaAlFinal(new Comida("Papitas",30));
		listaComida.insertaAlFinal(new Comida("Molito",30));
		listaComida.insertaAlFinal(new Comida("Chilaquies",30));
		listaComida.imprimir();
		listaComida.insertarAlInicio(new Comida("Sopes",1000));
		try {
			listaComida.insertarEnPosicion(new Comida("Guajolota",2000),5);
		}catch(IndiceFueraDeRangoException e) {
			e.printStackTrace();
		}
		listaComida.imprimir();
		
	}

}
