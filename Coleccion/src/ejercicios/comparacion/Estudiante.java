package ejercicios.comparacion;

public class Estudiante  implements Comparable<Estudiante>{
	
	private String nombre;
	private int edad;
	private int curso;
	public Estudiante(String nombre, int edad, int curso) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;
	}
	
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", curso=" + curso + "]";
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	
	public int compareTo(Estudiante e) {
		return this.nombre.compareTo(e.nombre);
	}
	
	
	
	
	
	

}
