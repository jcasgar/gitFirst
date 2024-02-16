package ejemplo;

import java.util.ArrayList;
import java.util.Iterator;

public class Grupo implements Iterable<Alumno> {
	private String nombre;
	private ArrayList<Alumno> alumnos;

	public Grupo(String nombre) {
		this.nombre = nombre;
		this.alumnos = new ArrayList<>();
	}


	@Override
	public Iterator<Alumno> iterator() {
		//return new alumnos.iterator();
		return new IteratorGroup();
	}
}
