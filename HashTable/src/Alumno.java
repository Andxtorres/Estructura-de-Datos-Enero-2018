
public class Alumno {
	private String nombre;
	private String matricula;
	private double calificacion;
	
	public Alumno(String nombre, String matricula,double calificacion) {
		this.nombre = nombre;
		this.matricula = matricula;
		this.calificacion=calificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public boolean equals(Alumno a) {
		return a.getMatricula().equals(matricula);
	}
	public int hashCode() {
		String matriculaSinLaA= matricula.substring(1, matricula.length());
		return Integer.parseInt(matriculaSinLaA); 
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	public String toString() {
		return "("+matricula+" "+nombre+" "+calificacion+")";
	}
	
}
