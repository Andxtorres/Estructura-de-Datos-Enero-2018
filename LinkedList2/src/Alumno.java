
public class Alumno implements Comparable<Alumno> {
	private String matricula;
	private String nombre;

	public Alumno(String matricula) {
		this.matricula = matricula;
	}
	public Alumno(String matricula, String nombre) {
		this.matricula = matricula;
		this.nombre = nombre;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int compareTo(Alumno a1) {
		return matricula.compareTo(a1.getMatricula());
	}
	
	
}
