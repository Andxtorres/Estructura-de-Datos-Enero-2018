
public class Profesor implements Comparable<Profesor> {
	private String nomina;
	private String nombre;
	public Profesor(String nomina, String nombre) {
		this.nomina = nomina;
		this.nombre = nombre;
	}
	public String getNomina() {
		return nomina;
	}
	public void setNomina(String nomina) {
		this.nomina = nomina;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int compareTo(Profesor profesor) {
		return nomina.compareTo(profesor.getNomina());
	}
	
	public boolean equals(Profesor profesor) {
		return nomina.equals(profesor.getNomina());
	}
	
}
