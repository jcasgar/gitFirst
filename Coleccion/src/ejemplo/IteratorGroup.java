package ejemplo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorGroup  implements Iterator<Alumno>{
	private int posicion = 0;
	private ArrayList<Alumno> alumnos;

	public void IteratorGrupo(ArrayList<Alumno> alumnos) {
	        this.alumnos = alumnos;
	    }

	@Override
	public boolean hasNext() {
		//return posicion < alumnos.size();
		
		while (posicion < alumnos.size() && alumnos.get(posicion).getNia() == null) {
			posicion++;
		}
			return posicion < alumnos.size();
	}

	@Override
	public Alumno next() {
		return alumnos.get(posicion++);
	}

	@Override
	public void remove() {
		alumnos.remove(--posicion);
	}

}
